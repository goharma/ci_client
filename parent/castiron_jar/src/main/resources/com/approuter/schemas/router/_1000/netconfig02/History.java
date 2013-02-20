
package com.approuter.schemas.router._1000.netconfig02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for History complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="History">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startAttempt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="started" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stopped" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stopReason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "History", propOrder = {
    "startAttempt",
    "started",
    "stopped",
    "stopReason",
    "current"
})
public class History {

    @XmlElement(required = true)
    protected String startAttempt;
    @XmlElement(required = true)
    protected String started;
    @XmlElement(required = true)
    protected String stopped;
    @XmlElement(required = true)
    protected String stopReason;
    @XmlElement(required = true)
    protected String current;

    /**
     * Gets the value of the startAttempt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartAttempt() {
        return startAttempt;
    }

    /**
     * Sets the value of the startAttempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartAttempt(String value) {
        this.startAttempt = value;
    }

    /**
     * Gets the value of the started property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStarted() {
        return started;
    }

    /**
     * Sets the value of the started property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStarted(String value) {
        this.started = value;
    }

    /**
     * Gets the value of the stopped property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopped() {
        return stopped;
    }

    /**
     * Sets the value of the stopped property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopped(String value) {
        this.stopped = value;
    }

    /**
     * Gets the value of the stopReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopReason() {
        return stopReason;
    }

    /**
     * Sets the value of the stopReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopReason(String value) {
        this.stopReason = value;
    }

    /**
     * Gets the value of the current property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrent(String value) {
        this.current = value;
    }

}
