
package com.approuter.schemas._2008._1.staging;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isStagingDatabaseStartedResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isStagingDatabaseStartedResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isStarted" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isStagingDatabaseStartedResponse", propOrder = {
    "isStarted"
})
public class IsStagingDatabaseStartedResponse {

    protected boolean isStarted;

    /**
     * Gets the value of the isStarted property.
     * 
     */
    public boolean isIsStarted() {
        return isStarted;
    }

    /**
     * Sets the value of the isStarted property.
     * 
     */
    public void setIsStarted(boolean value) {
        this.isStarted = value;
    }

}
