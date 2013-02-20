
package com.approuter.schemas._2008._1.orcmon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.approuter.schemas._2005._1.monitoringprops.OrcMonPropsType;


/**
 * <p>Java class for setMonitoringProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setMonitoringProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="properties" type="{http://www.approuter.com/schemas/2005/1/monitoringProps/}OrcMonPropsType" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setMonitoringProperties", propOrder = {
    "properties"
})
public class SetMonitoringProperties {

    protected OrcMonPropsType properties;

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link OrcMonPropsType }
     *     
     */
    public OrcMonPropsType getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrcMonPropsType }
     *     
     */
    public void setProperties(OrcMonPropsType value) {
        this.properties = value;
    }

}
