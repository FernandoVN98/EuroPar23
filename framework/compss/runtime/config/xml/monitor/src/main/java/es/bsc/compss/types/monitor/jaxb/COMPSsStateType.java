//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.01.17 a las 03:28:01 PM CET 
//


package es.bsc.compss.types.monitor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para COMPSsStateType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="COMPSsStateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TasksInfo" type="{}TasksInfoType"/&gt;
 *         &lt;element name="CoresInfo" type="{}CoresInfoType"/&gt;
 *         &lt;element name="ResourceInfo" type="{}ResourceInfoType"/&gt;
 *         &lt;element name="AccumulatedCost" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COMPSsStateType", propOrder = {
    "tasksInfo",
    "coresInfo",
    "resourceInfo",
    "accumulatedCost"
})
public class COMPSsStateType {

    @XmlElement(name = "TasksInfo", required = true)
    protected TasksInfoType tasksInfo;
    @XmlElement(name = "CoresInfo", required = true)
    protected CoresInfoType coresInfo;
    @XmlElement(name = "ResourceInfo", required = true)
    protected ResourceInfoType resourceInfo;
    @XmlElement(name = "AccumulatedCost")
    protected float accumulatedCost;

    /**
     * Obtiene el valor de la propiedad tasksInfo.
     * 
     * @return
     *     possible object is
     *     {@link TasksInfoType }
     *     
     */
    public TasksInfoType getTasksInfo() {
        return tasksInfo;
    }

    /**
     * Define el valor de la propiedad tasksInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link TasksInfoType }
     *     
     */
    public void setTasksInfo(TasksInfoType value) {
        this.tasksInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad coresInfo.
     * 
     * @return
     *     possible object is
     *     {@link CoresInfoType }
     *     
     */
    public CoresInfoType getCoresInfo() {
        return coresInfo;
    }

    /**
     * Define el valor de la propiedad coresInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link CoresInfoType }
     *     
     */
    public void setCoresInfo(CoresInfoType value) {
        this.coresInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad resourceInfo.
     * 
     * @return
     *     possible object is
     *     {@link ResourceInfoType }
     *     
     */
    public ResourceInfoType getResourceInfo() {
        return resourceInfo;
    }

    /**
     * Define el valor de la propiedad resourceInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceInfoType }
     *     
     */
    public void setResourceInfo(ResourceInfoType value) {
        this.resourceInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad accumulatedCost.
     * 
     */
    public float getAccumulatedCost() {
        return accumulatedCost;
    }

    /**
     * Define el valor de la propiedad accumulatedCost.
     * 
     */
    public void setAccumulatedCost(float value) {
        this.accumulatedCost = value;
    }

}
