
package com.approuter.schemas._2008._1.deployment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertyValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertyValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="propertyDefaultvalue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propertyHidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="propertyInternal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="propertyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertyValue", propOrder = {
    "propertyDefaultvalue",
    "propertyHidden",
    "propertyInternal",
    "propertyName",
    "value"
})
public class PropertyValue {

    @XmlElement(namespace = "")
    protected String propertyDefaultvalue;
    @XmlElement(namespace = "")
    protected boolean propertyHidden;
    @XmlElement(namespace = "")
    protected boolean propertyInternal;
    @XmlElement(namespace = "")
    protected String propertyName;
    @XmlElement(namespace = "")
    protected String value;

    /**
     * Gets the value of the propertyDefaultvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyDefaultvalue() {
        return propertyDefaultvalue;
    }

    /**
     * Sets the value of the propertyDefaultvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyDefaultvalue(String value) {
        this.propertyDefaultvalue = value;
    }

    /**
     * Gets the value of the propertyHidden property.
     * 
     */
    public boolean isPropertyHidden() {
        return propertyHidden;
    }

    /**
     * Sets the value of the propertyHidden property.
     * 
     */
    public void setPropertyHidden(boolean value) {
        this.propertyHidden = value;
    }

    /**
     * Gets the value of the propertyInternal property.
     * 
     */
    public boolean isPropertyInternal() {
        return propertyInternal;
    }

    /**
     * Sets the value of the propertyInternal property.
     * 
     */
    public void setPropertyInternal(boolean value) {
        this.propertyInternal = value;
    }

    /**
     * Gets the value of the propertyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Sets the value of the propertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyName(String value) {
        this.propertyName = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
