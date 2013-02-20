
package com.approuter.schemas._2008._1.deployment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for guid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="guid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guidString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guid", propOrder = {
    "guidString"
})
public class Guid {

    @XmlElement(namespace = "")
    protected String guidString;

    /**
     * Gets the value of the guidString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuidString() {
        return guidString;
    }

    /**
     * Sets the value of the guidString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuidString(String value) {
        this.guidString = value;
    }

}
