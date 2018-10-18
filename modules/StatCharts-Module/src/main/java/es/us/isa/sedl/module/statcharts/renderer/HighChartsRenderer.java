/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.module.statcharts.renderer;

import es.us.isa.sedl.core.analysis.statistic.module.statcharts.BoxPlotResult;
import es.us.isa.sedl.core.analysis.statistic.module.statcharts.HistogramResult;
import es.us.isa.sedl.core.analysis.statistic.module.statcharts.StatisticalChartResult;
import java.util.UUID;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;


/**
 *
 * @author Jose Antonio Parejo
 */
public class HighChartsRenderer extends AbstractChartsRenderer {

    public static final String templateFileName="templates/HighCharts.stg";
    
    private STGroup group;    

    public HighChartsRenderer() {
        group = new STGroupFile(templateFileName);
        group.registerRenderer(BoxPlotResult.class, new BoxplotOutliersRenderer());
    }
    
    
    protected String render(StatisticalChartResult result,String chartType) {
        String identifier = UUID.randomUUID().toString().replace("-", "");
        StringBuilder sb = new StringBuilder("<div id=\"" + identifier + "\"/>\n");         
        sb.append("<script type=\"text/javascript\">\n");
        sb.append("//@ sourceURL=renderChart"+identifier+".js \n");
        sb.append(generateRenderingFunction(result,identifier,chartType));        
        sb.append("</script>\n");
        sb.append("<script type=\"text/javascript\">\n");
        sb.append("//@ sourceURL=loadChart.js \n");
        // This line tells Chrome to interpret this dinamically loaded javascrit
        // as a file (useful for debugging).        
        sb.append(generateDinamicLoadingFunction(identifier));        
        sb.append("</script>\n");
        
        return sb.toString();
    }    
    private String generateDinamicLoadingFunction(String identifier) {
        ST st=group.getInstanceOf("dinamicLoadingFunction");
        st.add("identifier", identifier);
        return st.render();
    }

    private String generateRenderingFunction(StatisticalChartResult result,String 
            identifier,String chartType) {
        String renderResult="";
        ST st=group.getInstanceOf(chartType);        
        if(st!=null){
            st.add("identifier", identifier);
            if(result instanceof HistogramResult)
                st.add("normal",generateNormalDistribution((HistogramResult)result));
            st.add("result", result);
            renderResult=st.render();
        }else
            renderResult="[ERROR] Unable to render Chart of type '"+chartType+"' rendering template not found!";
        return renderResult;
    }        

    private String [][] generateNormalDistribution(HistogramResult histogramResult) {
        Integer total=0;
        for(String value:histogramResult.getCounts())
            total+=Integer.valueOf(value);
        Double mean=Double.valueOf(histogramResult.getMean());
        Double sigma=Double.valueOf(histogramResult.getSigma());
        NormalDistribution normal=new NormalDistribution(mean, sigma);
        Double [] xPoints={-3.2807020192309,-3.0425988742109,-2.8044957291909,
                           -2.5663925841709,-2.3282894391509,-2.0901862941309,
                           -1.8520831491109,-1.6139800040909,-1.3758768590709,
                           -1.1377737140509,-0.89967056903087,-0.66156742401087,
                           -0.42346427899086,-0.18536113397085,0.052742011049155,
                           0.29084515606916,0.52894830108917,0.76705144610918,
                           1.0051545911292,1.2432577361492,1.4813608811692,
                           1.7194640261892,1.9575671712092,2.1956703162292,
                           2.4337734612492,2.6718766062692,2.9099797512892,
                           3.1480828963092};
        String [][]result=new String[xPoints.length][2];
        for(int i=0;i<xPoints.length;i++){
            result[i][0]=String.valueOf(mean+xPoints[i]*sigma);
            result[i][1]=String.valueOf(normal.density(mean+xPoints[i]*sigma)*total);
        }
        return result;
    }
    

}
