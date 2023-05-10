//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.01.17 a las 03:27:59 PM CET 
//


package es.bsc.compss.types.project.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProjectType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element name="MasterNode" type="{}MasterNodeType"/&gt;
 *         &lt;element name="ComputeNode" type="{}ComputeNodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DataNode" type="{}DataNodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Service" type="{}ServiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Http" type="{}HttpType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Cloud" type="{}CloudType" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectType", propOrder = {
    "masterNodeOrComputeNodeOrDataNode"
})
public class ProjectType {

    @XmlElements({
        @XmlElement(name = "MasterNode", type = MasterNodeType.class),
        @XmlElement(name = "ComputeNode", type = ComputeNodeType.class),
        @XmlElement(name = "DataNode", type = DataNodeType.class),
        @XmlElement(name = "Service", type = ServiceType.class),
        @XmlElement(name = "Http", type = HttpType.class),
        @XmlElement(name = "Cloud", type = CloudType.class)
    })
    protected List<Object> masterNodeOrComputeNodeOrDataNode;

    /**
     * Gets the value of the masterNodeOrComputeNodeOrDataNode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the masterNodeOrComputeNodeOrDataNode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMasterNodeOrComputeNodeOrDataNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MasterNodeType }
     * {@link ComputeNodeType }
     * {@link DataNodeType }
     * {@link ServiceType }
     * {@link HttpType }
     * {@link CloudType }
     * 
     * 
     */
    public List<Object> getMasterNodeOrComputeNodeOrDataNode() {
        if (masterNodeOrComputeNodeOrDataNode == null) {
            masterNodeOrComputeNodeOrDataNode = new ArrayList<Object>();
        }
        return this.masterNodeOrComputeNodeOrDataNode;
    }

}
