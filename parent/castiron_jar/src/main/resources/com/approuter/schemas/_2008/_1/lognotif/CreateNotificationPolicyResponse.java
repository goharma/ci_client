
package com.approuter.schemas._2008._1.lognotif;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createNotificationPolicyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createNotificationPolicyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="policyId" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createNotificationPolicyResponse", propOrder = {
    "policyId"
})
public class CreateNotificationPolicyResponse {

    protected long policyId;

    /**
     * Gets the value of the policyId property.
     * 
     */
    public long getPolicyId() {
        return policyId;
    }

    /**
     * Sets the value of the policyId property.
     * 
     */
    public void setPolicyId(long value) {
        this.policyId = value;
    }

}
