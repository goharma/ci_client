
package com.approuter.schemas._2008._1.deployment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserConfigurationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserConfigurationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userConfiguration" type="{http://www.approuter.com/schemas/2008/1/deployment}userConfiguration" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserConfigurationResponse", propOrder = {
    "userConfiguration"
})
public class GetUserConfigurationResponse {

    protected UserConfiguration userConfiguration;

    /**
     * Gets the value of the userConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link UserConfiguration }
     *     
     */
    public UserConfiguration getUserConfiguration() {
        return userConfiguration;
    }

    /**
     * Sets the value of the userConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserConfiguration }
     *     
     */
    public void setUserConfiguration(UserConfiguration value) {
        this.userConfiguration = value;
    }

}
