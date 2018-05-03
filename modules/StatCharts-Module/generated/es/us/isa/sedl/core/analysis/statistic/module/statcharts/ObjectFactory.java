//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.05.03 a las 06:45:05 PM CEST 
//


package es.us.isa.sedl.core.analysis.statistic.module.statcharts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.us.isa.sedl.core.analysis.statistic.module.statcharts package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BoxPlotResult_QNAME = new QName("http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", "BoxPlotResult");
    private final static QName _ScatterPlot_QNAME = new QName("http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", "ScatterPlot");
    private final static QName _Histogram_QNAME = new QName("http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", "Histogram");
    private final static QName _ScatterPlotResult_QNAME = new QName("http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", "ScatterPlotResult");
    private final static QName _Outlier_QNAME = new QName("http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", "Outlier");
    private final static QName _BoxPlot_QNAME = new QName("http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", "BoxPlot");
    private final static QName _Serie_QNAME = new QName("http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", "Serie");
    private final static QName _SerieBox_QNAME = new QName("http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", "SerieBox");
    private final static QName _PieChartResult_QNAME = new QName("http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", "PieChartResult");
    private final static QName _StatisticalChartResult_QNAME = new QName("http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", "StatisticalChartResult");
    private final static QName _PieChart_QNAME = new QName("http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", "PieChart");
    private final static QName _HistogramResult_QNAME = new QName("http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", "HistogramResult");
    private final static QName _StatisticalChart_QNAME = new QName("http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", "StatisticalChart");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.us.isa.sedl.core.analysis.statistic.module.statcharts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Histogram }
     * 
     */
    public Histogram createHistogram() {
        return new Histogram();
    }

    /**
     * Create an instance of {@link HistogramResult }
     * 
     */
    public HistogramResult createHistogramResult() {
        return new HistogramResult();
    }

    /**
     * Create an instance of {@link PieChartResult }
     * 
     */
    public PieChartResult createPieChartResult() {
        return new PieChartResult();
    }

    /**
     * Create an instance of {@link ScatterPlot }
     * 
     */
    public ScatterPlot createScatterPlot() {
        return new ScatterPlot();
    }

    /**
     * Create an instance of {@link BoxPlot }
     * 
     */
    public BoxPlot createBoxPlot() {
        return new BoxPlot();
    }

    /**
     * Create an instance of {@link StatisticalChart }
     * 
     */
    public StatisticalChart createStatisticalChart() {
        return new StatisticalChart();
    }

    /**
     * Create an instance of {@link Outlier }
     * 
     */
    public Outlier createOutlier() {
        return new Outlier();
    }

    /**
     * Create an instance of {@link StatisticalChartResult }
     * 
     */
    public StatisticalChartResult createStatisticalChartResult() {
        return new StatisticalChartResult();
    }

    /**
     * Create an instance of {@link PieChart }
     * 
     */
    public PieChart createPieChart() {
        return new PieChart();
    }

    /**
     * Create an instance of {@link BoxPlotResult }
     * 
     */
    public BoxPlotResult createBoxPlotResult() {
        return new BoxPlotResult();
    }

    /**
     * Create an instance of {@link ScatterPlotResult }
     * 
     */
    public ScatterPlotResult createScatterPlotResult() {
        return new ScatterPlotResult();
    }

    /**
     * Create an instance of {@link SerieBox }
     * 
     */
    public SerieBox createSerieBox() {
        return new SerieBox();
    }

    /**
     * Create an instance of {@link Serie }
     * 
     */
    public Serie createSerie() {
        return new Serie();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoxPlotResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", name = "BoxPlotResult")
    public JAXBElement<BoxPlotResult> createBoxPlotResult(BoxPlotResult value) {
        return new JAXBElement<BoxPlotResult>(_BoxPlotResult_QNAME, BoxPlotResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScatterPlot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", name = "ScatterPlot")
    public JAXBElement<ScatterPlot> createScatterPlot(ScatterPlot value) {
        return new JAXBElement<ScatterPlot>(_ScatterPlot_QNAME, ScatterPlot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Histogram }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", name = "Histogram")
    public JAXBElement<Histogram> createHistogram(Histogram value) {
        return new JAXBElement<Histogram>(_Histogram_QNAME, Histogram.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScatterPlotResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", name = "ScatterPlotResult")
    public JAXBElement<ScatterPlotResult> createScatterPlotResult(ScatterPlotResult value) {
        return new JAXBElement<ScatterPlotResult>(_ScatterPlotResult_QNAME, ScatterPlotResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Outlier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", name = "Outlier")
    public JAXBElement<Outlier> createOutlier(Outlier value) {
        return new JAXBElement<Outlier>(_Outlier_QNAME, Outlier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoxPlot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", name = "BoxPlot")
    public JAXBElement<BoxPlot> createBoxPlot(BoxPlot value) {
        return new JAXBElement<BoxPlot>(_BoxPlot_QNAME, BoxPlot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Serie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", name = "Serie")
    public JAXBElement<Serie> createSerie(Serie value) {
        return new JAXBElement<Serie>(_Serie_QNAME, Serie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SerieBox }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", name = "SerieBox")
    public JAXBElement<SerieBox> createSerieBox(SerieBox value) {
        return new JAXBElement<SerieBox>(_SerieBox_QNAME, SerieBox.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PieChartResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", name = "PieChartResult")
    public JAXBElement<PieChartResult> createPieChartResult(PieChartResult value) {
        return new JAXBElement<PieChartResult>(_PieChartResult_QNAME, PieChartResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatisticalChartResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", name = "StatisticalChartResult")
    public JAXBElement<StatisticalChartResult> createStatisticalChartResult(StatisticalChartResult value) {
        return new JAXBElement<StatisticalChartResult>(_StatisticalChartResult_QNAME, StatisticalChartResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PieChart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", name = "PieChart")
    public JAXBElement<PieChart> createPieChart(PieChart value) {
        return new JAXBElement<PieChart>(_PieChart_QNAME, PieChart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistogramResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", name = "HistogramResult")
    public JAXBElement<HistogramResult> createHistogramResult(HistogramResult value) {
        return new JAXBElement<HistogramResult>(_HistogramResult_QNAME, HistogramResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatisticalChart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:///isa.us.es/sedl/core/analysis/statistic/module/statcharts.ecore", name = "StatisticalChart")
    public JAXBElement<StatisticalChart> createStatisticalChart(StatisticalChart value) {
        return new JAXBElement<StatisticalChart>(_StatisticalChart_QNAME, StatisticalChart.class, null, value);
    }

}
