
package com.approuter.schemas.router._1000.netconfig02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Route complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Route">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="netmask" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="router" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="interface" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Route", propOrder = {
    "destination",
    "netmask",
    "router",
    "_interface"
})
public class Route {

    @XmlElement(required = true)
    protected String destination;
    @XmlElement(required = true)
    protected String netmask;
    @XmlElement(required = true)
    protected String router;
    @XmlElement(name = "interface", required = true)
    protected String _interface;

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
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
     * Gets the value of the router property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouter() {
        return router;
    }

    /**
     * Sets the value of the router property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouter(String value) {
        this.router = value;
    }

    /**
     * Gets the value of the interface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterface() {
        return _interface;
    }

    /**
     * Sets the value of the interface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterface(String value) {
        this._interface = value;
    }

}
