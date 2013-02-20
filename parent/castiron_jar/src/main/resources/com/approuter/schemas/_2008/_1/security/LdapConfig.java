
package com.approuter.schemas._2008._1.security;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ldapConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ldapConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="adminGroupFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authenticationMode" type="{http://www.approuter.com/schemas/2008/1/security}ldapAuthenticationMode" minOccurs="0"/>
 *         &lt;element name="authenticationType" type="{http://www.approuter.com/schemas/2008/1/security}ldapAuthenticationType" minOccurs="0"/>
 *         &lt;element name="baseDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="host" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="principalDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publisherGroupFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saslMechanism" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userContainerRDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userGroupFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userSearchFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ldapConfig", propOrder = {
    "active",
    "adminGroupFilter",
    "authenticationMode",
    "authenticationType",
    "baseDN",
    "host",
    "password",
    "port",
    "principalDN",
    "publisherGroupFilter",
    "saslMechanism",
    "userContainerRDN",
    "userGroupFilter",
    "userSearchFilter",
    "username"
})
public class LdapConfig {

    protected boolean active;
    protected String adminGroupFilter;
    protected LdapAuthenticationMode authenticationMode;
    protected LdapAuthenticationType authenticationType;
    protected String baseDN;
    protected String host;
    protected String password;
    protected int port;
    protected String principalDN;
    protected String publisherGroupFilter;
    protected String saslMechanism;
    protected String userContainerRDN;
    protected String userGroupFilter;
    protected String userSearchFilter;
    protected String username;

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
     * Gets the value of the adminGroupFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminGroupFilter() {
        return adminGroupFilter;
    }

    /**
     * Sets the value of the adminGroupFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminGroupFilter(String value) {
        this.adminGroupFilter = value;
    }

    /**
     * Gets the value of the authenticationMode property.
     * 
     * @return
     *     possible object is
     *     {@link LdapAuthenticationMode }
     *     
     */
    public LdapAuthenticationMode getAuthenticationMode() {
        return authenticationMode;
    }

    /**
     * Sets the value of the authenticationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdapAuthenticationMode }
     *     
     */
    public void setAuthenticationMode(LdapAuthenticationMode value) {
        this.authenticationMode = value;
    }

    /**
     * Gets the value of the authenticationType property.
     * 
     * @return
     *     possible object is
     *     {@link LdapAuthenticationType }
     *     
     */
    public LdapAuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Sets the value of the authenticationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdapAuthenticationType }
     *     
     */
    public void setAuthenticationType(LdapAuthenticationType value) {
        this.authenticationType = value;
    }

    /**
     * Gets the value of the baseDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDN() {
        return baseDN;
    }

    /**
     * Sets the value of the baseDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDN(String value) {
        this.baseDN = value;
    }

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the port property.
     * 
     */
    public int getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     */
    public void setPort(int value) {
        this.port = value;
    }

    /**
     * Gets the value of the principalDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalDN() {
        return principalDN;
    }

    /**
     * Sets the value of the principalDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalDN(String value) {
        this.principalDN = value;
    }

    /**
     * Gets the value of the publisherGroupFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherGroupFilter() {
        return publisherGroupFilter;
    }

    /**
     * Sets the value of the publisherGroupFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherGroupFilter(String value) {
        this.publisherGroupFilter = value;
    }

    /**
     * Gets the value of the saslMechanism property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaslMechanism() {
        return saslMechanism;
    }

    /**
     * Sets the value of the saslMechanism property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaslMechanism(String value) {
        this.saslMechanism = value;
    }

    /**
     * Gets the value of the userContainerRDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserContainerRDN() {
        return userContainerRDN;
    }

    /**
     * Sets the value of the userContainerRDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserContainerRDN(String value) {
        this.userContainerRDN = value;
    }

    /**
     * Gets the value of the userGroupFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserGroupFilter() {
        return userGroupFilter;
    }

    /**
     * Sets the value of the userGroupFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserGroupFilter(String value) {
        this.userGroupFilter = value;
    }

    /**
     * Gets the value of the userSearchFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserSearchFilter() {
        return userSearchFilter;
    }

    /**
     * Sets the value of the userSearchFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserSearchFilter(String value) {
        this.userSearchFilter = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

}
