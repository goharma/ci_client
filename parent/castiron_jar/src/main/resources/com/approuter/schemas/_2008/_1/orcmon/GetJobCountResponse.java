
package com.approuter.schemas._2008._1.orcmon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getJobCountResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getJobCountResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jobCount" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getJobCountResponse", propOrder = {
    "jobCount"
})
public class GetJobCountResponse {

    protected int jobCount;

    /**
     * Gets the value of the jobCount property.
     * 
     */
    public int getJobCount() {
        return jobCount;
    }

    /**
     * Sets the value of the jobCount property.
     * 
     */
    public void setJobCount(int value) {
        this.jobCount = value;
    }

}
