
package com.approuter.schemas._2008._1.security;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setCurrentScopeById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setCurrentScopeById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scopeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setCurrentScopeById", propOrder = {
    "scopeId"
})
public class SetCurrentScopeById {

    protected String scopeId;

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

}
