//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.01.17 a las 03:28:00 PM CET 
//


package es.bsc.compss.types.resources.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.bsc.compss.types.resources.jaxb package. 
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

    private final static QName _ResourcesList_QNAME = new QName("", "ResourcesList");
    private final static QName _EndpointTypeServer_QNAME = new QName("", "Server");
    private final static QName _EndpointTypeConnectorJar_QNAME = new QName("", "ConnectorJar");
    private final static QName _EndpointTypeConnectorClass_QNAME = new QName("", "ConnectorClass");
    private final static QName _EndpointTypePort_QNAME = new QName("", "Port");
    private final static QName _OSTypeType_QNAME = new QName("", "Type");
    private final static QName _OSTypeDistribution_QNAME = new QName("", "Distribution");
    private final static QName _OSTypeVersion_QNAME = new QName("", "Version");
    private final static QName _ProcessorTypeComputingUnits_QNAME = new QName("", "ComputingUnits");
    private final static QName _ProcessorTypeArchitecture_QNAME = new QName("", "Architecture");
    private final static QName _ProcessorTypeSpeed_QNAME = new QName("", "Speed");
    private final static QName _ProcessorTypeInternalMemorySize_QNAME = new QName("", "InternalMemorySize");
    private final static QName _ProcessorTypeProcessorProperty_QNAME = new QName("", "ProcessorProperty");
    private final static QName _AdaptorTypeSubmissionSystem_QNAME = new QName("", "SubmissionSystem");
    private final static QName _AdaptorTypePorts_QNAME = new QName("", "Ports");
    private final static QName _AdaptorTypeBrokerAdaptor_QNAME = new QName("", "BrokerAdaptor");
    private final static QName _AdaptorTypeUser_QNAME = new QName("", "User");
    private final static QName _AdaptorTypeProperties_QNAME = new QName("", "Properties");
    private final static QName _DataNodeTypeHost_QNAME = new QName("", "Host");
    private final static QName _DataNodeTypePath_QNAME = new QName("", "Path");
    private final static QName _DataNodeTypeAdaptors_QNAME = new QName("", "Adaptors");
    private final static QName _DataNodeTypeStorage_QNAME = new QName("", "Storage");
    private final static QName _DataNodeTypeSharedDisks_QNAME = new QName("", "SharedDisks");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.bsc.compss.types.resources.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResourcesListType }
     * 
     */
    public ResourcesListType createResourcesListType() {
        return new ResourcesListType();
    }

    /**
     * Create an instance of {@link SharedDiskType }
     * 
     */
    public SharedDiskType createSharedDiskType() {
        return new SharedDiskType();
    }

    /**
     * Create an instance of {@link DataNodeType }
     * 
     */
    public DataNodeType createDataNodeType() {
        return new DataNodeType();
    }

    /**
     * Create an instance of {@link ComputeNodeType }
     * 
     */
    public ComputeNodeType createComputeNodeType() {
        return new ComputeNodeType();
    }

    /**
     * Create an instance of {@link ServiceType }
     * 
     */
    public ServiceType createServiceType() {
        return new ServiceType();
    }

    /**
     * Create an instance of {@link HttpType }
     * 
     */
    public HttpType createHttpType() {
        return new HttpType();
    }

    /**
     * Create an instance of {@link CloudProviderType }
     * 
     */
    public CloudProviderType createCloudProviderType() {
        return new CloudProviderType();
    }

    /**
     * Create an instance of {@link StorageType }
     * 
     */
    public StorageType createStorageType() {
        return new StorageType();
    }

    /**
     * Create an instance of {@link AdaptorsListType }
     * 
     */
    public AdaptorsListType createAdaptorsListType() {
        return new AdaptorsListType();
    }

    /**
     * Create an instance of {@link AdaptorType }
     * 
     */
    public AdaptorType createAdaptorType() {
        return new AdaptorType();
    }

    /**
     * Create an instance of {@link SubmissionSystemType }
     * 
     */
    public SubmissionSystemType createSubmissionSystemType() {
        return new SubmissionSystemType();
    }

    /**
     * Create an instance of {@link BatchType }
     * 
     */
    public BatchType createBatchType() {
        return new BatchType();
    }

    /**
     * Create an instance of {@link InteractiveType }
     * 
     */
    public InteractiveType createInteractiveType() {
        return new InteractiveType();
    }

    /**
     * Create an instance of {@link ResourcesNIOAdaptorProperties }
     * 
     */
    public ResourcesNIOAdaptorProperties createResourcesNIOAdaptorProperties() {
        return new ResourcesNIOAdaptorProperties();
    }

    /**
     * Create an instance of {@link ResourcesExternalAdaptorProperties }
     * 
     */
    public ResourcesExternalAdaptorProperties createResourcesExternalAdaptorProperties() {
        return new ResourcesExternalAdaptorProperties();
    }

    /**
     * Create an instance of {@link ResourcesPropertyAdaptorType }
     * 
     */
    public ResourcesPropertyAdaptorType createResourcesPropertyAdaptorType() {
        return new ResourcesPropertyAdaptorType();
    }

    /**
     * Create an instance of {@link AttachedDisksListType }
     * 
     */
    public AttachedDisksListType createAttachedDisksListType() {
        return new AttachedDisksListType();
    }

    /**
     * Create an instance of {@link AttachedDiskType }
     * 
     */
    public AttachedDiskType createAttachedDiskType() {
        return new AttachedDiskType();
    }

    /**
     * Create an instance of {@link ProcessorType }
     * 
     */
    public ProcessorType createProcessorType() {
        return new ProcessorType();
    }

    /**
     * Create an instance of {@link ProcessorPropertyType }
     * 
     */
    public ProcessorPropertyType createProcessorPropertyType() {
        return new ProcessorPropertyType();
    }

    /**
     * Create an instance of {@link MemoryType }
     * 
     */
    public MemoryType createMemoryType() {
        return new MemoryType();
    }

    /**
     * Create an instance of {@link OSType }
     * 
     */
    public OSType createOSType() {
        return new OSType();
    }

    /**
     * Create an instance of {@link SoftwareListType }
     * 
     */
    public SoftwareListType createSoftwareListType() {
        return new SoftwareListType();
    }

    /**
     * Create an instance of {@link PriceType }
     * 
     */
    public PriceType createPriceType() {
        return new PriceType();
    }

    /**
     * Create an instance of {@link EndpointType }
     * 
     */
    public EndpointType createEndpointType() {
        return new EndpointType();
    }

    /**
     * Create an instance of {@link ImagesType }
     * 
     */
    public ImagesType createImagesType() {
        return new ImagesType();
    }

    /**
     * Create an instance of {@link ImageType }
     * 
     */
    public ImageType createImageType() {
        return new ImageType();
    }

    /**
     * Create an instance of {@link InstanceTypesType }
     * 
     */
    public InstanceTypesType createInstanceTypesType() {
        return new InstanceTypesType();
    }

    /**
     * Create an instance of {@link InstanceTypeType }
     * 
     */
    public InstanceTypeType createInstanceTypeType() {
        return new InstanceTypeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourcesListType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourcesListType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ResourcesList")
    public JAXBElement<ResourcesListType> createResourcesList(ResourcesListType value) {
        return new JAXBElement<ResourcesListType>(_ResourcesList_QNAME, ResourcesListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Server", scope = EndpointType.class)
    public JAXBElement<String> createEndpointTypeServer(String value) {
        return new JAXBElement<String>(_EndpointTypeServer_QNAME, String.class, EndpointType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ConnectorJar", scope = EndpointType.class)
    public JAXBElement<String> createEndpointTypeConnectorJar(String value) {
        return new JAXBElement<String>(_EndpointTypeConnectorJar_QNAME, String.class, EndpointType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ConnectorClass", scope = EndpointType.class)
    public JAXBElement<String> createEndpointTypeConnectorClass(String value) {
        return new JAXBElement<String>(_EndpointTypeConnectorClass_QNAME, String.class, EndpointType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Port", scope = EndpointType.class)
    public JAXBElement<String> createEndpointTypePort(String value) {
        return new JAXBElement<String>(_EndpointTypePort_QNAME, String.class, EndpointType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OSTypeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OSTypeType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Type", scope = OSType.class)
    public JAXBElement<OSTypeType> createOSTypeType(OSTypeType value) {
        return new JAXBElement<OSTypeType>(_OSTypeType_QNAME, OSTypeType.class, OSType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Distribution", scope = OSType.class)
    public JAXBElement<String> createOSTypeDistribution(String value) {
        return new JAXBElement<String>(_OSTypeDistribution_QNAME, String.class, OSType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Version", scope = OSType.class)
    public JAXBElement<String> createOSTypeVersion(String value) {
        return new JAXBElement<String>(_OSTypeVersion_QNAME, String.class, OSType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ComputingUnits", scope = ProcessorType.class)
    public JAXBElement<Integer> createProcessorTypeComputingUnits(Integer value) {
        return new JAXBElement<Integer>(_ProcessorTypeComputingUnits_QNAME, Integer.class, ProcessorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Architecture", scope = ProcessorType.class)
    public JAXBElement<String> createProcessorTypeArchitecture(String value) {
        return new JAXBElement<String>(_ProcessorTypeArchitecture_QNAME, String.class, ProcessorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Speed", scope = ProcessorType.class)
    public JAXBElement<Float> createProcessorTypeSpeed(Float value) {
        return new JAXBElement<Float>(_ProcessorTypeSpeed_QNAME, Float.class, ProcessorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Type", scope = ProcessorType.class)
    public JAXBElement<String> createProcessorTypeType(String value) {
        return new JAXBElement<String>(_OSTypeType_QNAME, String.class, ProcessorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "InternalMemorySize", scope = ProcessorType.class)
    public JAXBElement<Float> createProcessorTypeInternalMemorySize(Float value) {
        return new JAXBElement<Float>(_ProcessorTypeInternalMemorySize_QNAME, Float.class, ProcessorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessorPropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcessorPropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ProcessorProperty", scope = ProcessorType.class)
    public JAXBElement<ProcessorPropertyType> createProcessorTypeProcessorProperty(ProcessorPropertyType value) {
        return new JAXBElement<ProcessorPropertyType>(_ProcessorTypeProcessorProperty_QNAME, ProcessorPropertyType.class, ProcessorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmissionSystemType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubmissionSystemType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "SubmissionSystem", scope = AdaptorType.class)
    public JAXBElement<SubmissionSystemType> createAdaptorTypeSubmissionSystem(SubmissionSystemType value) {
        return new JAXBElement<SubmissionSystemType>(_AdaptorTypeSubmissionSystem_QNAME, SubmissionSystemType.class, AdaptorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourcesNIOAdaptorProperties }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourcesNIOAdaptorProperties }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Ports", scope = AdaptorType.class)
    public JAXBElement<ResourcesNIOAdaptorProperties> createAdaptorTypePorts(ResourcesNIOAdaptorProperties value) {
        return new JAXBElement<ResourcesNIOAdaptorProperties>(_AdaptorTypePorts_QNAME, ResourcesNIOAdaptorProperties.class, AdaptorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "BrokerAdaptor", scope = AdaptorType.class)
    public JAXBElement<String> createAdaptorTypeBrokerAdaptor(String value) {
        return new JAXBElement<String>(_AdaptorTypeBrokerAdaptor_QNAME, String.class, AdaptorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "User", scope = AdaptorType.class)
    public JAXBElement<String> createAdaptorTypeUser(String value) {
        return new JAXBElement<String>(_AdaptorTypeUser_QNAME, String.class, AdaptorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourcesExternalAdaptorProperties }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourcesExternalAdaptorProperties }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Properties", scope = AdaptorType.class)
    public JAXBElement<ResourcesExternalAdaptorProperties> createAdaptorTypeProperties(ResourcesExternalAdaptorProperties value) {
        return new JAXBElement<ResourcesExternalAdaptorProperties>(_AdaptorTypeProperties_QNAME, ResourcesExternalAdaptorProperties.class, AdaptorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Host", scope = DataNodeType.class)
    public JAXBElement<String> createDataNodeTypeHost(String value) {
        return new JAXBElement<String>(_DataNodeTypeHost_QNAME, String.class, DataNodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Path", scope = DataNodeType.class)
    public JAXBElement<String> createDataNodeTypePath(String value) {
        return new JAXBElement<String>(_DataNodeTypePath_QNAME, String.class, DataNodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdaptorsListType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdaptorsListType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Adaptors", scope = DataNodeType.class)
    public JAXBElement<AdaptorsListType> createDataNodeTypeAdaptors(AdaptorsListType value) {
        return new JAXBElement<AdaptorsListType>(_DataNodeTypeAdaptors_QNAME, AdaptorsListType.class, DataNodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StorageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StorageType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Storage", scope = DataNodeType.class)
    public JAXBElement<StorageType> createDataNodeTypeStorage(StorageType value) {
        return new JAXBElement<StorageType>(_DataNodeTypeStorage_QNAME, StorageType.class, DataNodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachedDisksListType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AttachedDisksListType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "SharedDisks", scope = DataNodeType.class)
    public JAXBElement<AttachedDisksListType> createDataNodeTypeSharedDisks(AttachedDisksListType value) {
        return new JAXBElement<AttachedDisksListType>(_DataNodeTypeSharedDisks_QNAME, AttachedDisksListType.class, DataNodeType.class, value);
    }

}
