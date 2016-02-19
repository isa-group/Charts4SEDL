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

import es.us.isa.sedl.core.BasicExperiment;
import es.us.isa.sedl.core.ExtensionPointElement;
import es.us.isa.sedl.core.analysis.statistic.StatisticalAnalysisSpec;
import es.us.isa.sedl.core.design.Design;
import es.us.isa.sedl.core.design.FullySpecifiedExperimentalDesign;
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
        BasicExperiment experiment = createExperiment();
        StatChartsModuleUnmarshaller instance = new StatChartsModuleUnmarshaller();
        Collection<? extends Error> expResult = Collections.EMPTY_LIST;
        Collection<? extends Error> result = instance.unmarshall(element, experiment);
        assertEquals(expResult, result);
        StatisticalAnalysisSpec sa=(StatisticalAnalysisSpec)experiment.getDesign().getExperimentalDesign().getIntendedAnalyses().get(0);
        assertEquals(sa.getStatistic().size(),1);
        
    }    

    private BasicExperiment createExperiment() {
        BasicExperiment result=new BasicExperiment();
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
