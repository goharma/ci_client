
package com.approuter.schemas.router._1000.netconfig02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emgmt" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}Interface"/>
 *         &lt;element name="edata" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}Interface"/>
 *         &lt;element name="gateway" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}ConfigElement"/>
 *         &lt;element name="hostname" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}ConfigElement"/>
 *         &lt;element name="domain" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}ConfigElement"/>
 *         &lt;element name="search" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}ConfigElement"/>
 *         &lt;element name="dns" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}ConfigElement"/>
 *         &lt;element name="ntp" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}ConfigElement"/>
 *         &lt;element name="routes" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}Routes"/>
 *         &lt;element name="httpProxy" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}Proxy"/>
 *         &lt;element name="ftpProxy" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}Proxy"/>
 *         &lt;element name="sftpProxy" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}Proxy"/>
 *         &lt;element name="carrierTimeout" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkType", propOrder = {
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
    "carrierTimeout",
    "enabled"
})
public class NetworkType {

    @XmlElement(required = true)
    protected Interface emgmt;
    @XmlElement(required = true)
    protected Interface edata;
    @XmlElement(required = true)
    protected ConfigElement gateway;
    @XmlElement(required = true)
    protected ConfigElement hostname;
    @XmlElement(required = true)
    protected ConfigElement domain;
    @XmlElement(required = true)
    protected ConfigElement search;
    @XmlElement(required = true)
    protected ConfigElement dns;
    @XmlElement(required = true)
    protected ConfigElement ntp;
    @XmlElement(required = true)
    protected Routes routes;
    @XmlElement(required = true)
    protected Proxy httpProxy;
    @XmlElement(required = true)
    protected Proxy ftpProxy;
    @XmlElement(required = true)
    protected Proxy sftpProxy;
    protected int carrierTimeout;
    protected Boolean enabled;

    /**
     * Gets the value of the emgmt property.
     * 
     * @return
     *     possible object is
     *     {@link Interface }
     *     
     */
    public Interface getEmgmt() {
        return emgmt;
    }

    /**
     * Sets the value of the emgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interface }
     *     
     */
    public void setEmgmt(Interface value) {
        this.emgmt = value;
    }

    /**
     * Gets the value of the edata property.
     * 
     * @return
     *     possible object is
     *     {@link Interface }
     *     
     */
    public Interface getEdata() {
        return edata;
    }

    /**
     * Sets the value of the edata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interface }
     *     
     */
    public void setEdata(Interface value) {
        this.edata = value;
    }

    /**
     * Gets the value of the gateway property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigElement }
     *     
     */
    public ConfigElement getGateway() {
        return gateway;
    }

    /**
     * Sets the value of the gateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigElement }
     *     
     */
    public void setGateway(ConfigElement value) {
        this.gateway = value;
    }

    /**
     * Gets the value of the hostname property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigElement }
     *     
     */
    public ConfigElement getHostname() {
        return hostname;
    }

    /**
     * Sets the value of the hostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigElement }
     *     
     */
    public void setHostname(ConfigElement value) {
        this.hostname = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigElement }
     *     
     */
    public ConfigElement getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigElement }
     *     
     */
    public void setDomain(ConfigElement value) {
        this.domain = value;
    }

    /**
     * Gets the value of the search property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigElement }
     *     
     */
    public ConfigElement getSearch() {
        return search;
    }

    /**
     * Sets the value of the search property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigElement }
     *     
     */
    public void setSearch(ConfigElement value) {
        this.search = value;
    }

    /**
     * Gets the value of the dns property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigElement }
     *     
     */
    public ConfigElement getDns() {
        return dns;
    }

    /**
     * Sets the value of the dns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigElement }
     *     
     */
    public void setDns(ConfigElement value) {
        this.dns = value;
    }

    /**
     * Gets the value of the ntp property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigElement }
     *     
     */
    public ConfigElement getNtp() {
        return ntp;
    }

    /**
     * Sets the value of the ntp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigElement }
     *     
     */
    public void setNtp(ConfigElement value) {
        this.ntp = value;
    }

    /**
     * Gets the value of the routes property.
     * 
     * @return
     *     possible object is
     *     {@link Routes }
     *     
     */
    public Routes getRoutes() {
        return routes;
    }

    /**
     * Sets the value of the routes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Routes }
     *     
     */
    public void setRoutes(Routes value) {
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
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

}
