
package com.approuter.schemas._2008._1.security;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isUserEnabledResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isUserEnabledResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isUserEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isUserEnabledResponse", propOrder = {
    "isUserEnabled"
})
public class IsUserEnabledResponse {

    protected boolean isUserEnabled;

    /**
     * Gets the value of the isUserEnabled property.
     * 
     */
    public boolean isIsUserEnabled() {
        return isUserEnabled;
    }

    /**
     * Sets the value of the isUserEnabled property.
     * 
     */
    public void setIsUserEnabled(boolean value) {
        this.isUserEnabled = value;
    }

}
