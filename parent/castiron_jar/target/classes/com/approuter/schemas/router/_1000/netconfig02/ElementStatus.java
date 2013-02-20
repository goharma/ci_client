
package com.approuter.schemas.router._1000.netconfig02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElementStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fromDhcp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dhcpSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementStatus", propOrder = {
    "value",
    "fromDhcp",
    "dhcpSource"
})
public class ElementStatus {

    @XmlElement(required = true)
    protected String value;
    protected boolean fromDhcp;
    @XmlElement(required = true)
    protected String dhcpSource;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the fromDhcp property.
     * 
     */
    public boolean isFromDhcp() {
        return fromDhcp;
    }

    /**
     * Sets the value of the fromDhcp property.
     * 
     */
    public void setFromDhcp(boolean value) {
        this.fromDhcp = value;
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

}
