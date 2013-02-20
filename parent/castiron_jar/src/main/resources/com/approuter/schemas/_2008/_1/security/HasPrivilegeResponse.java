
package com.approuter.schemas._2008._1.security;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hasPrivilegeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hasPrivilegeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hasPrivilege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hasPrivilegeResponse", propOrder = {
    "hasPrivilege"
})
public class HasPrivilegeResponse {

    protected boolean hasPrivilege;

    /**
     * Gets the value of the hasPrivilege property.
     * 
     */
    public boolean isHasPrivilege() {
        return hasPrivilege;
    }

    /**
     * Sets the value of the hasPrivilege property.
     * 
     */
    public void setHasPrivilege(boolean value) {
        this.hasPrivilege = value;
    }

}
