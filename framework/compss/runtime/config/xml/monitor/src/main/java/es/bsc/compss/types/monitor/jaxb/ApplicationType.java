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
 * <p>Clase Java para ApplicationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ApplicationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="InProgress" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Completed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationType", propOrder = {
    "totalCount",
    "inProgress",
    "completed"
})
public class ApplicationType {

    @XmlElement(name = "TotalCount")
    protected int totalCount;
    @XmlElement(name = "InProgress")
    protected int inProgress;
    @XmlElement(name = "Completed")
    protected int completed;
    @XmlAttribute(name = "id", required = true)
    protected int id;

    /**
     * Obtiene el valor de la propiedad totalCount.
     * 
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Define el valor de la propiedad totalCount.
     * 
     */
    public void setTotalCount(int value) {
        this.totalCount = value;
    }

    /**
     * Obtiene el valor de la propiedad inProgress.
     * 
     */
    public int getInProgress() {
        return inProgress;
    }

    /**
     * Define el valor de la propiedad inProgress.
     * 
     */
    public void setInProgress(int value) {
        this.inProgress = value;
    }

    /**
     * Obtiene el valor de la propiedad completed.
     * 
     */
    public int getCompleted() {
        return completed;
    }

    /**
     * Define el valor de la propiedad completed.
     * 
     */
    public void setCompleted(int value) {
        this.completed = value;
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

}
