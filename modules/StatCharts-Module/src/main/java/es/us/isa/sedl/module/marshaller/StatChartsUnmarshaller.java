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
import es.us.isa.sedl.core.analysis.statistic.module.statcharts.BoxPlot;
import es.us.isa.sedl.core.analysis.statistic.module.statcharts.Histogram;
import es.us.isa.sedl.core.analysis.statistic.module.statcharts.PieChart;
import es.us.isa.sedl.core.analysis.statistic.module.statcharts.ScatterPlot;
import es.us.isa.sedl.core.analysis.statistic.module.statcharts.StatisticalChart;
import es.us.isa.sedl.core.design.AnalysisSpecificationGroup;
import es.us.isa.sedl.core.design.StatisticalAnalysisSpec;
import es.us.isa.sedl.core.util.Error;
import es.us.isa.sedl.error.SEDL4PeopleError;
import es.us.isa.sedl.marshaller.analysis.statistic.DatasetSpecificationParser;
import es.us.isa.sedl.module.SEDLModuleUnmarshaller;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


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
        AnalysisSpecificationGroup aspec=findAnalysisSpecificationGroup(element,experiment);        
        if(aspec!=null){
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
