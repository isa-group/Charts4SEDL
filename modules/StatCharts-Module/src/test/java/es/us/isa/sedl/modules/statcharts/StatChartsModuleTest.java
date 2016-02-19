/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.modules.statcharts;

import es.us.isa.sedl.module.StatChartsModule;
import es.us.isa.sedl.module.SEDLModuleRegistry;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose Antonio Parejo
 */
public class StatChartsModuleTest {
    
    public StatChartsModuleTest() {
    }

    @Test
    public void testLoading() {
        SEDLModuleRegistry registry=new SEDLModuleRegistry();
        assertTrue(registry.getSubClasses().contains(StatChartsModule.class));
    }
    
}
