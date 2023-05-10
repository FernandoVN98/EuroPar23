//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.01.17 a las 03:28:00 PM CET 
//


package es.bsc.compss.types.resources.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ComputeNodeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ComputeNodeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="2"&gt;
 *         &lt;element name="Processor" type="{}ProcessorType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Adaptors" type="{}AdaptorsListType"/&gt;
 *         &lt;element name="Memory" type="{}MemoryType" minOccurs="0"/&gt;
 *         &lt;element name="Storage" type="{}StorageType" minOccurs="0"/&gt;
 *         &lt;element name="OperatingSystem" type="{}OSType" minOccurs="0"/&gt;
 *         &lt;element name="Software" type="{}SoftwareListType" minOccurs="0"/&gt;
 *         &lt;element name="SharedDisks" type="{}AttachedDisksListType" minOccurs="0"/&gt;
 *         &lt;element name="Price" type="{}PriceType" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComputeNodeType", propOrder = {
    "processorOrAdaptorsOrMemory"
})
public class ComputeNodeType {

    @XmlElements({
        @XmlElement(name = "Processor", type = ProcessorType.class),
        @XmlElement(name = "Adaptors", type = AdaptorsListType.class),
        @XmlElement(name = "Memory", type = MemoryType.class),
        @XmlElement(name = "Storage", type = StorageType.class),
        @XmlElement(name = "OperatingSystem", type = OSType.class),
        @XmlElement(name = "Software", type = SoftwareListType.class),
        @XmlElement(name = "SharedDisks", type = AttachedDisksListType.class),
        @XmlElement(name = "Price", type = PriceType.class)
    })
    protected List<Object> processorOrAdaptorsOrMemory;
    @XmlAttribute(name = "Name", required = true)
    protected String name;

    /**
     * Gets the value of the processorOrAdaptorsOrMemory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processorOrAdaptorsOrMemory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessorOrAdaptorsOrMemory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessorType }
     * {@link AdaptorsListType }
     * {@link MemoryType }
     * {@link StorageType }
     * {@link OSType }
     * {@link SoftwareListType }
     * {@link AttachedDisksListType }
     * {@link PriceType }
     * 
     * 
     */
    public List<Object> getProcessorOrAdaptorsOrMemory() {
        if (processorOrAdaptorsOrMemory == null) {
            processorOrAdaptorsOrMemory = new ArrayList<Object>();
        }
        return this.processorOrAdaptorsOrMemory;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
