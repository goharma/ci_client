
package com.approuter.schemas.router._1000.netconfig02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterfaceStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterfaceStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ipaddr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="netmask" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="broadcast" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MACaddr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fromDhcp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="leaseExp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isVirtual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="linkInfoValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="autoNegotiate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="speed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fullDuplex" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *       &lt;attribute name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceStatus", propOrder = {
    "ipaddr",
    "netmask",
    "broadcast",
    "maCaddr",
    "fromDhcp",
    "leaseExp",
    "isVirtual",
    "linkInfoValid",
    "autoNegotiate",
    "speed",
    "fullDuplex"
})
public class InterfaceStatus {

    @XmlElement(required = true)
    protected String ipaddr;
    @XmlElement(required = true)
    protected String netmask;
    @XmlElement(required = true)
    protected String broadcast;
    @XmlElement(name = "MACaddr", required = true)
    protected String maCaddr;
    protected boolean fromDhcp;
    @XmlElement(required = true)
    protected String leaseExp;
    protected boolean isVirtual;
    protected boolean linkInfoValid;
    protected boolean autoNegotiate;
    protected int speed;
    protected boolean fullDuplex;
    @XmlAttribute(name = "active")
    protected Boolean active;

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

    /**
     * Gets the value of the maCaddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMACaddr() {
        return maCaddr;
    }

    /**
     * Sets the value of the maCaddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMACaddr(String value) {
        this.maCaddr = value;
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
     * Gets the value of the leaseExp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaseExp() {
        return leaseExp;
    }

    /**
     * Sets the value of the leaseExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaseExp(String value) {
        this.leaseExp = value;
    }

    /**
     * Gets the value of the isVirtual property.
     * 
     */
    public boolean isIsVirtual() {
        return isVirtual;
    }

    /**
     * Sets the value of the isVirtual property.
     * 
     */
    public void setIsVirtual(boolean value) {
        this.isVirtual = value;
    }

    /**
     * Gets the value of the linkInfoValid property.
     * 
     */
    public boolean isLinkInfoValid() {
        return linkInfoValid;
    }

    /**
     * Sets the value of the linkInfoValid property.
     * 
     */
    public void setLinkInfoValid(boolean value) {
        this.linkInfoValid = value;
    }

    /**
     * Gets the value of the autoNegotiate property.
     * 
     */
    public boolean isAutoNegotiate() {
        return autoNegotiate;
    }

    /**
     * Sets the value of the autoNegotiate property.
     * 
     */
    public void setAutoNegotiate(boolean value) {
        this.autoNegotiate = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     */
    public void setSpeed(int value) {
        this.speed = value;
    }

    /**
     * Gets the value of the fullDuplex property.
     * 
     */
    public boolean isFullDuplex() {
        return fullDuplex;
    }

    /**
     * Sets the value of the fullDuplex property.
     * 
     */
    public void setFullDuplex(boolean value) {
        this.fullDuplex = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

}
