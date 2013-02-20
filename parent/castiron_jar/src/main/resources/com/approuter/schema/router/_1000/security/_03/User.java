
package com.approuter.schema.router._1000.security._03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="encPasswd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isMutable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isVisible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastLoginTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastFailedLoginTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="failedLoginCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lastPasswordChangeTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scopeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scopeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultThirdPartyLibId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eulaAcceptedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "id",
    "name",
    "encPasswd",
    "displayName",
    "isActive",
    "isMutable",
    "isVisible",
    "description",
    "email",
    "createdTime",
    "lastLoginTime",
    "lastFailedLoginTime",
    "failedLoginCount",
    "lastPasswordChangeTime",
    "scopeId",
    "scopeType",
    "defaultThirdPartyLibId",
    "eulaAcceptedTime"
})
public class User {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String encPasswd;
    @XmlElement(required = true)
    protected String displayName;
    protected boolean isActive;
    protected boolean isMutable;
    protected boolean isVisible;
    protected String description;
    protected String email;
    protected String createdTime;
    protected String lastLoginTime;
    protected String lastFailedLoginTime;
    @XmlElement(defaultValue = "0")
    protected int failedLoginCount;
    protected String lastPasswordChangeTime;
    protected String scopeId;
    protected String scopeType;
    protected String defaultThirdPartyLibId;
    protected String eulaAcceptedTime;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the encPasswd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncPasswd() {
        return encPasswd;
    }

    /**
     * Sets the value of the encPasswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncPasswd(String value) {
        this.encPasswd = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isMutable property.
     * 
     */
    public boolean isIsMutable() {
        return isMutable;
    }

    /**
     * Sets the value of the isMutable property.
     * 
     */
    public void setIsMutable(boolean value) {
        this.isMutable = value;
    }

    /**
     * Gets the value of the isVisible property.
     * 
     */
    public boolean isIsVisible() {
        return isVisible;
    }

    /**
     * Sets the value of the isVisible property.
     * 
     */
    public void setIsVisible(boolean value) {
        this.isVisible = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the createdTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * Sets the value of the createdTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedTime(String value) {
        this.createdTime = value;
    }

    /**
     * Gets the value of the lastLoginTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * Sets the value of the lastLoginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastLoginTime(String value) {
        this.lastLoginTime = value;
    }

    /**
     * Gets the value of the lastFailedLoginTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastFailedLoginTime() {
        return lastFailedLoginTime;
    }

    /**
     * Sets the value of the lastFailedLoginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastFailedLoginTime(String value) {
        this.lastFailedLoginTime = value;
    }

    /**
     * Gets the value of the failedLoginCount property.
     * 
     */
    public int getFailedLoginCount() {
        return failedLoginCount;
    }

    /**
     * Sets the value of the failedLoginCount property.
     * 
     */
    public void setFailedLoginCount(int value) {
        this.failedLoginCount = value;
    }

    /**
     * Gets the value of the lastPasswordChangeTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastPasswordChangeTime() {
        return lastPasswordChangeTime;
    }

    /**
     * Sets the value of the lastPasswordChangeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastPasswordChangeTime(String value) {
        this.lastPasswordChangeTime = value;
    }

    /**
     * Gets the value of the scopeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopeId() {
        return scopeId;
    }

    /**
     * Sets the value of the scopeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopeId(String value) {
        this.scopeId = value;
    }

    /**
     * Gets the value of the scopeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopeType() {
        return scopeType;
    }

    /**
     * Sets the value of the scopeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopeType(String value) {
        this.scopeType = value;
    }

    /**
     * Gets the value of the defaultThirdPartyLibId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultThirdPartyLibId() {
        return defaultThirdPartyLibId;
    }

    /**
     * Sets the value of the defaultThirdPartyLibId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultThirdPartyLibId(String value) {
        this.defaultThirdPartyLibId = value;
    }

    /**
     * Gets the value of the eulaAcceptedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEulaAcceptedTime() {
        return eulaAcceptedTime;
    }

    /**
     * Sets the value of the eulaAcceptedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEulaAcceptedTime(String value) {
        this.eulaAcceptedTime = value;
    }

}
