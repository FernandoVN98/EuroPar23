//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.01.17 a las 03:27:59 PM CET 
//


package es.bsc.compss.types.project.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OSTypeType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="OSTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Linux"/&gt;
 *     &lt;enumeration value="Windows"/&gt;
 *     &lt;enumeration value="MacOS"/&gt;
 *     &lt;enumeration value="FreeBSD"/&gt;
 *     &lt;enumeration value="SunOS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OSTypeType")
@XmlEnum
public enum OSTypeType {

    @XmlEnumValue("Linux")
    LINUX("Linux"),
    @XmlEnumValue("Windows")
    WINDOWS("Windows"),
    @XmlEnumValue("MacOS")
    MAC_OS("MacOS"),
    @XmlEnumValue("FreeBSD")
    FREE_BSD("FreeBSD"),
    @XmlEnumValue("SunOS")
    SUN_OS("SunOS");
    private final String value;

    OSTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OSTypeType fromValue(String v) {
        for (OSTypeType c: OSTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
