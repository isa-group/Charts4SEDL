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
 * <p>Clase Java para Serie complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Serie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="x" type="{http://www.eclipse.org/uml2/5.0.0/Types}Real" maxOccurs="unbounded"/>
 *         &lt;element name="y" type="{http://www.eclipse.org/uml2/5.0.0/Types}Real" maxOccurs="unbounded"/>
 *         &lt;element name="labels" type="{http://www.eclipse.org/uml2/5.0.0/Types}String" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.eclipse.org/uml2/5.0.0/Types}String" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Serie", propOrder = {
    "x",
    "y",
    "labels"
})
public class Serie
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected List<String> x;
    @XmlElement(required = true)
    protected List<String> y;
    @XmlElement(required = true, nillable = true)
    protected List<String> labels;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Gets the value of the x property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the x property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getX() {
        if (x == null) {
            x = new ArrayList<String>();
        }
        return this.x;
    }

    /**
     * Gets the value of the y property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the y property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getY() {
        if (y == null) {
            y = new ArrayList<String>();
        }
        return this.y;
    }

    /**
     * Gets the value of the labels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLabels() {
        if (labels == null) {
            labels = new ArrayList<String>();
        }
        return this.labels;
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
        if (!(object instanceof Serie)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Serie that = ((Serie) object);
        {
            List<String> lhsX;
            lhsX = (((this.x!= null)&&(!this.x.isEmpty()))?this.getX():null);
            List<String> rhsX;
            rhsX = (((that.x!= null)&&(!that.x.isEmpty()))?that.getX():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "x", lhsX), LocatorUtils.property(thatLocator, "x", rhsX), lhsX, rhsX)) {
                return false;
            }
        }
        {
            List<String> lhsY;
            lhsY = (((this.y!= null)&&(!this.y.isEmpty()))?this.getY():null);
            List<String> rhsY;
            rhsY = (((that.y!= null)&&(!that.y.isEmpty()))?that.getY():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "y", lhsY), LocatorUtils.property(thatLocator, "y", rhsY), lhsY, rhsY)) {
                return false;
            }
        }
        {
            List<String> lhsLabels;
            lhsLabels = (((this.labels!= null)&&(!this.labels.isEmpty()))?this.getLabels():null);
            List<String> rhsLabels;
            rhsLabels = (((that.labels!= null)&&(!that.labels.isEmpty()))?that.getLabels():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "labels", lhsLabels), LocatorUtils.property(thatLocator, "labels", rhsLabels), lhsLabels, rhsLabels)) {
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
            List<String> theX;
            theX = (((this.x!= null)&&(!this.x.isEmpty()))?this.getX():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "x", theX), currentHashCode, theX);
        }
        {
            List<String> theY;
            theY = (((this.y!= null)&&(!this.y.isEmpty()))?this.getY():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "y", theY), currentHashCode, theY);
        }
        {
            List<String> theLabels;
            theLabels = (((this.labels!= null)&&(!this.labels.isEmpty()))?this.getLabels():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "labels", theLabels), currentHashCode, theLabels);
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
        if (draftCopy instanceof Serie) {
            final Serie copy = ((Serie) draftCopy);
            if ((this.x!= null)&&(!this.x.isEmpty())) {
                List<String> sourceX;
                sourceX = (((this.x!= null)&&(!this.x.isEmpty()))?this.getX():null);
                @SuppressWarnings("unchecked")
                List<String> copyX = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "x", sourceX), sourceX));
                copy.x = null;
                if (copyX!= null) {
                    List<String> uniqueXl = copy.getX();
                    uniqueXl.addAll(copyX);
                }
            } else {
                copy.x = null;
            }
            if ((this.y!= null)&&(!this.y.isEmpty())) {
                List<String> sourceY;
                sourceY = (((this.y!= null)&&(!this.y.isEmpty()))?this.getY():null);
                @SuppressWarnings("unchecked")
                List<String> copyY = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "y", sourceY), sourceY));
                copy.y = null;
                if (copyY!= null) {
                    List<String> uniqueYl = copy.getY();
                    uniqueYl.addAll(copyY);
                }
            } else {
                copy.y = null;
            }
            if ((this.labels!= null)&&(!this.labels.isEmpty())) {
                List<String> sourceLabels;
                sourceLabels = (((this.labels!= null)&&(!this.labels.isEmpty()))?this.getLabels():null);
                @SuppressWarnings("unchecked")
                List<String> copyLabels = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "labels", sourceLabels), sourceLabels));
                copy.labels = null;
                if (copyLabels!= null) {
                    List<String> uniqueLabelsl = copy.getLabels();
                    uniqueLabelsl.addAll(copyLabels);
                }
            } else {
                copy.labels = null;
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
        return new Serie();
    }

}
