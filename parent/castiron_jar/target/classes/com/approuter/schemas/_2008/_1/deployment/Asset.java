
package com.approuter.schemas._2008._1.deployment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for asset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="asset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseobject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moduleid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orchestration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asset", propOrder = {
    "baseobject",
    "moduleid",
    "orchestration"
})
public class Asset {

    @XmlElement(namespace = "")
    protected String baseobject;
    @XmlElement(namespace = "")
    protected String moduleid;
    @XmlElement(namespace = "")
    protected String orchestration;

    /**
     * Gets the value of the baseobject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseobject() {
        return baseobject;
    }

    /**
     * Sets the value of the baseobject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseobject(String value) {
        this.baseobject = value;
    }

    /**
     * Gets the value of the moduleid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleid() {
        return moduleid;
    }

    /**
     * Sets the value of the moduleid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleid(String value) {
        this.moduleid = value;
    }

    /**
     * Gets the value of the orchestration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrchestration() {
        return orchestration;
    }

    /**
     * Sets the value of the orchestration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrchestration(String value) {
        this.orchestration = value;
    }

}
