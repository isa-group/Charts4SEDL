/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.module.statcharts.grammar;

import es.us.isa.sedl.core.design.Group;
import es.us.isa.sedl.marshaller.renderers.GroupRenderer;
import es.us.isa.sedl.module.SEDLModuleMarshaller;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;
import statcharts.es.us.isa.sedl.module.statcharts.StatisticalChart;


public class StatChartsModuleMarshaller implements SEDLModuleMarshaller<StatisticalChart>{
    List<String> errors=null;
    @Override
    public List<String> write(StatisticalChart extensionPointRealization, OutputStream os, String modulePrefix) throws IOException {
        String textToWrite=asString(extensionPointRealization,modulePrefix);
        PrintWriter writer=new PrintWriter(new OutputStreamWriter(os));
        writer.write(textToWrite);
        writer.close();
        return errors;
    }

    @Override
    public String asString(StatisticalChart extensionPointRealization, String modulePrefix) {
        errors=new ArrayList<String>();
        String stringTemplatesFolder="templates";
        STGroupFile group=new STGroupFile("templates/StatCharts.stg");
        group.registerRenderer(Group.class, GroupRenderer.getInstance());
        ST template=group.getInstanceOf("statistic");
        template.add("s",extensionPointRealization);        
        return modulePrefix+"::"+template.render();
    }
    
}
