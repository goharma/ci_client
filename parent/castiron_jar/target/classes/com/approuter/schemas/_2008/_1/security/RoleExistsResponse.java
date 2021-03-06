
package com.approuter.schemas._2008._1.security;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for roleExistsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="roleExistsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roleExists" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "roleExistsResponse", propOrder = {
    "roleExists"
})
public class RoleExistsResponse {

    protected boolean roleExists;

    /**
     * Gets the value of the roleExists property.
     * 
     */
    public boolean isRoleExists() {
        return roleExists;
    }

    /**
     * Sets the value of the roleExists property.
     * 
     */
    public void setRoleExists(boolean value) {
        this.roleExists = value;
    }

}
