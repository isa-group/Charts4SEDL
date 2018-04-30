//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.30 a las 12:47:30 PM CEST 
//


package statcharts.es.us.isa.sedl.module.statcharts;

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
 * <p>Clase Java para HistogramResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HistogramResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http:///StatCharts/es/us/isa/sedl/module/statcharts.ecore}StatisticalChartResult">
 *       &lt;sequence>
 *         &lt;element name="histogram" type="{http:///StatCharts/es/us/isa/sedl/module/statcharts.ecore}Histogram"/>
 *         &lt;element name="counts" type="{http://www.eclipse.org/uml2/5.0.0/Types}Integer" maxOccurs="unbounded"/>
 *         &lt;element name="binThesholds" type="{http://www.eclipse.org/uml2/5.0.0/Types}String" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sigma" use="required" type="{http://www.eclipse.org/uml2/5.0.0/Types}Real" />
 *       &lt;attribute name="mean" use="required" type="{http://www.eclipse.org/uml2/5.0.0/Types}Real" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistogramResult", propOrder = {
    "histogram",
    "counts",
    "binThesholds"
})
public class HistogramResult
    extends StatisticalChartResult
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected Histogram histogram;
    @XmlElement(required = true)
    protected List<String> counts;
    @XmlElement(required = true, nillable = true)
    protected List<String> binThesholds;
    @XmlAttribute(name = "sigma", required = true)
    protected String sigma;
    @XmlAttribute(name = "mean", required = true)
    protected String mean;

    /**
     * Obtiene el valor de la propiedad histogram.
     * 
     * @return
     *     possible object is
     *     {@link Histogram }
     *     
     */
    public Histogram getHistogram() {
        return histogram;
    }

    /**
     * Define el valor de la propiedad histogram.
     * 
     * @param value
     *     allowed object is
     *     {@link Histogram }
     *     
     */
    public void setHistogram(Histogram value) {
        this.histogram = value;
    }

    /**
     * Gets the value of the counts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the counts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCounts() {
        if (counts == null) {
            counts = new ArrayList<String>();
        }
        return this.counts;
    }

    /**
     * Gets the value of the binThesholds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the binThesholds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBinThesholds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBinThesholds() {
        if (binThesholds == null) {
            binThesholds = new ArrayList<String>();
        }
        return this.binThesholds;
    }

    /**
     * Obtiene el valor de la propiedad sigma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigma() {
        return sigma;
    }

    /**
     * Define el valor de la propiedad sigma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigma(String value) {
        this.sigma = value;
    }

    /**
     * Obtiene el valor de la propiedad mean.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMean() {
        return mean;
    }

    /**
     * Define el valor de la propiedad mean.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMean(String value) {
        this.mean = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof HistogramResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final HistogramResult that = ((HistogramResult) object);
        {
            Histogram lhsHistogram;
            lhsHistogram = this.getHistogram();
            Histogram rhsHistogram;
            rhsHistogram = that.getHistogram();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "histogram", lhsHistogram), LocatorUtils.property(thatLocator, "histogram", rhsHistogram), lhsHistogram, rhsHistogram)) {
                return false;
            }
        }
        {
            List<String> lhsCounts;
            lhsCounts = (((this.counts!= null)&&(!this.counts.isEmpty()))?this.getCounts():null);
            List<String> rhsCounts;
            rhsCounts = (((that.counts!= null)&&(!that.counts.isEmpty()))?that.getCounts():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "counts", lhsCounts), LocatorUtils.property(thatLocator, "counts", rhsCounts), lhsCounts, rhsCounts)) {
                return false;
            }
        }
        {
            List<String> lhsBinThesholds;
            lhsBinThesholds = (((this.binThesholds!= null)&&(!this.binThesholds.isEmpty()))?this.getBinThesholds():null);
            List<String> rhsBinThesholds;
            rhsBinThesholds = (((that.binThesholds!= null)&&(!that.binThesholds.isEmpty()))?that.getBinThesholds():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "binThesholds", lhsBinThesholds), LocatorUtils.property(thatLocator, "binThesholds", rhsBinThesholds), lhsBinThesholds, rhsBinThesholds)) {
                return false;
            }
        }
        {
            String lhsSigma;
            lhsSigma = this.getSigma();
            String rhsSigma;
            rhsSigma = that.getSigma();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sigma", lhsSigma), LocatorUtils.property(thatLocator, "sigma", rhsSigma), lhsSigma, rhsSigma)) {
                return false;
            }
        }
        {
            String lhsMean;
            lhsMean = this.getMean();
            String rhsMean;
            rhsMean = that.getMean();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mean", lhsMean), LocatorUtils.property(thatLocator, "mean", rhsMean), lhsMean, rhsMean)) {
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
            Histogram theHistogram;
            theHistogram = this.getHistogram();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "histogram", theHistogram), currentHashCode, theHistogram);
        }
        {
            List<String> theCounts;
            theCounts = (((this.counts!= null)&&(!this.counts.isEmpty()))?this.getCounts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "counts", theCounts), currentHashCode, theCounts);
        }
        {
            List<String> theBinThesholds;
            theBinThesholds = (((this.binThesholds!= null)&&(!this.binThesholds.isEmpty()))?this.getBinThesholds():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "binThesholds", theBinThesholds), currentHashCode, theBinThesholds);
        }
        {
            String theSigma;
            theSigma = this.getSigma();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sigma", theSigma), currentHashCode, theSigma);
        }
        {
            String theMean;
            theMean = this.getMean();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mean", theMean), currentHashCode, theMean);
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
        if (draftCopy instanceof HistogramResult) {
            final HistogramResult copy = ((HistogramResult) draftCopy);
            if (this.histogram!= null) {
                Histogram sourceHistogram;
                sourceHistogram = this.getHistogram();
                Histogram copyHistogram = ((Histogram) strategy.copy(LocatorUtils.property(locator, "histogram", sourceHistogram), sourceHistogram));
                copy.setHistogram(copyHistogram);
            } else {
                copy.histogram = null;
            }
            if ((this.counts!= null)&&(!this.counts.isEmpty())) {
                List<String> sourceCounts;
                sourceCounts = (((this.counts!= null)&&(!this.counts.isEmpty()))?this.getCounts():null);
                @SuppressWarnings("unchecked")
                List<String> copyCounts = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "counts", sourceCounts), sourceCounts));
                copy.counts = null;
                if (copyCounts!= null) {
                    List<String> uniqueCountsl = copy.getCounts();
                    uniqueCountsl.addAll(copyCounts);
                }
            } else {
                copy.counts = null;
            }
            if ((this.binThesholds!= null)&&(!this.binThesholds.isEmpty())) {
                List<String> sourceBinThesholds;
                sourceBinThesholds = (((this.binThesholds!= null)&&(!this.binThesholds.isEmpty()))?this.getBinThesholds():null);
                @SuppressWarnings("unchecked")
                List<String> copyBinThesholds = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "binThesholds", sourceBinThesholds), sourceBinThesholds));
                copy.binThesholds = null;
                if (copyBinThesholds!= null) {
                    List<String> uniqueBinThesholdsl = copy.getBinThesholds();
                    uniqueBinThesholdsl.addAll(copyBinThesholds);
                }
            } else {
                copy.binThesholds = null;
            }
            if (this.sigma!= null) {
                String sourceSigma;
                sourceSigma = this.getSigma();
                String copySigma = ((String) strategy.copy(LocatorUtils.property(locator, "sigma", sourceSigma), sourceSigma));
                copy.setSigma(copySigma);
            } else {
                copy.sigma = null;
            }
            if (this.mean!= null) {
                String sourceMean;
                sourceMean = this.getMean();
                String copyMean = ((String) strategy.copy(LocatorUtils.property(locator, "mean", sourceMean), sourceMean));
                copy.setMean(copyMean);
            } else {
                copy.mean = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new HistogramResult();
    }

}
