/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.module.marshaller;

import es.us.isa.sedl.core.BasicExperiment;
import es.us.isa.sedl.core.Experiment;
import es.us.isa.sedl.core.ExtensionPointElement;
import es.us.isa.sedl.core.analysis.datasetspecification.DatasetSpecification;
import es.us.isa.sedl.core.analysis.statistic.StatisticalAnalysisSpec;
import es.us.isa.sedl.core.design.AnalysisSpecification;
import es.us.isa.sedl.core.util.Error;
import es.us.isa.sedl.marshaller.analysis.statistic.DatasetSpecificationParser;
import es.us.isa.sedl.module.SEDLModuleUnmarshaller;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import statcharts.es.us.isa.sedl.module.statcharts.BoxPlot;
import statcharts.es.us.isa.sedl.module.statcharts.Histogram;
import statcharts.es.us.isa.sedl.module.statcharts.PieChart;
import statcharts.es.us.isa.sedl.module.statcharts.ScatterPlot;
import statcharts.es.us.isa.sedl.module.statcharts.StatisticalChart;

/**
 *
 * @author Jose Antonio Parejo
 */
public class StatChartsUnmarshaller implements SEDLModuleUnmarshaller {

    DatasetSpecificationParser dssParser;

    public StatChartsUnmarshaller() {
        dssParser=new DatasetSpecificationParser();
    }
    
    
            
    @Override
    public Collection<? extends Error> unmarshall(ExtensionPointElement element, Experiment experiment) {
        List<Error> result=new ArrayList<Error>();
        String content=element.getContent();
        int index=content.indexOf(" ");        
        String chartName=content.substring(0, index).replace(":", "");
        StatisticalChart chart=null;
        if("histogram".equalsIgnoreCase(chartName))
        {                
            chart=new Histogram();
        }else if("boxplot".equalsIgnoreCase(chartName)){
            chart=new BoxPlot();
        }else if("plot".equalsIgnoreCase(chartName) || "scatterPlot".equalsIgnoreCase(chartName)){
            chart=new ScatterPlot();
        }else if("piechart".equalsIgnoreCase(chartName)){
            chart=new PieChart();
        }else{
            result.add(new Error(0,Error.ERROR_SEVERITY.ERROR, chartName+" is not a recognized chart type"));
        }
        DatasetSpecification dss=dssParser.parse(content.substring(index+1), null);
        chart.setDatasetSpecification(dss);
        AnalysisSpecification aspec=((BasicExperiment)experiment).getDesign().getExperimentalDesign().getIntendedAnalyses().get(0);
        if(aspec instanceof StatisticalAnalysisSpec)
            ((StatisticalAnalysisSpec)aspec).getStatistic().add(chart);
        return result;
    }
    
}
