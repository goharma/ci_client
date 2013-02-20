
package com.approuter.schemas._2008._1.security;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLdapConfigurationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLdapConfigurationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ldapConfig" type="{http://www.approuter.com/schemas/2008/1/security}ldapConfig" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLdapConfigurationResponse", propOrder = {
    "ldapConfig"
})
public class GetLdapConfigurationResponse {

    protected LdapConfig ldapConfig;

    /**
     * Gets the value of the ldapConfig property.
     * 
     * @return
     *     possible object is
     *     {@link LdapConfig }
     *     
     */
    public LdapConfig getLdapConfig() {
        return ldapConfig;
    }

    /**
     * Sets the value of the ldapConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdapConfig }
     *     
     */
    public void setLdapConfig(LdapConfig value) {
        this.ldapConfig = value;
    }

}
