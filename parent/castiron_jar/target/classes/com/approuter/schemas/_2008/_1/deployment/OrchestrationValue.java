
package com.approuter.schemas._2008._1.deployment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orchestrationValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orchestrationValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="syncLoggingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="loggingLevel" type="{http://www.approuter.com/schemas/2008/1/deployment}orchestrationLoggingLevel" minOccurs="0"/>
 *         &lt;element name="maxJobs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orchestrationRelativeurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.approuter.com/schemas/2008/1/deployment}configurationState" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orchestrationValue", propOrder = {
    "enabled",
    "syncLoggingEnabled",
    "loggingLevel",
    "maxJobs",
    "orchestrationRelativeurl",
    "state"
})
public class OrchestrationValue {

    @XmlElement(namespace = "")
    protected boolean enabled;
    @XmlElement(namespace = "")
    protected boolean syncLoggingEnabled;
    @XmlElement(namespace = "")
    protected OrchestrationLoggingLevel loggingLevel;
    @XmlElement(namespace = "")
    protected int maxJobs;
    @XmlElement(namespace = "")
    protected String orchestrationRelativeurl;
    @XmlElement(namespace = "")
    protected ConfigurationState state;

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the syncLoggingEnabled property.
     * 
     */
    public boolean isSyncLoggingEnabled() {
        return syncLoggingEnabled;
    }

    /**
     * Sets the value of the syncLoggingEnabled property.
     * 
     */
    public void setSyncLoggingEnabled(boolean value) {
        this.syncLoggingEnabled = value;
    }

    /**
     * Gets the value of the loggingLevel property.
     * 
     * @return
     *     possible object is
     *     {@link OrchestrationLoggingLevel }
     *     
     */
    public OrchestrationLoggingLevel getLoggingLevel() {
        return loggingLevel;
    }

    /**
     * Sets the value of the loggingLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrchestrationLoggingLevel }
     *     
     */
    public void setLoggingLevel(OrchestrationLoggingLevel value) {
        this.loggingLevel = value;
    }

    /**
     * Gets the value of the maxJobs property.
     * 
     */
    public int getMaxJobs() {
        return maxJobs;
    }

    /**
     * Sets the value of the maxJobs property.
     * 
     */
    public void setMaxJobs(int value) {
        this.maxJobs = value;
    }

    /**
     * Gets the value of the orchestrationRelativeurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrchestrationRelativeurl() {
        return orchestrationRelativeurl;
    }

    /**
     * Sets the value of the orchestrationRelativeurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrchestrationRelativeurl(String value) {
        this.orchestrationRelativeurl = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationState }
     *     
     */
    public ConfigurationState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationState }
     *     
     */
    public void setState(ConfigurationState value) {
        this.state = value;
    }

}
