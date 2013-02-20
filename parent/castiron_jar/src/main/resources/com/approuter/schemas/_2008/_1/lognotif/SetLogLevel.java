
package com.approuter.schemas._2008._1.lognotif;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.approuter.schemas._2008._1.lognotif.types.LogComponent;
import com.approuter.schemas._2008._1.lognotif.types.LogLevel;


/**
 * <p>Java class for setLogLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setLogLevel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="logComponent" type="{http://www.approuter.com/schemas/2008/1/lognotif/types}logComponent" minOccurs="0" form="qualified"/>
 *         &lt;element name="logLevel" type="{http://www.approuter.com/schemas/2008/1/lognotif/types}logLevel" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setLogLevel", propOrder = {
    "logComponent",
    "logLevel"
})
public class SetLogLevel {

    protected LogComponent logComponent;
    protected LogLevel logLevel;

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

    /**
     * Gets the value of the logLevel property.
     * 
     * @return
     *     possible object is
     *     {@link LogLevel }
     *     
     */
    public LogLevel getLogLevel() {
        return logLevel;
    }

    /**
     * Sets the value of the logLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogLevel }
     *     
     */
    public void setLogLevel(LogLevel value) {
        this.logLevel = value;
    }

}
