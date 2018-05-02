//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.05.03 a las 01:40:01 AM CEST 
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
 * <p>Clase Java para PieChartResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PieChartResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore}StatisticalChartResult">
 *       &lt;sequence>
 *         &lt;element name="values" type="{http://www.eclipse.org/uml2/5.0.0/Types}Real" maxOccurs="unbounded"/>
 *         &lt;element name="pieChart" type="{http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore}PieChart"/>
 *         &lt;element name="labels" type="{http://www.eclipse.org/uml2/5.0.0/Types}String" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PieChartResult", propOrder = {
    "values",
    "pieChart",
    "labels"
})
public class PieChartResult
    extends StatisticalChartResult
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected List<String> values;
    @XmlElement(required = true)
    protected PieChart pieChart;
    @XmlElement(required = true, nillable = true)
    protected List<String> labels;

    /**
     * Gets the value of the values property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the values property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValues() {
        if (values == null) {
            values = new ArrayList<String>();
        }
        return this.values;
    }

    /**
     * Obtiene el valor de la propiedad pieChart.
     * 
     * @return
     *     possible object is
     *     {@link PieChart }
     *     
     */
    public PieChart getPieChart() {
        return pieChart;
    }

    /**
     * Define el valor de la propiedad pieChart.
     * 
     * @param value
     *     allowed object is
     *     {@link PieChart }
     *     
     */
    public void setPieChart(PieChart value) {
        this.pieChart = value;
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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PieChartResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final PieChartResult that = ((PieChartResult) object);
        {
            List<String> lhsValues;
            lhsValues = (((this.values!= null)&&(!this.values.isEmpty()))?this.getValues():null);
            List<String> rhsValues;
            rhsValues = (((that.values!= null)&&(!that.values.isEmpty()))?that.getValues():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "values", lhsValues), LocatorUtils.property(thatLocator, "values", rhsValues), lhsValues, rhsValues)) {
                return false;
            }
        }
        {
            PieChart lhsPieChart;
            lhsPieChart = this.getPieChart();
            PieChart rhsPieChart;
            rhsPieChart = that.getPieChart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pieChart", lhsPieChart), LocatorUtils.property(thatLocator, "pieChart", rhsPieChart), lhsPieChart, rhsPieChart)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            List<String> theValues;
            theValues = (((this.values!= null)&&(!this.values.isEmpty()))?this.getValues():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "values", theValues), currentHashCode, theValues);
        }
        {
            PieChart thePieChart;
            thePieChart = this.getPieChart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pieChart", thePieChart), currentHashCode, thePieChart);
        }
        {
            List<String> theLabels;
            theLabels = (((this.labels!= null)&&(!this.labels.isEmpty()))?this.getLabels():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "labels", theLabels), currentHashCode, theLabels);
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
        if (draftCopy instanceof PieChartResult) {
            final PieChartResult copy = ((PieChartResult) draftCopy);
            if ((this.values!= null)&&(!this.values.isEmpty())) {
                List<String> sourceValues;
                sourceValues = (((this.values!= null)&&(!this.values.isEmpty()))?this.getValues():null);
                @SuppressWarnings("unchecked")
                List<String> copyValues = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "values", sourceValues), sourceValues));
                copy.values = null;
                if (copyValues!= null) {
                    List<String> uniqueValuesl = copy.getValues();
                    uniqueValuesl.addAll(copyValues);
                }
            } else {
                copy.values = null;
            }
            if (this.pieChart!= null) {
                PieChart sourcePieChart;
                sourcePieChart = this.getPieChart();
                PieChart copyPieChart = ((PieChart) strategy.copy(LocatorUtils.property(locator, "pieChart", sourcePieChart), sourcePieChart));
                copy.setPieChart(copyPieChart);
            } else {
                copy.pieChart = null;
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
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new PieChartResult();
    }

}
