//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.01.17 a las 03:27:59 PM CET 
//


package es.bsc.compss.types.project.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProcessorType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProcessorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element name="ComputingUnits" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Architecture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Speed" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InternalMemorySize" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="ProcessorProperty" type="{}ProcessorPropertyType" minOccurs="0"/&gt;
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
@XmlType(name = "ProcessorType", propOrder = {
    "computingUnitsOrArchitectureOrSpeed"
})
public class ProcessorType {

    @XmlElementRefs({
        @XmlElementRef(name = "ComputingUnits", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Architecture", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Speed", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Type", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "InternalMemorySize", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ProcessorProperty", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> computingUnitsOrArchitectureOrSpeed;
    @XmlAttribute(name = "Name", required = true)
    protected String name;

    /**
     * Gets the value of the computingUnitsOrArchitectureOrSpeed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the computingUnitsOrArchitectureOrSpeed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComputingUnitsOrArchitectureOrSpeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcessorPropertyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getComputingUnitsOrArchitectureOrSpeed() {
        if (computingUnitsOrArchitectureOrSpeed == null) {
            computingUnitsOrArchitectureOrSpeed = new ArrayList<JAXBElement<?>>();
        }
        return this.computingUnitsOrArchitectureOrSpeed;
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
