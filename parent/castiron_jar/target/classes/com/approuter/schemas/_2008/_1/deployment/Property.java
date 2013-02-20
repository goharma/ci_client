
package com.approuter.schemas._2008._1.deployment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for property complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="property">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assetGroupExistence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="assetGroupValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defaultvalue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="derivedobject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="internal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "property", propOrder = {
    "assetGroupExistence",
    "assetGroupValid",
    "defaultvalue",
    "derivedobject",
    "details",
    "hidden",
    "internal",
    "name",
    "type"
})
public class Property {

    @XmlElement(namespace = "")
    protected Boolean assetGroupExistence;
    @XmlElement(namespace = "")
    protected Boolean assetGroupValid;
    @XmlElement(namespace = "")
    protected String defaultvalue;
    @XmlElement(namespace = "")
    protected String derivedobject;
    @XmlElement(namespace = "")
    protected String details;
    @XmlElement(namespace = "")
    protected boolean hidden;
    @XmlElement(namespace = "")
    protected boolean internal;
    @XmlElement(namespace = "")
    protected String name;
    @XmlElement(namespace = "")
    protected String type;

    /**
     * Gets the value of the assetGroupExistence property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssetGroupExistence() {
        return assetGroupExistence;
    }

    /**
     * Sets the value of the assetGroupExistence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssetGroupExistence(Boolean value) {
        this.assetGroupExistence = value;
    }

    /**
     * Gets the value of the assetGroupValid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssetGroupValid() {
        return assetGroupValid;
    }

    /**
     * Sets the value of the assetGroupValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssetGroupValid(Boolean value) {
        this.assetGroupValid = value;
    }

    /**
     * Gets the value of the defaultvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultvalue() {
        return defaultvalue;
    }

    /**
     * Sets the value of the defaultvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultvalue(String value) {
        this.defaultvalue = value;
    }

    /**
     * Gets the value of the derivedobject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerivedobject() {
        return derivedobject;
    }

    /**
     * Sets the value of the derivedobject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDerivedobject(String value) {
        this.derivedobject = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetails(String value) {
        this.details = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     */
    public boolean isHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     */
    public void setHidden(boolean value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the internal property.
     * 
     */
    public boolean isInternal() {
        return internal;
    }

    /**
     * Sets the value of the internal property.
     * 
     */
    public void setInternal(boolean value) {
        this.internal = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
