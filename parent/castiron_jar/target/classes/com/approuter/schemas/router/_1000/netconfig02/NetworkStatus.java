
package com.approuter.schemas.router._1000.netconfig02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="carrierTimeout" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="emgmt" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}InterfaceStatus"/>
 *         &lt;element name="edata" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}InterfaceStatus"/>
 *         &lt;element name="gateway" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}ElementStatus"/>
 *         &lt;element name="hostname" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}ElementStatus"/>
 *         &lt;element name="domain" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}ElementStatus"/>
 *         &lt;element name="search" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}ElementStatus"/>
 *         &lt;element name="dns" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}ElementStatus"/>
 *         &lt;element name="ntp" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}ElementStatus"/>
 *         &lt;element name="routes" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}RouteStatuses"/>
 *         &lt;element name="httpProxy" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}Proxy"/>
 *         &lt;element name="ftpProxy" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}Proxy"/>
 *         &lt;element name="sftpProxy" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}Proxy"/>
 *         &lt;element name="history" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}History"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkStatus", propOrder = {
    "active",
    "carrierTimeout",
    "emgmt",
    "edata",
    "gateway",
    "hostname",
    "domain",
    "search",
    "dns",
    "ntp",
    "routes",
    "httpProxy",
    "ftpProxy",
    "sftpProxy",
    "history"
})
public class NetworkStatus {

    protected boolean active;
    protected int carrierTimeout;
    @XmlElement(required = true)
    protected InterfaceStatus emgmt;
    @XmlElement(required = true)
    protected InterfaceStatus edata;
    @XmlElement(required = true)
    protected ElementStatus gateway;
    @XmlElement(required = true)
    protected ElementStatus hostname;
    @XmlElement(required = true)
    protected ElementStatus domain;
    @XmlElement(required = true)
    protected ElementStatus search;
    @XmlElement(required = true)
    protected ElementStatus dns;
    @XmlElement(required = true)
    protected ElementStatus ntp;
    @XmlElement(required = true)
    protected RouteStatuses routes;
    @XmlElement(required = true)
    protected Proxy httpProxy;
    @XmlElement(required = true)
    protected Proxy ftpProxy;
    @XmlElement(required = true)
    protected Proxy sftpProxy;
    @XmlElement(required = true)
    protected History history;

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the carrierTimeout property.
     * 
     */
    public int getCarrierTimeout() {
        return carrierTimeout;
    }

    /**
     * Sets the value of the carrierTimeout property.
     * 
     */
    public void setCarrierTimeout(int value) {
        this.carrierTimeout = value;
    }

    /**
     * Gets the value of the emgmt property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceStatus }
     *     
     */
    public InterfaceStatus getEmgmt() {
        return emgmt;
    }

    /**
     * Sets the value of the emgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceStatus }
     *     
     */
    public void setEmgmt(InterfaceStatus value) {
        this.emgmt = value;
    }

    /**
     * Gets the value of the edata property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceStatus }
     *     
     */
    public InterfaceStatus getEdata() {
        return edata;
    }

    /**
     * Sets the value of the edata property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceStatus }
     *     
     */
    public void setEdata(InterfaceStatus value) {
        this.edata = value;
    }

    /**
     * Gets the value of the gateway property.
     * 
     * @return
     *     possible object is
     *     {@link ElementStatus }
     *     
     */
    public ElementStatus getGateway() {
        return gateway;
    }

    /**
     * Sets the value of the gateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementStatus }
     *     
     */
    public void setGateway(ElementStatus value) {
        this.gateway = value;
    }

    /**
     * Gets the value of the hostname property.
     * 
     * @return
     *     possible object is
     *     {@link ElementStatus }
     *     
     */
    public ElementStatus getHostname() {
        return hostname;
    }

    /**
     * Sets the value of the hostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementStatus }
     *     
     */
    public void setHostname(ElementStatus value) {
        this.hostname = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link ElementStatus }
     *     
     */
    public ElementStatus getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementStatus }
     *     
     */
    public void setDomain(ElementStatus value) {
        this.domain = value;
    }

    /**
     * Gets the value of the search property.
     * 
     * @return
     *     possible object is
     *     {@link ElementStatus }
     *     
     */
    public ElementStatus getSearch() {
        return search;
    }

    /**
     * Sets the value of the search property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementStatus }
     *     
     */
    public void setSearch(ElementStatus value) {
        this.search = value;
    }

    /**
     * Gets the value of the dns property.
     * 
     * @return
     *     possible object is
     *     {@link ElementStatus }
     *     
     */
    public ElementStatus getDns() {
        return dns;
    }

    /**
     * Sets the value of the dns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementStatus }
     *     
     */
    public void setDns(ElementStatus value) {
        this.dns = value;
    }

    /**
     * Gets the value of the ntp property.
     * 
     * @return
     *     possible object is
     *     {@link ElementStatus }
     *     
     */
    public ElementStatus getNtp() {
        return ntp;
    }

    /**
     * Sets the value of the ntp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementStatus }
     *     
     */
    public void setNtp(ElementStatus value) {
        this.ntp = value;
    }

    /**
     * Gets the value of the routes property.
     * 
     * @return
     *     possible object is
     *     {@link RouteStatuses }
     *     
     */
    public RouteStatuses getRoutes() {
        return routes;
    }

    /**
     * Sets the value of the routes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteStatuses }
     *     
     */
    public void setRoutes(RouteStatuses value) {
        this.routes = value;
    }

    /**
     * Gets the value of the httpProxy property.
     * 
     * @return
     *     possible object is
     *     {@link Proxy }
     *     
     */
    public Proxy getHttpProxy() {
        return httpProxy;
    }

    /**
     * Sets the value of the httpProxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proxy }
     *     
     */
    public void setHttpProxy(Proxy value) {
        this.httpProxy = value;
    }

    /**
     * Gets the value of the ftpProxy property.
     * 
     * @return
     *     possible object is
     *     {@link Proxy }
     *     
     */
    public Proxy getFtpProxy() {
        return ftpProxy;
    }

    /**
     * Sets the value of the ftpProxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proxy }
     *     
     */
    public void setFtpProxy(Proxy value) {
        this.ftpProxy = value;
    }

    /**
     * Gets the value of the sftpProxy property.
     * 
     * @return
     *     possible object is
     *     {@link Proxy }
     *     
     */
    public Proxy getSftpProxy() {
        return sftpProxy;
    }

    /**
     * Sets the value of the sftpProxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proxy }
     *     
     */
    public void setSftpProxy(Proxy value) {
        this.sftpProxy = value;
    }

    /**
     * Gets the value of the history property.
     * 
     * @return
     *     possible object is
     *     {@link History }
     *     
     */
    public History getHistory() {
        return history;
    }

    /**
     * Sets the value of the history property.
     * 
     * @param value
     *     allowed object is
     *     {@link History }
     *     
     */
    public void setHistory(History value) {
        this.history = value;
    }

}
