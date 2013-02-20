
package com.approuter.schemas._2008._1.deployment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserConfigurationsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserConfigurationsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userConfigurations" type="{http://www.approuter.com/schemas/2008/1/deployment}userConfiguration" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserConfigurationsResponse", propOrder = {
    "userConfigurations"
})
public class GetUserConfigurationsResponse {

    protected List<UserConfiguration> userConfigurations;

    /**
     * Gets the value of the userConfigurations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userConfigurations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserConfigurations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserConfiguration }
     * 
     * 
     */
    public List<UserConfiguration> getUserConfigurations() {
        if (userConfigurations == null) {
            userConfigurations = new ArrayList<UserConfiguration>();
        }
        return this.userConfigurations;
    }

}
