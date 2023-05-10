//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.01.17 a las 03:28:00 PM CET 
//


package es.bsc.compss.types.resources.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EndpointType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EndpointType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="3"&gt;
 *         &lt;element name="Server" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="ConnectorJar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ConnectorClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndpointType", propOrder = {
    "serverOrConnectorJarOrConnectorClass"
})
public class EndpointType {

    @XmlElementRefs({
        @XmlElementRef(name = "Server", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ConnectorJar", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ConnectorClass", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Port", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> serverOrConnectorJarOrConnectorClass;

    /**
     * Gets the value of the serverOrConnectorJarOrConnectorClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serverOrConnectorJarOrConnectorClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServerOrConnectorJarOrConnectorClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getServerOrConnectorJarOrConnectorClass() {
        if (serverOrConnectorJarOrConnectorClass == null) {
            serverOrConnectorJarOrConnectorClass = new ArrayList<JAXBElement<String>>();
        }
        return this.serverOrConnectorJarOrConnectorClass;
    }

}
