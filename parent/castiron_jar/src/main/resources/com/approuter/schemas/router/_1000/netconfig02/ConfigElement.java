
package com.approuter.schemas.router._1000.netconfig02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="useDhcp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dhcpSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="manual" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fallback" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigElement", propOrder = {
    "useDhcp",
    "dhcpSource",
    "manual",
    "fallback"
})
public class ConfigElement {

    protected boolean useDhcp;
    @XmlElement(required = true)
    protected String dhcpSource;
    @XmlElement(required = true)
    protected String manual;
    @XmlElement(required = true)
    protected String fallback;

    /**
     * Gets the value of the useDhcp property.
     * 
     */
    public boolean isUseDhcp() {
        return useDhcp;
    }

    /**
     * Sets the value of the useDhcp property.
     * 
     */
    public void setUseDhcp(boolean value) {
        this.useDhcp = value;
    }

    /**
     * Gets the value of the dhcpSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDhcpSource() {
        return dhcpSource;
    }

    /**
     * Sets the value of the dhcpSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDhcpSource(String value) {
        this.dhcpSource = value;
    }

    /**
     * Gets the value of the manual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManual() {
        return manual;
    }

    /**
     * Sets the value of the manual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManual(String value) {
        this.manual = value;
    }

    /**
     * Gets the value of the fallback property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFallback() {
        return fallback;
    }

    /**
     * Sets the value of the fallback property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFallback(String value) {
        this.fallback = value;
    }

}
