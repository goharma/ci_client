
package com.approuter.schemas._2008._1.security;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isRealmUserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isRealmUserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isRealmUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isRealmUserResponse", propOrder = {
    "isRealmUser"
})
public class IsRealmUserResponse {

    protected boolean isRealmUser;

    /**
     * Gets the value of the isRealmUser property.
     * 
     */
    public boolean isIsRealmUser() {
        return isRealmUser;
    }

    /**
     * Sets the value of the isRealmUser property.
     * 
     */
    public void setIsRealmUser(boolean value) {
        this.isRealmUser = value;
    }

}
