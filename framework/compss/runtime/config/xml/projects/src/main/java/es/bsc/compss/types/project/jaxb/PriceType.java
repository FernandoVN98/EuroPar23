//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.01.17 a las 03:27:59 PM CET 
//


package es.bsc.compss.types.project.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PriceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="TimeUnit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PricePerUnit" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceType", propOrder = {

})
public class PriceType {

    @XmlElement(name = "TimeUnit")
    protected int timeUnit;
    @XmlElement(name = "PricePerUnit")
    protected float pricePerUnit;

    /**
     * Obtiene el valor de la propiedad timeUnit.
     * 
     */
    public int getTimeUnit() {
        return timeUnit;
    }

    /**
     * Define el valor de la propiedad timeUnit.
     * 
     */
    public void setTimeUnit(int value) {
        this.timeUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad pricePerUnit.
     * 
     */
    public float getPricePerUnit() {
        return pricePerUnit;
    }

    /**
     * Define el valor de la propiedad pricePerUnit.
     * 
     */
    public void setPricePerUnit(float value) {
        this.pricePerUnit = value;
    }

}
