
package com.approuter.schemas._2008._1.system;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for downloadPostmortemResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="downloadPostmortemResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="postmortem" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "downloadPostmortemResponse", propOrder = {
    "postmortem"
})
public class DownloadPostmortemResponse {

    @XmlMimeType("application/x-tar-gz")
    protected DataHandler postmortem;

    /**
     * Gets the value of the postmortem property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getPostmortem() {
        return postmortem;
    }

    /**
     * Sets the value of the postmortem property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setPostmortem(DataHandler value) {
        this.postmortem = value;
    }

}
