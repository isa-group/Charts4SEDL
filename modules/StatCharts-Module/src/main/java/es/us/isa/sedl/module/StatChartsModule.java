/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.module;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import es.us.isa.sedl.core.EmpiricalStudy;

import es.us.isa.sedl.module.statcharts.grammar.StatChartsModuleMarshaller;
import es.us.isa.sedl.module.statcharts.grammar.StatChartsModuleUnmarshaller;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Jose Antonio Parejo
 */
public class StatChartsModule extends BaseSEDLModule implements SEDLModule {
   private static final Set<String> moduleNames=Sets.newHashSet("StatCharts","Charts");
   private static final List<Class<? extends EmpiricalStudy>> applicableExperimentTypes=Lists.newArrayList();
   
   public StatChartsModule()
   {
       super(moduleNames, applicableExperimentTypes);       
       this.getMarshallers().put("SEDL4People", new StatChartsModuleMarshaller());
       this.getUnmarshallers().put("SEDL4People", new StatChartsModuleUnmarshaller());
   }
    
}
