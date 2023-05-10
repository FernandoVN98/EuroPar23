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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResourcesListType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResourcesListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="SharedDisk" type="{}SharedDiskType"/&gt;
 *         &lt;element name="DataNode" type="{}DataNodeType"/&gt;
 *         &lt;element name="ComputeNode" type="{}ComputeNodeType"/&gt;
 *         &lt;element name="Service" type="{}ServiceType"/&gt;
 *         &lt;element name="CloudProvider" type="{}CloudProviderType"/&gt;
 *         &lt;element name="Http" type="{}HttpType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourcesListType", propOrder = {
    "sharedDiskOrDataNodeOrComputeNode"
})
public class ResourcesListType {

    @XmlElements({
        @XmlElement(name = "SharedDisk", type = SharedDiskType.class),
        @XmlElement(name = "DataNode", type = DataNodeType.class),
        @XmlElement(name = "ComputeNode", type = ComputeNodeType.class),
        @XmlElement(name = "Service", type = ServiceType.class),
        @XmlElement(name = "CloudProvider", type = CloudProviderType.class),
        @XmlElement(name = "Http", type = HttpType.class)
    })
    protected List<Object> sharedDiskOrDataNodeOrComputeNode;

    /**
     * Gets the value of the sharedDiskOrDataNodeOrComputeNode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sharedDiskOrDataNodeOrComputeNode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSharedDiskOrDataNodeOrComputeNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SharedDiskType }
     * {@link DataNodeType }
     * {@link ComputeNodeType }
     * {@link ServiceType }
     * {@link CloudProviderType }
     * {@link HttpType }
     * 
     * 
     */
    public List<Object> getSharedDiskOrDataNodeOrComputeNode() {
        if (sharedDiskOrDataNodeOrComputeNode == null) {
            sharedDiskOrDataNodeOrComputeNode = new ArrayList<Object>();
        }
        return this.sharedDiskOrDataNodeOrComputeNode;
    }

}
