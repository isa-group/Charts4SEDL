
package es.us.isa.sedl.module.statcharts.grammar;

import es.es.isa.sedl.module.statcharts.grammar.StatChartsBaseListener;
import es.es.isa.sedl.module.statcharts.grammar.StatChartsLexer;
import es.es.isa.sedl.module.statcharts.grammar.StatChartsParser;
import es.us.isa.sedl.core.BasicExperiment;
import es.us.isa.sedl.core.Experiment;
import es.us.isa.sedl.core.ExtensionPointElement;
import es.us.isa.sedl.core.analysis.datasetspecification.DatasetSpecification;
import es.us.isa.sedl.core.analysis.statistic.module.statcharts.BoxPlot;
import es.us.isa.sedl.core.analysis.statistic.module.statcharts.Histogram;
import es.us.isa.sedl.core.analysis.statistic.module.statcharts.PieChart;
import es.us.isa.sedl.core.analysis.statistic.module.statcharts.ScatterPlot;
import es.us.isa.sedl.core.analysis.statistic.module.statcharts.StatisticalChart;
import es.us.isa.sedl.core.design.AnalysisSpecification;
import es.us.isa.sedl.core.design.AnalysisSpecificationGroup;
import es.us.isa.sedl.core.design.StatisticalAnalysisSpec;
import es.us.isa.sedl.core.util.Error;
import es.us.isa.sedl.error.SEDL4PeopleError;
import es.us.isa.sedl.grammar.SEDL4PeopleParser;
import es.us.isa.sedl.marshaller.SEDL4PeopleExtendedListener;
import es.us.isa.sedl.module.SEDLModuleUnmarshaller;
import java.util.Collection;
import org.antlr.v4.runtime.misc.NotNull;
import es.us.isa.sedl.marshaller.analysis.statistic.DatasetSpecificationParser;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class StatChartsModuleUnmarshaller extends StatChartsBaseListener implements SEDLModuleUnmarshaller {

    private StatisticalChart chart;
    DatasetSpecificationParser specParser = new DatasetSpecificationParser();
    private BasicExperiment experiment;
    private ANTLRInputStream is;

    @Override
    public Collection<? extends Error> unmarshall(ExtensionPointElement element, Experiment experiment) {
        List<Error> result = new ArrayList<Error>();
        this.experiment = (BasicExperiment) experiment;
        result.addAll(parse(element.getContent()));
        if (result.isEmpty()) {
            result.addAll(addChartToExperiment(element));
        }
        return result;
    }

    public Collection<Error> parse(String content) {
        Collection<Error> result = new ArrayList<Error>();
        is = new ANTLRInputStream(content);
        StatChartsLexer lexer = new StatChartsLexer(is);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        StatChartsParser parser = new StatChartsParser(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, parser.chart());
        parser.addParseListener(this);

        return result;
    }

    @Override
    public void enterHistogram(@NotNull StatChartsParser.HistogramContext ctx) {
        Histogram histogram = new Histogram();
        if (ctx.SIGMA_BANDS() != null) {
            histogram.setSigmaBands("true");
        }
        if (ctx.NORMAL_DISTRIBUTION() != null) {
            histogram.setNormalDistribution("true");
        }
        chart = histogram;
    }

    @Override
    public void enterBoxPlot(@NotNull StatChartsParser.BoxPlotContext ctx) {
        chart = new BoxPlot();
    }

    @Override
    public void enterScatterPlot(@NotNull StatChartsParser.ScatterPlotContext ctx) {
        ScatterPlot scatterPlot = new ScatterPlot();
        if (ctx.ID() != null) {
            scatterPlot.setXAxisColumn(ctx.ID().getText());
        }
        chart = scatterPlot;
    }

    @Override
    public void enterPieChart(@NotNull StatChartsParser.PieChartContext ctx) {
        chart = new PieChart();
    }

    @Override
    public void enterDatasetSpecification(@NotNull StatChartsParser.DatasetSpecificationContext ctx) {
        int a = ctx.start.getStartIndex();
        int b = ctx.stop.getStopIndex();
        Interval interval = new Interval(a, b);
        DatasetSpecification spec =null;
        try
        {
            String specText = is.getText(interval);
            SEDL4PeopleExtendedListener l = new SEDL4PeopleExtendedListener(null,null);
            l.setVariables(((BasicExperiment) experiment).getDesign().getVariables());
            spec = specParser.parse(specText, l);
        }catch(StringIndexOutOfBoundsException ex){
            spec=new DatasetSpecification();
        }
        if (chart != null) {
            chart.setDatasetSpecification(spec);
        }
    }

    private Collection<? extends Error> addChartToExperiment(ExtensionPointElement element) {
        List<Error> result = new ArrayList<Error>();
        String specName = element.getElementIdentifier();
        SEDL4PeopleParser.AnalysesBlockContext abc = null;
        if (element.getContext() != null) {
            abc = (SEDL4PeopleParser.AnalysesBlockContext) element.getContext().getParent().getParent();
            specName = abc.id().getText();
        }
        
        AnalysisSpecificationGroup aspec=findAnalysisSpecificationGroup(element,experiment);        
        if(aspec!=null && chart!=null){
            StatisticalAnalysisSpec sas=new StatisticalAnalysisSpec();
            sas.getStatistic().add(chart);
            aspec.getAnalyses().add(sas);
        }else{
            Error e=new SEDL4PeopleError(element.getContext().start.getLine(), 
                                            element.getContext().start.getStartIndex(), element.getContext().stop.getStopIndex(), Error.ERROR_SEVERITY.ERROR, 
                                            "Unable to find the analysis group to which the chart should be added");
            result.add(e);
        }        
        return result;
    }
    
    private AnalysisSpecificationGroup findAnalysisSpecificationGroup(ExtensionPointElement element, Experiment experiment) {
        AnalysisSpecificationGroup aspec=null;
        List<AnalysisSpecificationGroup> analysisGroups=((BasicExperiment)experiment).getDesign().getExperimentalDesign().getIntendedAnalyses();
        String analysisGroupID=null;
        if(element.getExtensionPointLocator()!=null && !element.getExtensionPointLocator().isEmpty())
            analysisGroupID=element.getExtensionPointLocator().get(0);
        if(analysisGroupID!=null && analysisGroups!=null && !analysisGroups.isEmpty()){            
            for(AnalysisSpecificationGroup ag:analysisGroups){
                if(analysisGroupID.equals(ag.getId()))
                    aspec=ag;
            }
        }
        return aspec;
    }
}
