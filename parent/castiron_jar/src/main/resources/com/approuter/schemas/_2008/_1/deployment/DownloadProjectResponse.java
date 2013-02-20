
package com.approuter.schemas._2008._1.deployment;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for downloadProjectResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="downloadProjectResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zippedProject" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "downloadProjectResponse", propOrder = {
    "zippedProject"
})
public class DownloadProjectResponse {

    @XmlMimeType("application/zip")
    protected DataHandler zippedProject;

    /**
     * Gets the value of the zippedProject property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getZippedProject() {
        return zippedProject;
    }

    /**
     * Sets the value of the zippedProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setZippedProject(DataHandler value) {
        this.zippedProject = value;
    }

}
