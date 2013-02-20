
package com.approuter.schemas.router._1000.netconfig02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Interface complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Interface">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fallback" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}IntfInfo"/>
 *         &lt;element name="manual" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}IntfInfo"/>
 *         &lt;element name="useDhcp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="useDhcpRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="autoNegotiate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="speed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fullDuplex" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Interface", propOrder = {
    "fallback",
    "manual",
    "useDhcp",
    "useDhcpRoutes",
    "autoNegotiate",
    "speed",
    "fullDuplex"
})
public class Interface {

    @XmlElement(required = true)
    protected IntfInfo fallback;
    @XmlElement(required = true)
    protected IntfInfo manual;
    protected boolean useDhcp;
    protected boolean useDhcpRoutes;
    protected boolean autoNegotiate;
    protected int speed;
    protected boolean fullDuplex;

    /**
     * Gets the value of the fallback property.
     * 
     * @return
     *     possible object is
     *     {@link IntfInfo }
     *     
     */
    public IntfInfo getFallback() {
        return fallback;
    }

    /**
     * Sets the value of the fallback property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntfInfo }
     *     
     */
    public void setFallback(IntfInfo value) {
        this.fallback = value;
    }

    /**
     * Gets the value of the manual property.
     * 
     * @return
     *     possible object is
     *     {@link IntfInfo }
     *     
     */
    public IntfInfo getManual() {
        return manual;
    }

    /**
     * Sets the value of the manual property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntfInfo }
     *     
     */
    public void setManual(IntfInfo value) {
        this.manual = value;
    }

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
     * Gets the value of the useDhcpRoutes property.
     * 
     */
    public boolean isUseDhcpRoutes() {
        return useDhcpRoutes;
    }

    /**
     * Sets the value of the useDhcpRoutes property.
     * 
     */
    public void setUseDhcpRoutes(boolean value) {
        this.useDhcpRoutes = value;
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

}
