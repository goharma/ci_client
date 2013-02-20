
package com.approuter.schemas._2008._1.security;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.approuter.schema.router._1000.security._03.Privilege;


/**
 * <p>Java class for revokePrivilege complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="revokePrivilege">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="privilege" type="{http://www.approuter.com/schema/router/1000/security/03}privilege" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "revokePrivilege", propOrder = {
    "privilege"
})
public class RevokePrivilege {

    protected Privilege privilege;

    /**
     * Gets the value of the privilege property.
     * 
     * @return
     *     possible object is
     *     {@link Privilege }
     *     
     */
    public Privilege getPrivilege() {
        return privilege;
    }

    /**
     * Sets the value of the privilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link Privilege }
     *     
     */
    public void setPrivilege(Privilege value) {
        this.privilege = value;
    }

}
