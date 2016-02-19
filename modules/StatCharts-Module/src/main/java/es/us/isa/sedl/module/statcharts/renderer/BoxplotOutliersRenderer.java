/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.module.statcharts.renderer;

import java.util.Locale;
import org.stringtemplate.v4.AttributeRenderer;
import statcharts.es.us.isa.sedl.module.statcharts.BoxPlotResult;
import statcharts.es.us.isa.sedl.module.statcharts.Outlier;
import statcharts.es.us.isa.sedl.module.statcharts.SerieBox;

/**
 *
 * @author Jose Antonio Parejo
 */
public class BoxplotOutliersRenderer implements AttributeRenderer {
    public String toString(Object o, String formatString, Locale locale) {
        BoxPlotResult boxPlotResult=(BoxPlotResult)o;
        StringBuilder sb=new StringBuilder();
        boolean printed=false;
        int index=0;
        for(SerieBox b:boxPlotResult.getSerieBoxes())
        {
            for(Outlier outlier:b.getOutliers())
            {
                if(printed)
                    sb.append(",");
                sb.append("[");
                sb.append(index);
                sb.append(",");
                sb.append(outlier.getValue());
                sb.append("]");    
                printed=true;
            }
            index++;
        }
        return sb.toString();
    }
    
}
