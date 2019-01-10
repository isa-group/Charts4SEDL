/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.modules.statcharts.grammar;

import es.us.isa.sedl.module.statcharts.grammar.StatChartsModuleMarshaller;
import es.us.isa.sedl.core.analysis.datasetspecification.DatasetSpecification;
import es.us.isa.sedl.core.analysis.datasetspecification.Projection;
import es.us.isa.sedl.core.analysis.datasetspecification.ValuationFilter;
import es.us.isa.sedl.core.analysis.statistic.module.statcharts.Histogram;
import es.us.isa.sedl.core.analysis.statistic.module.statcharts.StatisticalChart;
import es.us.isa.sedl.core.design.ControllableFactor;
import es.us.isa.sedl.core.design.Level;
import es.us.isa.sedl.core.design.VariableValuation;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Jose Antonio Parejo
 */
public class StatChartsModuleMarshallerTest {
    
    public StatChartsModuleMarshallerTest() {
    }

    /**
     * Test of asString method, of class StatChartsModuleMarshaller.
     */
    @Test
    public void testAsString() {
        String modulePrefix="StatCharts";
        DatasetSpecification dspec=buildDatasetSpecification();
        StatisticalChart chart=new Histogram();
        chart.setDatasetSpecification(dspec);
        StatChartsModuleMarshaller instance=new StatChartsModuleMarshaller();        
        String result=instance.asString(chart, modulePrefix);
        String expectedResult="StatCharts::Histogram  where factor1=1 ";
        assertEquals(expectedResult,result);        
        
    }
    
    
    @Test
    public void testAsString2() {
        String modulePrefix="StatCharts";
        DatasetSpecification dspec=buildDatasetSpecification();
        Projection projection=new Projection();
        projection.getProjectedVariables().add("v1");
        dspec.getProjections().add(projection);
        StatisticalChart chart=new Histogram();
        chart.setDatasetSpecification(dspec);
        StatChartsModuleMarshaller instance=new StatChartsModuleMarshaller();        
        String result=instance.asString(chart, modulePrefix);
        String expectedResult="StatCharts::Histogram  of v1 where factor1=1 ";
        assertEquals(expectedResult,result);        
        
    }

    private DatasetSpecification buildDatasetSpecification() {
        DatasetSpecification result=new DatasetSpecification();        
        ControllableFactor factor1=new ControllableFactor();
        factor1.setName("factor1");
        VariableValuation vv=new VariableValuation();
        vv.setVariable(factor1.getName());
        Level l=new Level();
        l.setValue("1");
        vv.setLevel(l.getValue());
        ValuationFilter f=new ValuationFilter();
        f.getVariableValuations().add(vv);
        result.getFilters().add(f);        
        return result;
    }
        
    
}
