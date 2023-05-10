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
 * <p>Clase Java para ResourceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResourceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalComputingUnits" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Memory" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Disk" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Actions" type="{}ActionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceType", propOrder = {
    "totalComputingUnits",
    "memory",
    "disk",
    "status",
    "provider",
    "image",
    "actions"
})
public class ResourceType {

    @XmlElement(name = "TotalComputingUnits")
    protected int totalComputingUnits;
    @XmlElement(name = "Memory")
    protected Float memory;
    @XmlElement(name = "Disk")
    protected Float disk;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Provider")
    protected String provider;
    @XmlElement(name = "Image")
    protected String image;
    @XmlElement(name = "Actions")
    protected ActionsType actions;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Obtiene el valor de la propiedad totalComputingUnits.
     * 
     */
    public int getTotalComputingUnits() {
        return totalComputingUnits;
    }

    /**
     * Define el valor de la propiedad totalComputingUnits.
     * 
     */
    public void setTotalComputingUnits(int value) {
        this.totalComputingUnits = value;
    }

    /**
     * Obtiene el valor de la propiedad memory.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMemory() {
        return memory;
    }

    /**
     * Define el valor de la propiedad memory.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMemory(Float value) {
        this.memory = value;
    }

    /**
     * Obtiene el valor de la propiedad disk.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDisk() {
        return disk;
    }

    /**
     * Define el valor de la propiedad disk.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDisk(Float value) {
        this.disk = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad provider.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Define el valor de la propiedad provider.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvider(String value) {
        this.provider = value;
    }

    /**
     * Obtiene el valor de la propiedad image.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * Define el valor de la propiedad image.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
    }

    /**
     * Obtiene el valor de la propiedad actions.
     * 
     * @return
     *     possible object is
     *     {@link ActionsType }
     *     
     */
    public ActionsType getActions() {
        return actions;
    }

    /**
     * Define el valor de la propiedad actions.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionsType }
     *     
     */
    public void setActions(ActionsType value) {
        this.actions = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
