/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.modules.statcharts.grammar;

import es.us.isa.sedl.module.statcharts.grammar.StatChartsModuleUnmarshaller;
import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.Collections;

import org.junit.Test;

import es.us.isa.sedl.core.ControlledExperiment;
import es.us.isa.sedl.core.ExtensionPointElement;
import es.us.isa.sedl.core.design.AnalysisSpecificationGroup;
import es.us.isa.sedl.core.design.Design;
import es.us.isa.sedl.core.design.FullySpecifiedExperimentalDesign;
import es.us.isa.sedl.core.analysis.statistic.StatisticalAnalysisSpec;
import es.us.isa.sedl.core.util.Error;

/**
 *
 * @author Jose Antonio Parejo
 */
public class StatChartsModuleUnmarshallerTest {
    
    public StatChartsModuleUnmarshallerTest() {
    }

    /**
     * Test of unmarshall method, of class StatChartsModuleUnmarshaller.
     */
    @Test
    public void testUnmarshall() {
        System.out.println("unmarshall");
        ExtensionPointElement element = new ExtensionPointElement("chart", "Analysis", "Histogram",null);
        ControlledExperiment experiment = createExperiment();
        StatChartsModuleUnmarshaller instance = new StatChartsModuleUnmarshaller();
        Collection<? extends Error> expResult = Collections.EMPTY_LIST;
        Collection<? extends Error> result = instance.unmarshall(element, experiment);
        assertEquals(expResult, result);        
        assertEquals(experiment.getDesign().getExperimentalDesign().getIntendedAnalyses().size(),1);        
        
    }    

    private ControlledExperiment createExperiment() {
        ControlledExperiment result=new ControlledExperiment();
        Design design=new Design();
        FullySpecifiedExperimentalDesign fsed=new FullySpecifiedExperimentalDesign();
        design.setExperimentalDesign(fsed);
        result.setDesign(design);
        StatisticalAnalysisSpec as=new StatisticalAnalysisSpec();                
        fsed.getIntendedAnalyses().add(as);
        as.setId("Analysis");
        return result;
    }

    
}
