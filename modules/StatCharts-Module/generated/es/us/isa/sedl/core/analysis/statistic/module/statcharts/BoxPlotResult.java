//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.07.12 a las 11:40:25 AM CEST 
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
 * <p>Clase Java para BoxPlotResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BoxPlotResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore}StatisticalChartResult">
 *       &lt;sequence>
 *         &lt;element name="boxPlot" type="{http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore}BoxPlot"/>
 *         &lt;element name="serieBoxes" type="{http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore}SerieBox" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoxPlotResult", propOrder = {
    "boxPlot",
    "serieBoxes"
})
public class BoxPlotResult
    extends StatisticalChartResult
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected BoxPlot boxPlot;
    @XmlElement(required = true)
    protected List<SerieBox> serieBoxes;

    /**
     * Obtiene el valor de la propiedad boxPlot.
     * 
     * @return
     *     possible object is
     *     {@link BoxPlot }
     *     
     */
    public BoxPlot getBoxPlot() {
        return boxPlot;
    }

    /**
     * Define el valor de la propiedad boxPlot.
     * 
     * @param value
     *     allowed object is
     *     {@link BoxPlot }
     *     
     */
    public void setBoxPlot(BoxPlot value) {
        this.boxPlot = value;
    }

    /**
     * Gets the value of the serieBoxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serieBoxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerieBoxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SerieBox }
     * 
     * 
     */
    public List<SerieBox> getSerieBoxes() {
        if (serieBoxes == null) {
            serieBoxes = new ArrayList<SerieBox>();
        }
        return this.serieBoxes;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof BoxPlotResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final BoxPlotResult that = ((BoxPlotResult) object);
        {
            BoxPlot lhsBoxPlot;
            lhsBoxPlot = this.getBoxPlot();
            BoxPlot rhsBoxPlot;
            rhsBoxPlot = that.getBoxPlot();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "boxPlot", lhsBoxPlot), LocatorUtils.property(thatLocator, "boxPlot", rhsBoxPlot), lhsBoxPlot, rhsBoxPlot)) {
                return false;
            }
        }
        {
            List<SerieBox> lhsSerieBoxes;
            lhsSerieBoxes = (((this.serieBoxes!= null)&&(!this.serieBoxes.isEmpty()))?this.getSerieBoxes():null);
            List<SerieBox> rhsSerieBoxes;
            rhsSerieBoxes = (((that.serieBoxes!= null)&&(!that.serieBoxes.isEmpty()))?that.getSerieBoxes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serieBoxes", lhsSerieBoxes), LocatorUtils.property(thatLocator, "serieBoxes", rhsSerieBoxes), lhsSerieBoxes, rhsSerieBoxes)) {
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
            BoxPlot theBoxPlot;
            theBoxPlot = this.getBoxPlot();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "boxPlot", theBoxPlot), currentHashCode, theBoxPlot);
        }
        {
            List<SerieBox> theSerieBoxes;
            theSerieBoxes = (((this.serieBoxes!= null)&&(!this.serieBoxes.isEmpty()))?this.getSerieBoxes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serieBoxes", theSerieBoxes), currentHashCode, theSerieBoxes);
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
        if (draftCopy instanceof BoxPlotResult) {
            final BoxPlotResult copy = ((BoxPlotResult) draftCopy);
            if (this.boxPlot!= null) {
                BoxPlot sourceBoxPlot;
                sourceBoxPlot = this.getBoxPlot();
                BoxPlot copyBoxPlot = ((BoxPlot) strategy.copy(LocatorUtils.property(locator, "boxPlot", sourceBoxPlot), sourceBoxPlot));
                copy.setBoxPlot(copyBoxPlot);
            } else {
                copy.boxPlot = null;
            }
            if ((this.serieBoxes!= null)&&(!this.serieBoxes.isEmpty())) {
                List<SerieBox> sourceSerieBoxes;
                sourceSerieBoxes = (((this.serieBoxes!= null)&&(!this.serieBoxes.isEmpty()))?this.getSerieBoxes():null);
                @SuppressWarnings("unchecked")
                List<SerieBox> copySerieBoxes = ((List<SerieBox> ) strategy.copy(LocatorUtils.property(locator, "serieBoxes", sourceSerieBoxes), sourceSerieBoxes));
                copy.serieBoxes = null;
                if (copySerieBoxes!= null) {
                    List<SerieBox> uniqueSerieBoxesl = copy.getSerieBoxes();
                    uniqueSerieBoxesl.addAll(copySerieBoxes);
                }
            } else {
                copy.serieBoxes = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new BoxPlotResult();
    }

}
