//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.01.10 at 06:38:11 GMT 
//


package hermes.config;


/**
 * Java content class for QuickFIXConfig complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/C:/work/Workspaces/Hermes/Hermes/src/xml/hermes-schema.xsd line 110)
 * <p>
 * <pre>
 * &lt;complexType name="QuickFIXConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="cacheSize" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="filterSessionMsgTypes" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface QuickFIXConfig {


    /**
     * Gets the value of the cacheSize property.
     * 
     */
    int getCacheSize();

    /**
     * Sets the value of the cacheSize property.
     * 
     */
    void setCacheSize(int value);

    /**
     * Gets the value of the filterSessionMsgTypes property.
     * 
     */
    boolean isFilterSessionMsgTypes();

    /**
     * Sets the value of the filterSessionMsgTypes property.
     * 
     */
    void setFilterSessionMsgTypes(boolean value);

}
