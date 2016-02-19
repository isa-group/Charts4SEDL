/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.module.statcharts.renderer;

import es.us.isa.sedl.analysis.operations.information.computestats.renderer.StatisticalResultsRenderingPlugin;
import es.us.isa.sedl.core.analysis.statistic.StatisticalAnalysisResult;
import statcharts.es.us.isa.sedl.module.statcharts.BoxPlotResult;
import statcharts.es.us.isa.sedl.module.statcharts.HistogramResult;
import statcharts.es.us.isa.sedl.module.statcharts.PieChartResult;
import statcharts.es.us.isa.sedl.module.statcharts.ScatterPlotResult;
import statcharts.es.us.isa.sedl.module.statcharts.StatisticalChartResult;

/**
 *
 * @author Jose Antonio Parejo
 */
public abstract class AbstractChartsRenderer implements StatisticalResultsRenderingPlugin {

    @Override
    public Class<? extends StatisticalAnalysisResult> getRenderingClass() {
        return StatisticalChartResult.class;
    }

    @Override
    public String render(StatisticalAnalysisResult statresult) {
        String result=null;
        if(statresult instanceof StatisticalChartResult)
            result=render((StatisticalChartResult)statresult,statresult.getClass().getSimpleName().replace("Result", ""));
        return result;
    }

    protected abstract String render(StatisticalChartResult result,String chartType);    
    
}
