//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.05.03 a las 06:45:05 PM CEST 
//


package es.us.isa.sedl.core.analysis.statistic.module.statcharts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Clase Java para SerieBox complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SerieBox">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quartiles" type="{http://www.eclipse.org/uml2/5.0.0/Types}Real" maxOccurs="unbounded"/>
 *         &lt;element name="outliers" type="{http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore}Outlier" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="standardDeviation" use="required" type="{http://www.eclipse.org/uml2/5.0.0/Types}Real" />
 *       &lt;attribute name="name" use="required" type="{http://www.eclipse.org/uml2/5.0.0/Types}String" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SerieBox", propOrder = {
    "quartiles",
    "outliers"
})
public class SerieBox
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected List<String> quartiles;
    protected List<Outlier> outliers;
    @XmlAttribute(name = "standardDeviation", required = true)
    protected String standardDeviation;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Gets the value of the quartiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quartiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuartiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQuartiles() {
        if (quartiles == null) {
            quartiles = new ArrayList<String>();
        }
        return this.quartiles;
    }

    /**
     * Gets the value of the outliers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outliers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutliers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Outlier }
     * 
     * 
     */
    public List<Outlier> getOutliers() {
        if (outliers == null) {
            outliers = new ArrayList<Outlier>();
        }
        return this.outliers;
    }

    /**
     * Obtiene el valor de la propiedad standardDeviation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardDeviation() {
        return standardDeviation;
    }

    /**
     * Define el valor de la propiedad standardDeviation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardDeviation(String value) {
        this.standardDeviation = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SerieBox)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SerieBox that = ((SerieBox) object);
        {
            List<String> lhsQuartiles;
            lhsQuartiles = (((this.quartiles!= null)&&(!this.quartiles.isEmpty()))?this.getQuartiles():null);
            List<String> rhsQuartiles;
            rhsQuartiles = (((that.quartiles!= null)&&(!that.quartiles.isEmpty()))?that.getQuartiles():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quartiles", lhsQuartiles), LocatorUtils.property(thatLocator, "quartiles", rhsQuartiles), lhsQuartiles, rhsQuartiles)) {
                return false;
            }
        }
        {
            List<Outlier> lhsOutliers;
            lhsOutliers = (((this.outliers!= null)&&(!this.outliers.isEmpty()))?this.getOutliers():null);
            List<Outlier> rhsOutliers;
            rhsOutliers = (((that.outliers!= null)&&(!that.outliers.isEmpty()))?that.getOutliers():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outliers", lhsOutliers), LocatorUtils.property(thatLocator, "outliers", rhsOutliers), lhsOutliers, rhsOutliers)) {
                return false;
            }
        }
        {
            String lhsStandardDeviation;
            lhsStandardDeviation = this.getStandardDeviation();
            String rhsStandardDeviation;
            rhsStandardDeviation = that.getStandardDeviation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "standardDeviation", lhsStandardDeviation), LocatorUtils.property(thatLocator, "standardDeviation", rhsStandardDeviation), lhsStandardDeviation, rhsStandardDeviation)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
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
        int currentHashCode = 1;
        {
            List<String> theQuartiles;
            theQuartiles = (((this.quartiles!= null)&&(!this.quartiles.isEmpty()))?this.getQuartiles():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quartiles", theQuartiles), currentHashCode, theQuartiles);
        }
        {
            List<Outlier> theOutliers;
            theOutliers = (((this.outliers!= null)&&(!this.outliers.isEmpty()))?this.getOutliers():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outliers", theOutliers), currentHashCode, theOutliers);
        }
        {
            String theStandardDeviation;
            theStandardDeviation = this.getStandardDeviation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "standardDeviation", theStandardDeviation), currentHashCode, theStandardDeviation);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
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
        if (draftCopy instanceof SerieBox) {
            final SerieBox copy = ((SerieBox) draftCopy);
            if ((this.quartiles!= null)&&(!this.quartiles.isEmpty())) {
                List<String> sourceQuartiles;
                sourceQuartiles = (((this.quartiles!= null)&&(!this.quartiles.isEmpty()))?this.getQuartiles():null);
                @SuppressWarnings("unchecked")
                List<String> copyQuartiles = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "quartiles", sourceQuartiles), sourceQuartiles));
                copy.quartiles = null;
                if (copyQuartiles!= null) {
                    List<String> uniqueQuartilesl = copy.getQuartiles();
                    uniqueQuartilesl.addAll(copyQuartiles);
                }
            } else {
                copy.quartiles = null;
            }
            if ((this.outliers!= null)&&(!this.outliers.isEmpty())) {
                List<Outlier> sourceOutliers;
                sourceOutliers = (((this.outliers!= null)&&(!this.outliers.isEmpty()))?this.getOutliers():null);
                @SuppressWarnings("unchecked")
                List<Outlier> copyOutliers = ((List<Outlier> ) strategy.copy(LocatorUtils.property(locator, "outliers", sourceOutliers), sourceOutliers));
                copy.outliers = null;
                if (copyOutliers!= null) {
                    List<Outlier> uniqueOutliersl = copy.getOutliers();
                    uniqueOutliersl.addAll(copyOutliers);
                }
            } else {
                copy.outliers = null;
            }
            if (this.standardDeviation!= null) {
                String sourceStandardDeviation;
                sourceStandardDeviation = this.getStandardDeviation();
                String copyStandardDeviation = ((String) strategy.copy(LocatorUtils.property(locator, "standardDeviation", sourceStandardDeviation), sourceStandardDeviation));
                copy.setStandardDeviation(copyStandardDeviation);
            } else {
                copy.standardDeviation = null;
            }
            if (this.name!= null) {
                String sourceName;
                sourceName = this.getName();
                String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                copy.setName(copyName);
            } else {
                copy.name = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SerieBox();
    }

}
