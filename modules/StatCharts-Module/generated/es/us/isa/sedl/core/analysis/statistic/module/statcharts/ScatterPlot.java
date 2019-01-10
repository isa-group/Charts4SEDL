//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.18 a las 12:23:48 PM CEST 
//


package es.us.isa.sedl.core.analysis.statistic.module.statcharts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Clase Java para ScatterPlot complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ScatterPlot">
 *   &lt;complexContent>
 *     &lt;extension base="{http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore}StatisticalChart">
 *       &lt;attribute name="xAxisColumn" use="required" type="{http://www.eclipse.org/uml2/5.0.0/Types}String" />
 *       &lt;attribute name="labelsColumn" use="required" type="{http://www.eclipse.org/uml2/5.0.0/Types}String" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScatterPlot")
public class ScatterPlot
    extends StatisticalChart
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlAttribute(name = "xAxisColumn", required = true)
    protected String xAxisColumn;
    @XmlAttribute(name = "labelsColumn", required = true)
    protected String labelsColumn;

    /**
     * Obtiene el valor de la propiedad xAxisColumn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXAxisColumn() {
        return xAxisColumn;
    }

    /**
     * Define el valor de la propiedad xAxisColumn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXAxisColumn(String value) {
        this.xAxisColumn = value;
    }

    /**
     * Obtiene el valor de la propiedad labelsColumn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelsColumn() {
        return labelsColumn;
    }

    /**
     * Define el valor de la propiedad labelsColumn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelsColumn(String value) {
        this.labelsColumn = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ScatterPlot)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ScatterPlot that = ((ScatterPlot) object);
        {
            String lhsXAxisColumn;
            lhsXAxisColumn = this.getXAxisColumn();
            String rhsXAxisColumn;
            rhsXAxisColumn = that.getXAxisColumn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xAxisColumn", lhsXAxisColumn), LocatorUtils.property(thatLocator, "xAxisColumn", rhsXAxisColumn), lhsXAxisColumn, rhsXAxisColumn)) {
                return false;
            }
        }
        {
            String lhsLabelsColumn;
            lhsLabelsColumn = this.getLabelsColumn();
            String rhsLabelsColumn;
            rhsLabelsColumn = that.getLabelsColumn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "labelsColumn", lhsLabelsColumn), LocatorUtils.property(thatLocator, "labelsColumn", rhsLabelsColumn), lhsLabelsColumn, rhsLabelsColumn)) {
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
            String theXAxisColumn;
            theXAxisColumn = this.getXAxisColumn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xAxisColumn", theXAxisColumn), currentHashCode, theXAxisColumn);
        }
        {
            String theLabelsColumn;
            theLabelsColumn = this.getLabelsColumn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "labelsColumn", theLabelsColumn), currentHashCode, theLabelsColumn);
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
        if (draftCopy instanceof ScatterPlot) {
            final ScatterPlot copy = ((ScatterPlot) draftCopy);
            if (this.xAxisColumn!= null) {
                String sourceXAxisColumn;
                sourceXAxisColumn = this.getXAxisColumn();
                String copyXAxisColumn = ((String) strategy.copy(LocatorUtils.property(locator, "xAxisColumn", sourceXAxisColumn), sourceXAxisColumn));
                copy.setXAxisColumn(copyXAxisColumn);
            } else {
                copy.xAxisColumn = null;
            }
            if (this.labelsColumn!= null) {
                String sourceLabelsColumn;
                sourceLabelsColumn = this.getLabelsColumn();
                String copyLabelsColumn = ((String) strategy.copy(LocatorUtils.property(locator, "labelsColumn", sourceLabelsColumn), sourceLabelsColumn));
                copy.setLabelsColumn(copyLabelsColumn);
            } else {
                copy.labelsColumn = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ScatterPlot();
    }

}
