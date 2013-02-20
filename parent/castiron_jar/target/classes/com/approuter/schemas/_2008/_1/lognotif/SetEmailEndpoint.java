
package com.approuter.schemas._2008._1.lognotif;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setEmailEndpoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setEmailEndpoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emailEndpoint" type="{http://www.approuter.com/schemas/2008/1/lognotif}emailEndpoint" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setEmailEndpoint", propOrder = {
    "emailEndpoint"
})
public class SetEmailEndpoint {

    protected EmailEndpoint emailEndpoint;

    /**
     * Gets the value of the emailEndpoint property.
     * 
     * @return
     *     possible object is
     *     {@link EmailEndpoint }
     *     
     */
    public EmailEndpoint getEmailEndpoint() {
        return emailEndpoint;
    }

    /**
     * Sets the value of the emailEndpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailEndpoint }
     *     
     */
    public void setEmailEndpoint(EmailEndpoint value) {
        this.emailEndpoint = value;
    }

}
