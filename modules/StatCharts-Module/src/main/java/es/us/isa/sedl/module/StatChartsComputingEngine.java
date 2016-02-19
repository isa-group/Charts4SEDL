/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.module;

import es.us.isa.jdataset.Column;
import es.us.isa.sedl.analysis.operations.information.computestats.StatisticalAnalysisOperation;
import es.us.isa.sedl.analysis.operations.information.computestats.UnsupportedStatisticException;
import es.us.isa.sedl.analysis.operations.information.computestats.engine.DescriptiveStatisticsComputingEngine;
import es.us.isa.sedl.analysis.operations.information.computestats.engine.StatisticComputingEnginePlugin;
import es.us.isa.sedl.core.analysis.statistic.Statistic;
import es.us.isa.sedl.core.analysis.statistic.StatisticalAnalysisResult;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import statcharts.es.us.isa.sedl.module.statcharts.BoxPlot;
import statcharts.es.us.isa.sedl.module.statcharts.BoxPlotResult;
import statcharts.es.us.isa.sedl.module.statcharts.Histogram;
import statcharts.es.us.isa.sedl.module.statcharts.HistogramResult;
import statcharts.es.us.isa.sedl.module.statcharts.Outlier;
import statcharts.es.us.isa.sedl.module.statcharts.PieChart;
import statcharts.es.us.isa.sedl.module.statcharts.PieChartResult;
import statcharts.es.us.isa.sedl.module.statcharts.ScatterPlot;
import statcharts.es.us.isa.sedl.module.statcharts.ScatterPlotResult;
import statcharts.es.us.isa.sedl.module.statcharts.Serie;
import statcharts.es.us.isa.sedl.module.statcharts.SerieBox;
import statcharts.es.us.isa.sedl.module.statcharts.StatisticalChart;

/**
 *
 * @author Jose Antonio Parejo
 */
public class StatChartsComputingEngine implements StatisticComputingEnginePlugin {

    private DescriptiveStatisticsComputingEngine dsce;

    public StatChartsComputingEngine() {
        dsce = new DescriptiveStatisticsComputingEngine();
    }

    @Override
    public boolean isSupported(Statistic s) {
        return s instanceof StatisticalChart;
    }

    @Override
    public List<StatisticalAnalysisResult> compute(StatisticalAnalysisOperation operation) throws UnsupportedStatisticException {
        List<StatisticalAnalysisResult> result=null;
        if(!(operation.getStatistic() instanceof StatisticalChart))
            return Collections.EMPTY_LIST;
        StatisticalChart chart=(StatisticalChart)operation.getStatistic();
        if(chart instanceof Histogram)
            result=computeHistogram(operation);
        else if(chart instanceof ScatterPlot)
            result=computeScatterPlot(operation);
        else if(chart instanceof BoxPlot)
            result=computeBoxPlot(operation);
        else if(chart instanceof PieChart)
            result=computePieCharts(operation);
        return result;
    }

    private List<StatisticalAnalysisResult> computeHistogram(StatisticalAnalysisOperation operation) {
        List<StatisticalAnalysisResult> result = new ArrayList<StatisticalAnalysisResult>();
        Histogram histogram = (Histogram) operation.getStatistic();
        HistogramResult histResult = null;
        for (Column<?> c : operation.getDataset().getColumns()) {
            histResult = computeHistogram(histogram, c);
            if (histResult != null) {
                result.add(histResult);
            }
        }
        return result;

    }

    public HistogramResult computeHistogram(Histogram h, Column<?> c) {
        HistogramResult result = null;
        if (Number.class.isAssignableFrom(c.getType())) {
            result = computeNumericHistogram(h, (Column<? extends Number>) c);
        } else {
            result = computeEnumHistogram(h, (Column<? extends Number>) c);
        }
        return result;
    }
    
    public HistogramResult computeEnumHistogram(Histogram h, Column<?> c) {
        HistogramResult result = new HistogramResult();
        Set<String> values=new HashSet<String>();
        for(Object o:c)
            if(o!=null)
            values.add(o.toString());
        result.setHistogram(h);        
        Integer nBins = values.size();                
        int[] counts = new int[nBins];
        int index=0;
        for (String value:values) {            
            result.getBinThesholds().add(value);        
            for (Object o : c) {
                if(o!=null)
                    if(o.toString().equals(value))
                        counts[index]++;
            }
            index++;
        }
                
        for (Integer i : counts) {
            result.getCounts().add(i.toString());
        }
        return result;
    }

    public HistogramResult computeNumericHistogram(Histogram h, Column<? extends Number> c) {
        HistogramResult result = new HistogramResult();
        result.setHistogram(h);
        Double max = dsce.computeMax(c);
        Double min = dsce.computeMin(c);
        Double mean = dsce.computeMean(c);
        Double sigma = dsce.computeStandartdDeviation(c);
        Integer nBins = null;
        if (h.getNBins() != null) {
            nBins = Integer.valueOf(h.getNBins());
        }
        if (nBins == null) {
            nBins = computeNBins(c);
        }
        Double increment = (max - min) / nBins;
        double[] ranges = new double[nBins + 1];
        Double value = min;
        ranges[0] = value;        
        DecimalFormat df = new DecimalFormat("#.00",DecimalFormatSymbols.getInstance(Locale.US)); 
        result.getBinThesholds().add(df.format(value));
        for (int i = 0; i < nBins; i++) {                        
            value += increment;
            ranges[i + 1] = value;            
            result.getBinThesholds().add(df.format(value));
        }
        int[] counts = new int[nBins];
        for (Number n : c) {
            for (int i = 0; i < nBins; i++) {
                if (n.doubleValue() >= ranges[i] && n.doubleValue() <= ranges[i + 1]) {
                    counts[i] = counts[i] + 1;
                    break;
                }
            }
        }        
        for (Integer i : counts) {
            result.getCounts().add(i.toString());
        }        
        result.setMean(String.valueOf(mean));
        result.setSigma(String.valueOf(sigma));
        return result;
    }

    /**
     * We compute the number of bins, using the Rice rule as specified in:
     * http://en.wikipedia.org/wiki/Histogram
     *
     * @param c Columns for which the histogram will be computed.
     * @return number of bins for the histogram
     */
    public Integer computeNBins(Column<?> c) {
        double n = (double) c.size();
        int result = (int) Math.ceil(2.0 * Math.pow(n, 1.0 / 3.0));
        return result;
    }

    public List<StatisticalAnalysisResult> computeBoxPlot(StatisticalAnalysisOperation operation) {
        List<StatisticalAnalysisResult> result=new ArrayList<StatisticalAnalysisResult>();
        BoxPlotResult bpresult = new BoxPlotResult();
        bpresult.setBoxPlot((BoxPlot) operation.getStatistic());
        for (Column c : operation.getDataset().getColumns()) {
            bpresult.getSerieBoxes().add(computeSerieBox(c));
        }
        result.add(bpresult);
        return result;
    }

    public SerieBox computeSerieBox(Column<? extends Number> column) {
        SerieBox result = new SerieBox();
        result.setName(column.getName());
        List<Double> params = dsce.sort(column);
        int index1, index2, index3;
        Double n = new Double(column.size());
        Double q1 = (n * 1.0) / 4.0;
        Double q2 = (n * 2.0) / 4.0;
        Double q3 = (n * 3.0) / 4.0;
        String decimal1 = q1.toString().split("\\.")[1];
        String decimal2 = q2.toString().split("\\.")[1];
        String decimal3 = q3.toString().split("\\.")[1];
        if (new Integer(decimal1) < 5) {
            index1 = new Integer(q1.toString().split("\\.")[0]) - 1;
        } else {
            index1 = new Integer(q1.toString().split("\\.")[0]) + 1 - 1;
        }
        if (new Integer(decimal2) < 5) {
            index2 = new Integer(q2.toString().split("\\.")[0]) - 1;
        } else {
            index2 = new Integer(q2.toString().split("\\.")[0]) + 1 - 1;
        }
        if (new Integer(decimal3) < 5) {
            index3 = new Integer(q3.toString().split("\\.")[0]) - 1;
        } else {
            index3 = new Integer(q3.toString().split("\\.")[0]) + 1 - 1;
        }
        q1 = params.get(index1);
        q2 = params.get(index2);
        q3 = params.get(index3);
        Double q0=computeQ0(q1,q3,column);
        Double q4=computeQ4(q1,q3,column);
        result.getQuartiles().add(q0.toString());
        result.getQuartiles().add(q1.toString());
        result.getQuartiles().add(q2.toString());
        result.getQuartiles().add(q3.toString());
        result.getQuartiles().add(q4.toString());
        computeOutliers(column,result,q1,q3);
        Double sigma = dsce.computeStandartdDeviation(column);
        result.setStandardDeviation(sigma.toString());
        return result;
    }
    
    private Double computeQ0(Double q1, Double q3, Column<? extends Number> column)
    {
        Double IQR=q3-q1;
        Double threshold=q1-1.5*IQR;
        Double result=q1;
        for(Number value:column)
        {
            if(value !=null && value.doubleValue()<result && value.doubleValue()>=threshold)
            {
                result=value.doubleValue();
            }
        }
        return result;
    }
    
    private Double computeQ4(Double q1, Double q3, Column<? extends Number> column)
    {
        Double IQR=q3-q1;
        Double threshold=q3+1.5*IQR;
        Double result=q1;
        for(Number value:column)
        {
            if(value !=null && value.doubleValue()>result && value.doubleValue()<=threshold)
            {
                result=value.doubleValue();
            }
        }
        return result;
    }
    
    private void computeOutliers(Column<? extends Number> column,SerieBox serie,Double q1,Double q3)
    {
        Double minTreshold=q1-1.5*(q3-q1);
        Double maxTreshold=q3+1.5*(q3-q1);
        Integer index=0;
        Outlier outlier=null;
        for(Number n:column){
            if(n.doubleValue()<=minTreshold || n.doubleValue()>=maxTreshold)
            {
                outlier=new Outlier();
                serie.getOutliers().add(outlier);
                outlier.setId(index.toString());
                outlier.setValue(n.toString());
            }
            index++;
        }
    }

    public PieChartResult computePieChart(StatisticalAnalysisOperation operation) {
        return null;
    }

    public List<StatisticalAnalysisResult> computeScatterPlot(StatisticalAnalysisOperation operation) {
        List<StatisticalAnalysisResult> result=new ArrayList<StatisticalAnalysisResult>();
        ScatterPlotResult scpResult=new ScatterPlotResult();
        scpResult.setScatterPlot((ScatterPlot)operation.getStatistic());
        
        scpResult.setDatasetSpecification(operation.getStatistic().getDatasetSpecification());
        Column x=operation.getDataset().getColumn(scpResult.getScatterPlot().getXAxisColumn());
        Column labels=operation.getDataset().getColumn(scpResult.getScatterPlot().getLabelsColumn());
        for(Column c:operation.getDataset().getColumns())
            scpResult.getSeries().add(generateSeries(c,x,labels));
        result.add(scpResult);
        return result;
    }

    private Serie generateSeries(Column<? extends Number> c, Column<?> x, Column<?> labels) {
        Serie result=new Serie();
        result.setName(c.getName());
        Integer i=0;
        for(Number n:c){
            result.getY().add(n.toString());
            if(labels==null)
                result.getLabels().add(i.toString());
        }
        for(Object o:x)
           result.getX().add(o.toString());
        if(labels!=null)
            for(Object l:labels)
                result.getLabels().add(l.toString());
        return result;                
    }

    @Override
    public Class<? extends Statistic> supportedStatistic() {
        return StatisticalChart.class;
    }

    private List<StatisticalAnalysisResult> computePieCharts(StatisticalAnalysisOperation operation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
