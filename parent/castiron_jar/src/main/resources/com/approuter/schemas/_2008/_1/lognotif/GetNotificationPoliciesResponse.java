
package com.approuter.schemas._2008._1.lognotif;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getNotificationPoliciesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getNotificationPoliciesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notificationPolicies" type="{http://www.approuter.com/schemas/2008/1/lognotif}notificationPolicy" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNotificationPoliciesResponse", propOrder = {
    "notificationPolicies"
})
public class GetNotificationPoliciesResponse {

    protected List<NotificationPolicy> notificationPolicies;

    /**
     * Gets the value of the notificationPolicies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationPolicies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationPolicies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationPolicy }
     * 
     * 
     */
    public List<NotificationPolicy> getNotificationPolicies() {
        if (notificationPolicies == null) {
            notificationPolicies = new ArrayList<NotificationPolicy>();
        }
        return this.notificationPolicies;
    }

}
