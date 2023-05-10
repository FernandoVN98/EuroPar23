//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.01.17 a las 03:28:01 PM CET 
//


package es.bsc.compss.types.monitor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CoreType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MeanExecutionTime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MinExecutionTime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MaxExecutionTime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ExecutedCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="signature" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoreType", propOrder = {
    "meanExecutionTime",
    "minExecutionTime",
    "maxExecutionTime",
    "executedCount"
})
public class CoreType {

    @XmlElement(name = "MeanExecutionTime")
    protected int meanExecutionTime;
    @XmlElement(name = "MinExecutionTime")
    protected int minExecutionTime;
    @XmlElement(name = "MaxExecutionTime")
    protected int maxExecutionTime;
    @XmlElement(name = "ExecutedCount")
    protected int executedCount;
    @XmlAttribute(name = "id", required = true)
    protected int id;
    @XmlAttribute(name = "signature", required = true)
    protected String signature;

    /**
     * Obtiene el valor de la propiedad meanExecutionTime.
     * 
     */
    public int getMeanExecutionTime() {
        return meanExecutionTime;
    }

    /**
     * Define el valor de la propiedad meanExecutionTime.
     * 
     */
    public void setMeanExecutionTime(int value) {
        this.meanExecutionTime = value;
    }

    /**
     * Obtiene el valor de la propiedad minExecutionTime.
     * 
     */
    public int getMinExecutionTime() {
        return minExecutionTime;
    }

    /**
     * Define el valor de la propiedad minExecutionTime.
     * 
     */
    public void setMinExecutionTime(int value) {
        this.minExecutionTime = value;
    }

    /**
     * Obtiene el valor de la propiedad maxExecutionTime.
     * 
     */
    public int getMaxExecutionTime() {
        return maxExecutionTime;
    }

    /**
     * Define el valor de la propiedad maxExecutionTime.
     * 
     */
    public void setMaxExecutionTime(int value) {
        this.maxExecutionTime = value;
    }

    /**
     * Obtiene el valor de la propiedad executedCount.
     * 
     */
    public int getExecutedCount() {
        return executedCount;
    }

    /**
     * Define el valor de la propiedad executedCount.
     * 
     */
    public void setExecutedCount(int value) {
        this.executedCount = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad signature.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Define el valor de la propiedad signature.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignature(String value) {
        this.signature = value;
    }

}
