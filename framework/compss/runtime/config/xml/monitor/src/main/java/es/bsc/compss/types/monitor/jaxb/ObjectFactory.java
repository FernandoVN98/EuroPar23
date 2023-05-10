//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.01.17 a las 03:28:01 PM CET 
//


package es.bsc.compss.types.monitor.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.bsc.compss.types.monitor.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _COMPSsState_QNAME = new QName("", "COMPSsState");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.bsc.compss.types.monitor.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link COMPSsStateType }
     * 
     */
    public COMPSsStateType createCOMPSsStateType() {
        return new COMPSsStateType();
    }

    /**
     * Create an instance of {@link ResourceInfoType }
     * 
     */
    public ResourceInfoType createResourceInfoType() {
        return new ResourceInfoType();
    }

    /**
     * Create an instance of {@link ResourceType }
     * 
     */
    public ResourceType createResourceType() {
        return new ResourceType();
    }

    /**
     * Create an instance of {@link ActionsType }
     * 
     */
    public ActionsType createActionsType() {
        return new ActionsType();
    }

    /**
     * Create an instance of {@link CoresInfoType }
     * 
     */
    public CoresInfoType createCoresInfoType() {
        return new CoresInfoType();
    }

    /**
     * Create an instance of {@link CoreType }
     * 
     */
    public CoreType createCoreType() {
        return new CoreType();
    }

    /**
     * Create an instance of {@link TasksInfoType }
     * 
     */
    public TasksInfoType createTasksInfoType() {
        return new TasksInfoType();
    }

    /**
     * Create an instance of {@link ApplicationType }
     * 
     */
    public ApplicationType createApplicationType() {
        return new ApplicationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COMPSsStateType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link COMPSsStateType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "COMPSsState")
    public JAXBElement<COMPSsStateType> createCOMPSsState(COMPSsStateType value) {
        return new JAXBElement<COMPSsStateType>(_COMPSsState_QNAME, COMPSsStateType.class, null, value);
    }

}
