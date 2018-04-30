
package es.us.isa.sedl.module.statcharts.grammar;

import es.es.isa.sedl.module.statcharts.grammar.StatChartsBaseListener;
import es.es.isa.sedl.module.statcharts.grammar.StatChartsLexer;
import es.es.isa.sedl.module.statcharts.grammar.StatChartsParser;
import es.us.isa.sedl.core.BasicExperiment;
import es.us.isa.sedl.core.Experiment;
import es.us.isa.sedl.core.ExtensionPointElement;
import es.us.isa.sedl.core.analysis.datasetspecification.DatasetSpecification;
import es.us.isa.sedl.core.design.AnalysisSpecification;
import es.us.isa.sedl.core.design.AnalysisSpecificationGroup;
import es.us.isa.sedl.core.design.StatisticalAnalysisSpec;
import es.us.isa.sedl.core.util.Error;
import es.us.isa.sedl.grammar.SEDL4PeopleParser;
import es.us.isa.sedl.marshaller.SEDL4PeopleExtendedListener;
import es.us.isa.sedl.module.SEDLModuleUnmarshaller;
import java.util.Collection;
import org.antlr.v4.runtime.misc.NotNull;
import statcharts.es.us.isa.sedl.module.statcharts.BoxPlot;
import statcharts.es.us.isa.sedl.module.statcharts.Histogram;
import statcharts.es.us.isa.sedl.module.statcharts.PieChart;
import statcharts.es.us.isa.sedl.module.statcharts.ScatterPlot;
import statcharts.es.us.isa.sedl.module.statcharts.StatisticalChart;
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
        StatisticalAnalysisSpec spec = findAnalysisSpec(specName);
        if (spec != null) {
            spec.getStatistic().add(chart);
        } else {
            result.add(new Error(0, Error.ERROR_SEVERITY.ERROR, "Unable to find statistical analysis specification with id='" + element.getElementIdentifier() + "'"));
        }
        return result;
    }

    private StatisticalAnalysisSpec findAnalysisSpec(String elementIdentifier) {
        StatisticalAnalysisSpec spec = null;
        for (AnalysisSpecificationGroup candidateGroup : experiment.getDesign().getExperimentalDesign().getIntendedAnalyses()) {
            for(AnalysisSpecification candidate: candidateGroup.getAnalyses()){
                if (candidate.getId().equals(elementIdentifier) && candidate instanceof StatisticalAnalysisSpec) {
                    spec = (StatisticalAnalysisSpec) candidate;
                    break;
                }
            }
        }
        return spec;
    }
}
