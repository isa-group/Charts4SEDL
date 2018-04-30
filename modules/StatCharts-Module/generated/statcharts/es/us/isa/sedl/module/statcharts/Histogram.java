//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.30 a las 12:47:30 PM CEST 
//


package statcharts.es.us.isa.sedl.module.statcharts;

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
 * <p>Clase Java para Histogram complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Histogram">
 *   &lt;complexContent>
 *     &lt;extension base="{http:///StatCharts/es/us/isa/sedl/module/statcharts.ecore}StatisticalChart">
 *       &lt;attribute name="nBins" use="required" type="{http://www.eclipse.org/uml2/5.0.0/Types}Integer" />
 *       &lt;attribute name="sigmaBands" use="required" type="{http://www.eclipse.org/uml2/5.0.0/Types}Boolean" />
 *       &lt;attribute name="normalDistribution" use="required" type="{http://www.eclipse.org/uml2/5.0.0/Types}Boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Histogram")
public class Histogram
    extends StatisticalChart
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlAttribute(name = "nBins", required = true)
    protected String nBins;
    @XmlAttribute(name = "sigmaBands", required = true)
    protected String sigmaBands;
    @XmlAttribute(name = "normalDistribution", required = true)
    protected String normalDistribution;

    /**
     * Obtiene el valor de la propiedad nBins.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNBins() {
        return nBins;
    }

    /**
     * Define el valor de la propiedad nBins.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNBins(String value) {
        this.nBins = value;
    }

    /**
     * Obtiene el valor de la propiedad sigmaBands.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigmaBands() {
        return sigmaBands;
    }

    /**
     * Define el valor de la propiedad sigmaBands.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigmaBands(String value) {
        this.sigmaBands = value;
    }

    /**
     * Obtiene el valor de la propiedad normalDistribution.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalDistribution() {
        return normalDistribution;
    }

    /**
     * Define el valor de la propiedad normalDistribution.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalDistribution(String value) {
        this.normalDistribution = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Histogram)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Histogram that = ((Histogram) object);
        {
            String lhsNBins;
            lhsNBins = this.getNBins();
            String rhsNBins;
            rhsNBins = that.getNBins();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nBins", lhsNBins), LocatorUtils.property(thatLocator, "nBins", rhsNBins), lhsNBins, rhsNBins)) {
                return false;
            }
        }
        {
            String lhsSigmaBands;
            lhsSigmaBands = this.getSigmaBands();
            String rhsSigmaBands;
            rhsSigmaBands = that.getSigmaBands();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sigmaBands", lhsSigmaBands), LocatorUtils.property(thatLocator, "sigmaBands", rhsSigmaBands), lhsSigmaBands, rhsSigmaBands)) {
                return false;
            }
        }
        {
            String lhsNormalDistribution;
            lhsNormalDistribution = this.getNormalDistribution();
            String rhsNormalDistribution;
            rhsNormalDistribution = that.getNormalDistribution();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "normalDistribution", lhsNormalDistribution), LocatorUtils.property(thatLocator, "normalDistribution", rhsNormalDistribution), lhsNormalDistribution, rhsNormalDistribution)) {
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
            String theNBins;
            theNBins = this.getNBins();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nBins", theNBins), currentHashCode, theNBins);
        }
        {
            String theSigmaBands;
            theSigmaBands = this.getSigmaBands();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sigmaBands", theSigmaBands), currentHashCode, theSigmaBands);
        }
        {
            String theNormalDistribution;
            theNormalDistribution = this.getNormalDistribution();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "normalDistribution", theNormalDistribution), currentHashCode, theNormalDistribution);
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
        if (draftCopy instanceof Histogram) {
            final Histogram copy = ((Histogram) draftCopy);
            if (this.nBins!= null) {
                String sourceNBins;
                sourceNBins = this.getNBins();
                String copyNBins = ((String) strategy.copy(LocatorUtils.property(locator, "nBins", sourceNBins), sourceNBins));
                copy.setNBins(copyNBins);
            } else {
                copy.nBins = null;
            }
            if (this.sigmaBands!= null) {
                String sourceSigmaBands;
                sourceSigmaBands = this.getSigmaBands();
                String copySigmaBands = ((String) strategy.copy(LocatorUtils.property(locator, "sigmaBands", sourceSigmaBands), sourceSigmaBands));
                copy.setSigmaBands(copySigmaBands);
            } else {
                copy.sigmaBands = null;
            }
            if (this.normalDistribution!= null) {
                String sourceNormalDistribution;
                sourceNormalDistribution = this.getNormalDistribution();
                String copyNormalDistribution = ((String) strategy.copy(LocatorUtils.property(locator, "normalDistribution", sourceNormalDistribution), sourceNormalDistribution));
                copy.setNormalDistribution(copyNormalDistribution);
            } else {
                copy.normalDistribution = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Histogram();
    }

}
