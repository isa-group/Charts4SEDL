//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.18 a las 12:23:48 PM CEST 
//


package es.us.isa.sedl.core.analysis.statistic.module.statcharts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Clase Java para ScatterPlotResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ScatterPlotResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore}StatisticalChartResult">
 *       &lt;sequence>
 *         &lt;element name="scatterPlot" type="{http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore}ScatterPlot"/>
 *         &lt;element name="series" type="{http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore}Serie" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScatterPlotResult", propOrder = {
    "scatterPlot",
    "series"
})
public class ScatterPlotResult
    extends StatisticalChartResult
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected ScatterPlot scatterPlot;
    @XmlElement(required = true)
    protected List<Serie> series;

    /**
     * Obtiene el valor de la propiedad scatterPlot.
     * 
     * @return
     *     possible object is
     *     {@link ScatterPlot }
     *     
     */
    public ScatterPlot getScatterPlot() {
        return scatterPlot;
    }

    /**
     * Define el valor de la propiedad scatterPlot.
     * 
     * @param value
     *     allowed object is
     *     {@link ScatterPlot }
     *     
     */
    public void setScatterPlot(ScatterPlot value) {
        this.scatterPlot = value;
    }

    /**
     * Gets the value of the series property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the series property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Serie }
     * 
     * 
     */
    public List<Serie> getSeries() {
        if (series == null) {
            series = new ArrayList<Serie>();
        }
        return this.series;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ScatterPlotResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ScatterPlotResult that = ((ScatterPlotResult) object);
        {
            ScatterPlot lhsScatterPlot;
            lhsScatterPlot = this.getScatterPlot();
            ScatterPlot rhsScatterPlot;
            rhsScatterPlot = that.getScatterPlot();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scatterPlot", lhsScatterPlot), LocatorUtils.property(thatLocator, "scatterPlot", rhsScatterPlot), lhsScatterPlot, rhsScatterPlot)) {
                return false;
            }
        }
        {
            List<Serie> lhsSeries;
            lhsSeries = (((this.series!= null)&&(!this.series.isEmpty()))?this.getSeries():null);
            List<Serie> rhsSeries;
            rhsSeries = (((that.series!= null)&&(!that.series.isEmpty()))?that.getSeries():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "series", lhsSeries), LocatorUtils.property(thatLocator, "series", rhsSeries), lhsSeries, rhsSeries)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            ScatterPlot theScatterPlot;
            theScatterPlot = this.getScatterPlot();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scatterPlot", theScatterPlot), currentHashCode, theScatterPlot);
        }
        {
            List<Serie> theSeries;
            theSeries = (((this.series!= null)&&(!this.series.isEmpty()))?this.getSeries():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "series", theSeries), currentHashCode, theSeries);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof ScatterPlotResult) {
            final ScatterPlotResult copy = ((ScatterPlotResult) draftCopy);
            if (this.scatterPlot!= null) {
                ScatterPlot sourceScatterPlot;
                sourceScatterPlot = this.getScatterPlot();
                ScatterPlot copyScatterPlot = ((ScatterPlot) strategy.copy(LocatorUtils.property(locator, "scatterPlot", sourceScatterPlot), sourceScatterPlot));
                copy.setScatterPlot(copyScatterPlot);
            } else {
                copy.scatterPlot = null;
            }
            if ((this.series!= null)&&(!this.series.isEmpty())) {
                List<Serie> sourceSeries;
                sourceSeries = (((this.series!= null)&&(!this.series.isEmpty()))?this.getSeries():null);
                @SuppressWarnings("unchecked")
                List<Serie> copySeries = ((List<Serie> ) strategy.copy(LocatorUtils.property(locator, "series", sourceSeries), sourceSeries));
                copy.series = null;
                if (copySeries!= null) {
                    List<Serie> uniqueSeriesl = copy.getSeries();
                    uniqueSeriesl.addAll(copySeries);
                }
            } else {
                copy.series = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ScatterPlotResult();
    }

}
