
package com.approuter.schemas._2008._1.system;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getApplianceNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getApplianceNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applianceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getApplianceNameResponse", propOrder = {
    "applianceName"
})
public class GetApplianceNameResponse {

    protected String applianceName;

    /**
     * Gets the value of the applianceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplianceName() {
        return applianceName;
    }

    /**
     * Sets the value of the applianceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplianceName(String value) {
        this.applianceName = value;
    }

}
