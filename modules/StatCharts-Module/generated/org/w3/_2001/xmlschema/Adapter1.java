//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.18 a las 12:23:48 PM CEST 
//


package org.w3._2001.xmlschema;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (es.us.isa.sedl.core.util.xml.XsdDateTimeConverter.unmarshal(value));
    }

    public String marshal(Date value) {
        return (es.us.isa.sedl.core.util.xml.XsdDateTimeConverter.marshalDateTime(value));
    }

}
