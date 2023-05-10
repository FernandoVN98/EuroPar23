//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.01.17 a las 03:28:00 PM CET 
//


package es.bsc.compss.types.resources.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResourcesNIOAdaptorProperties complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResourcesNIOAdaptorProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MinPort" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MaxPort" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SpawnerPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RemoteExecutionCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourcesNIOAdaptorProperties", propOrder = {
    "minPort",
    "maxPort",
    "spawnerPort",
    "remoteExecutionCommand"
})
public class ResourcesNIOAdaptorProperties {

    @XmlElement(name = "MinPort")
    protected int minPort;
    @XmlElement(name = "MaxPort")
    protected int maxPort;
    @XmlElement(name = "SpawnerPort")
    protected Integer spawnerPort;
    @XmlElement(name = "RemoteExecutionCommand")
    protected String remoteExecutionCommand;

    /**
     * Obtiene el valor de la propiedad minPort.
     * 
     */
    public int getMinPort() {
        return minPort;
    }

    /**
     * Define el valor de la propiedad minPort.
     * 
     */
    public void setMinPort(int value) {
        this.minPort = value;
    }

    /**
     * Obtiene el valor de la propiedad maxPort.
     * 
     */
    public int getMaxPort() {
        return maxPort;
    }

    /**
     * Define el valor de la propiedad maxPort.
     * 
     */
    public void setMaxPort(int value) {
        this.maxPort = value;
    }

    /**
     * Obtiene el valor de la propiedad spawnerPort.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpawnerPort() {
        return spawnerPort;
    }

    /**
     * Define el valor de la propiedad spawnerPort.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpawnerPort(Integer value) {
        this.spawnerPort = value;
    }

    /**
     * Obtiene el valor de la propiedad remoteExecutionCommand.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteExecutionCommand() {
        return remoteExecutionCommand;
    }

    /**
     * Define el valor de la propiedad remoteExecutionCommand.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteExecutionCommand(String value) {
        this.remoteExecutionCommand = value;
    }

}
