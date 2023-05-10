//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.01.17 a las 03:27:59 PM CET 
//


package es.bsc.compss.types.project.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ApplicationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ApplicationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="AppDir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LibraryPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Classpath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pythonpath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EnvironmentScript" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PythonInterpreter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationType", propOrder = {

})
public class ApplicationType {

    @XmlElement(name = "AppDir")
    protected String appDir;
    @XmlElement(name = "LibraryPath")
    protected String libraryPath;
    @XmlElement(name = "Classpath")
    protected String classpath;
    @XmlElement(name = "Pythonpath")
    protected String pythonpath;
    @XmlElement(name = "EnvironmentScript")
    protected String environmentScript;
    @XmlElement(name = "PythonInterpreter")
    protected String pythonInterpreter;

    /**
     * Obtiene el valor de la propiedad appDir.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppDir() {
        return appDir;
    }

    /**
     * Define el valor de la propiedad appDir.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppDir(String value) {
        this.appDir = value;
    }

    /**
     * Obtiene el valor de la propiedad libraryPath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryPath() {
        return libraryPath;
    }

    /**
     * Define el valor de la propiedad libraryPath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryPath(String value) {
        this.libraryPath = value;
    }

    /**
     * Obtiene el valor de la propiedad classpath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClasspath() {
        return classpath;
    }

    /**
     * Define el valor de la propiedad classpath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClasspath(String value) {
        this.classpath = value;
    }

    /**
     * Obtiene el valor de la propiedad pythonpath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPythonpath() {
        return pythonpath;
    }

    /**
     * Define el valor de la propiedad pythonpath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPythonpath(String value) {
        this.pythonpath = value;
    }

    /**
     * Obtiene el valor de la propiedad environmentScript.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironmentScript() {
        return environmentScript;
    }

    /**
     * Define el valor de la propiedad environmentScript.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironmentScript(String value) {
        this.environmentScript = value;
    }

    /**
     * Obtiene el valor de la propiedad pythonInterpreter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPythonInterpreter() {
        return pythonInterpreter;
    }

    /**
     * Define el valor de la propiedad pythonInterpreter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPythonInterpreter(String value) {
        this.pythonInterpreter = value;
    }

}
