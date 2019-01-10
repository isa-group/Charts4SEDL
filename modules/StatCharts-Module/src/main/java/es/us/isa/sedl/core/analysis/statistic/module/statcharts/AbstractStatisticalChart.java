/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.core.analysis.statistic.module.statcharts;

import es.us.isa.sedl.core.analysis.statistic.Statistic;
import es.us.isa.sedl.module.marshaller.StatChartsMarshaller;

/**
 *
 * @author japarejo
 */
public abstract class AbstractStatisticalChart extends Statistic {
    @Override
    public String toString()
    {
        StatChartsMarshaller marshaller=new StatChartsMarshaller();
        return marshaller.asString(this, "Charts");
    }
}
