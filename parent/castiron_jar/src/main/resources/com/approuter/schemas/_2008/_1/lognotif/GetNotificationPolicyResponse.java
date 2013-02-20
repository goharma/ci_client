
package com.approuter.schemas._2008._1.lognotif;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getNotificationPolicyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getNotificationPolicyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notificationPolicy" type="{http://www.approuter.com/schemas/2008/1/lognotif}notificationPolicy" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNotificationPolicyResponse", propOrder = {
    "notificationPolicy"
})
public class GetNotificationPolicyResponse {

    protected NotificationPolicy notificationPolicy;

    /**
     * Gets the value of the notificationPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationPolicy }
     *     
     */
    public NotificationPolicy getNotificationPolicy() {
        return notificationPolicy;
    }

    /**
     * Sets the value of the notificationPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationPolicy }
     *     
     */
    public void setNotificationPolicy(NotificationPolicy value) {
        this.notificationPolicy = value;
    }

}
