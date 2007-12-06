//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.12.06 at 11:32:15 GMT 
//


package hermes.config;


/**
 * Java content class for HermesConfig complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/C:/work/Workspaces/Hermes/HermesJMS/src/xml/hermes-schema.xsd line 115)
 * <p>
 * <pre>
 * &lt;complexType name="HermesConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classpathGroup" type="{}ClasspathGroupConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="watch" type="{}WatchConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="naming" type="{}NamingConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="renderer" type="{}RendererConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="loader" type="{}ClasspathConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="factory" type="{}FactoryConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="remote" type="{}RemoteConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="jdbcStore" type="{}JDBCStore" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="filters" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="quickFIX" type="{}QuickFIXConfig" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="auditDirectory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="autoBrowseRefreshRate" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="base64EncodeMessages" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="copyJMSCorrelationID" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="copyJMSExpiration" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="copyJMSPriority" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="copyJMSProviderProperties" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="copyJMSReplyTo" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="copyJMSType" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="correctDropSemantics" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="deliveryModePersistent" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="displayFactoryAdmin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="embeddedMessageInBrowsePane" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="enableJython" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="lastEditedByHermesVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastEditedByUser" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lookAndFeel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxColumnsInStatisticsTable" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="maxMessagesInBrowserPane" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="maxThreadPoolSize" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="messageFilesDir" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="messageStoreSession" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="queueBrowseConsumerTimeout" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="scrollMessagesDuringBrowse" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="selectorImpl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface HermesConfig {


    /**
     * Gets the value of the Loader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Loader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link hermes.config.ClasspathConfig}
     * 
     */
    java.util.List getLoader();

    /**
     * Gets the value of the copyJMSPriority property.
     * 
     */
    boolean isCopyJMSPriority();

    /**
     * Sets the value of the copyJMSPriority property.
     * 
     */
    void setCopyJMSPriority(boolean value);

    /**
     * Gets the value of the maxThreadPoolSize property.
     * 
     */
    int getMaxThreadPoolSize();

    /**
     * Sets the value of the maxThreadPoolSize property.
     * 
     */
    void setMaxThreadPoolSize(int value);

    /**
     * Gets the value of the auditDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAuditDirectory();

    /**
     * Sets the value of the auditDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAuditDirectory(java.lang.String value);

    /**
     * Gets the value of the scrollMessagesDuringBrowse property.
     * 
     */
    boolean isScrollMessagesDuringBrowse();

    /**
     * Sets the value of the scrollMessagesDuringBrowse property.
     * 
     */
    void setScrollMessagesDuringBrowse(boolean value);

    /**
     * Gets the value of the displayFactoryAdmin property.
     * 
     */
    boolean isDisplayFactoryAdmin();

    /**
     * Sets the value of the displayFactoryAdmin property.
     * 
     */
    void setDisplayFactoryAdmin(boolean value);

    /**
     * Gets the value of the Renderer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Renderer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRenderer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link hermes.config.RendererConfig}
     * 
     */
    java.util.List getRenderer();

    /**
     * Gets the value of the correctDropSemantics property.
     * 
     */
    boolean isCorrectDropSemantics();

    /**
     * Sets the value of the correctDropSemantics property.
     * 
     */
    void setCorrectDropSemantics(boolean value);

    /**
     * Gets the value of the autoBrowseRefreshRate property.
     * 
     */
    int getAutoBrowseRefreshRate();

    /**
     * Sets the value of the autoBrowseRefreshRate property.
     * 
     */
    void setAutoBrowseRefreshRate(int value);

    /**
     * Gets the value of the Watch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Watch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link hermes.config.WatchConfig}
     * 
     */
    java.util.List getWatch();

    /**
     * Gets the value of the messageStoreSession property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getMessageStoreSession();

    /**
     * Sets the value of the messageStoreSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setMessageStoreSession(java.lang.String value);

    /**
     * Gets the value of the Remote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Remote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link hermes.config.RemoteConfig}
     * 
     */
    java.util.List getRemote();

    /**
     * Gets the value of the selectorImpl property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getSelectorImpl();

    /**
     * Sets the value of the selectorImpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setSelectorImpl(java.lang.String value);

    /**
     * Gets the value of the messageFilesDir property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getMessageFilesDir();

    /**
     * Sets the value of the messageFilesDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setMessageFilesDir(java.lang.String value);

    /**
     * Gets the value of the copyJMSCorrelationID property.
     * 
     */
    boolean isCopyJMSCorrelationID();

    /**
     * Sets the value of the copyJMSCorrelationID property.
     * 
     */
    void setCopyJMSCorrelationID(boolean value);

    /**
     * Gets the value of the copyJMSExpiration property.
     * 
     */
    boolean isCopyJMSExpiration();

    /**
     * Sets the value of the copyJMSExpiration property.
     * 
     */
    void setCopyJMSExpiration(boolean value);

    /**
     * Gets the value of the maxColumnsInStatisticsTable property.
     * 
     */
    int getMaxColumnsInStatisticsTable();

    /**
     * Sets the value of the maxColumnsInStatisticsTable property.
     * 
     */
    void setMaxColumnsInStatisticsTable(int value);

    /**
     * Gets the value of the version property.
     * 
     */
    int getVersion();

    /**
     * Sets the value of the version property.
     * 
     */
    void setVersion(int value);

    /**
     * Gets the value of the queueBrowseConsumerTimeout property.
     * 
     */
    long getQueueBrowseConsumerTimeout();

    /**
     * Sets the value of the queueBrowseConsumerTimeout property.
     * 
     */
    void setQueueBrowseConsumerTimeout(long value);

    /**
     * Gets the value of the maxMessagesInBrowserPane property.
     * 
     */
    int getMaxMessagesInBrowserPane();

    /**
     * Sets the value of the maxMessagesInBrowserPane property.
     * 
     */
    void setMaxMessagesInBrowserPane(int value);

    /**
     * Gets the value of the embeddedMessageInBrowsePane property.
     * 
     */
    boolean isEmbeddedMessageInBrowsePane();

    /**
     * Sets the value of the embeddedMessageInBrowsePane property.
     * 
     */
    void setEmbeddedMessageInBrowsePane(boolean value);

    /**
     * Gets the value of the deliveryModePersistent property.
     * 
     */
    boolean isDeliveryModePersistent();

    /**
     * Sets the value of the deliveryModePersistent property.
     * 
     */
    void setDeliveryModePersistent(boolean value);

    /**
     * Gets the value of the lastEditedByUser property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getLastEditedByUser();

    /**
     * Sets the value of the lastEditedByUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setLastEditedByUser(java.lang.String value);

    /**
     * Gets the value of the quickFIX property.
     * 
     * @return
     *     possible object is
     *     {@link hermes.config.QuickFIXConfig}
     */
    hermes.config.QuickFIXConfig getQuickFIX();

    /**
     * Sets the value of the quickFIX property.
     * 
     * @param value
     *     allowed object is
     *     {@link hermes.config.QuickFIXConfig}
     */
    void setQuickFIX(hermes.config.QuickFIXConfig value);

    /**
     * Gets the value of the lookAndFeel property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getLookAndFeel();

    /**
     * Sets the value of the lookAndFeel property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setLookAndFeel(java.lang.String value);

    /**
     * Gets the value of the Factory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Factory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFactory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link hermes.config.FactoryConfig}
     * 
     */
    java.util.List getFactory();

    /**
     * Gets the value of the ClasspathGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ClasspathGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClasspathGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link hermes.config.ClasspathGroupConfig}
     * 
     */
    java.util.List getClasspathGroup();

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getDisplayName();

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setDisplayName(java.lang.String value);

    /**
     * Gets the value of the Filters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Filters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String}
     * 
     */
    java.util.List getFilters();

    /**
     * Gets the value of the copyJMSProviderProperties property.
     * 
     */
    boolean isCopyJMSProviderProperties();

    /**
     * Sets the value of the copyJMSProviderProperties property.
     * 
     */
    void setCopyJMSProviderProperties(boolean value);

    /**
     * Gets the value of the enableJython property.
     * 
     */
    boolean isEnableJython();

    /**
     * Sets the value of the enableJython property.
     * 
     */
    void setEnableJython(boolean value);

    /**
     * Gets the value of the copyJMSType property.
     * 
     */
    boolean isCopyJMSType();

    /**
     * Sets the value of the copyJMSType property.
     * 
     */
    void setCopyJMSType(boolean value);

    /**
     * Gets the value of the lastEditedByHermesVersion property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getLastEditedByHermesVersion();

    /**
     * Sets the value of the lastEditedByHermesVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setLastEditedByHermesVersion(java.lang.String value);

    /**
     * Gets the value of the Naming property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Naming property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNaming().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link hermes.config.NamingConfig}
     * 
     */
    java.util.List getNaming();

    /**
     * Gets the value of the JdbcStore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the JdbcStore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJdbcStore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link hermes.config.JDBCStore}
     * 
     */
    java.util.List getJdbcStore();

    /**
     * Gets the value of the copyJMSReplyTo property.
     * 
     */
    boolean isCopyJMSReplyTo();

    /**
     * Sets the value of the copyJMSReplyTo property.
     * 
     */
    void setCopyJMSReplyTo(boolean value);

    /**
     * Gets the value of the base64EncodeMessages property.
     * 
     */
    boolean isBase64EncodeMessages();

    /**
     * Sets the value of the base64EncodeMessages property.
     * 
     */
    void setBase64EncodeMessages(boolean value);

}
