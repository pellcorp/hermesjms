//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.01.10 at 06:38:11 GMT 
//


package hermes.config;


/**
 * Java content class for ClasspathConfig complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/C:/work/Workspaces/Hermes/Hermes/src/xml/hermes-schema.xsd line 75)
 * <p>
 * <pre>
 * &lt;complexType name="ClasspathConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="factories" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="jar" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="noFactories" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ClasspathConfig {


    /**
     * Gets the value of the factories property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getFactories();

    /**
     * Sets the value of the factories property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setFactories(java.lang.String value);

    /**
     * Gets the value of the jar property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getJar();

    /**
     * Sets the value of the jar property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setJar(java.lang.String value);

    /**
     * Gets the value of the noFactories property.
     * 
     */
    boolean isNoFactories();

    /**
     * Sets the value of the noFactories property.
     * 
     */
    void setNoFactories(boolean value);

}
