
package com.approuter.schemas._2008._1.deployment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.approuter.schema.router._1000.security._03.Group;


/**
 * <p>Java class for getConfigurationGroupsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getConfigurationGroupsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupDisplayNames" type="{http://www.approuter.com/schema/router/1000/security/03}Group" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getConfigurationGroupsResponse", propOrder = {
    "groupDisplayNames"
})
public class GetConfigurationGroupsResponse {

    protected List<Group> groupDisplayNames;

    /**
     * Gets the value of the groupDisplayNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupDisplayNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupDisplayNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Group }
     * 
     * 
     */
    public List<Group> getGroupDisplayNames() {
        if (groupDisplayNames == null) {
            groupDisplayNames = new ArrayList<Group>();
        }
        return this.groupDisplayNames;
    }

}
