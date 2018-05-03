/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.module.marshaller;

import es.us.isa.sedl.marshaller.SEDL4PeopleStringTemplateMarshaller;
import es.us.isa.sedl.module.SEDLModuleMarshaller;
import es.us.isa.sedl.core.analysis.statistic.module.statcharts.AbstractStatisticalChart;
import es.us.isa.sedl.core.design.Group;
import es.us.isa.sedl.marshaller.renderers.GroupRenderer;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;


/**
 *
 * @author Jose Antonio Parejo
 */
public class StatChartsMarshaller implements SEDLModuleMarshaller<AbstractStatisticalChart> {
    List<String> errors=null;
    private SEDL4PeopleStringTemplateMarshaller marshaller;

    public StatChartsMarshaller() {
        marshaller=new SEDL4PeopleStringTemplateMarshaller();        
    }
    
    
    
    @Override
    public List<String> write(AbstractStatisticalChart extensionPointRealization, OutputStream os, String modulePrefix) throws IOException {
        os.write(asString(extensionPointRealization,modulePrefix).getBytes(Charset.forName("UTF-8")));
        return errors;
    }

    @Override
    public String asString(AbstractStatisticalChart extensionPointRealization, String modulePrefix) {
        errors=new ArrayList<String>();
        String stringTemplatesFolder="templates";
        STGroupFile group=new STGroupFile("templates/StatCharts.stg");
        group.registerRenderer(Group.class, GroupRenderer.getInstance());
        ST template=group.getInstanceOf("statistic");
        template.add("s",extensionPointRealization);        
        return modulePrefix+"::"+template.render();
    }

    public List<String> getErrors() {
        return errors;
    }
    
    
    
}
