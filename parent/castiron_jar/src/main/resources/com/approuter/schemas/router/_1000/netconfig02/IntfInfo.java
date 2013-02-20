
package com.approuter.schemas.router._1000.netconfig02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntfInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntfInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ipaddr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="netmask" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="broadcast" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntfInfo", propOrder = {
    "ipaddr",
    "netmask",
    "broadcast"
})
public class IntfInfo {

    @XmlElement(required = true)
    protected String ipaddr;
    @XmlElement(required = true)
    protected String netmask;
    @XmlElement(required = true)
    protected String broadcast;

    /**
     * Gets the value of the ipaddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpaddr() {
        return ipaddr;
    }

    /**
     * Sets the value of the ipaddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpaddr(String value) {
        this.ipaddr = value;
    }

    /**
     * Gets the value of the netmask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetmask() {
        return netmask;
    }

    /**
     * Sets the value of the netmask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetmask(String value) {
        this.netmask = value;
    }

    /**
     * Gets the value of the broadcast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBroadcast() {
        return broadcast;
    }

    /**
     * Sets the value of the broadcast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBroadcast(String value) {
        this.broadcast = value;
    }

}
