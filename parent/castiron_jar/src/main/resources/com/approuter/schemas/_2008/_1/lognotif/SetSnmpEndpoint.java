
package com.approuter.schemas._2008._1.lognotif;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setSnmpEndpoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setSnmpEndpoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="snmpEndpoint" type="{http://www.approuter.com/schemas/2008/1/lognotif}snmpEndpoint" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setSnmpEndpoint", propOrder = {
    "snmpEndpoint"
})
public class SetSnmpEndpoint {

    protected SnmpEndpoint snmpEndpoint;

    /**
     * Gets the value of the snmpEndpoint property.
     * 
     * @return
     *     possible object is
     *     {@link SnmpEndpoint }
     *     
     */
    public SnmpEndpoint getSnmpEndpoint() {
        return snmpEndpoint;
    }

    /**
     * Sets the value of the snmpEndpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnmpEndpoint }
     *     
     */
    public void setSnmpEndpoint(SnmpEndpoint value) {
        this.snmpEndpoint = value;
    }

}
