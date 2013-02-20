
package com.approuter.schemas._2008._1.system;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.approuter.schemas.router._1000.netconfig02.NetworkStatus;


/**
 * <p>Java class for getNetworkConfigurationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getNetworkConfigurationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="networkStatus" type="{http://www.approuter.com/schemas/router/1000/NetConfig02.xsd}NetworkStatus" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNetworkConfigurationResponse", propOrder = {
    "networkStatus"
})
public class GetNetworkConfigurationResponse {

    protected NetworkStatus networkStatus;

    /**
     * Gets the value of the networkStatus property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkStatus }
     *     
     */
    public NetworkStatus getNetworkStatus() {
        return networkStatus;
    }

    /**
     * Sets the value of the networkStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkStatus }
     *     
     */
    public void setNetworkStatus(NetworkStatus value) {
        this.networkStatus = value;
    }

}
