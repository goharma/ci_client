
package com.approuter.schemas._2008._1.lognotif;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.approuter.schemas._2008._1.lognotif.types.LogComponent;


/**
 * <p>Java class for getLogLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLogLevel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="logComponent" type="{http://www.approuter.com/schemas/2008/1/lognotif/types}logComponent" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLogLevel", propOrder = {
    "logComponent"
})
public class GetLogLevel {

    protected LogComponent logComponent;

    /**
     * Gets the value of the logComponent property.
     * 
     * @return
     *     possible object is
     *     {@link LogComponent }
     *     
     */
    public LogComponent getLogComponent() {
        return logComponent;
    }

    /**
     * Sets the value of the logComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogComponent }
     *     
     */
    public void setLogComponent(LogComponent value) {
        this.logComponent = value;
    }

}
