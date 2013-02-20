
package com.approuter.schemas._2008._1.orcmon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.approuter.schemas._2004._1.orcmon.OrcMonJob;


/**
 * <p>Java class for purgeJobsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purgeJobsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jobs" type="{http://www.approuter.com/schemas/2004/1/orcmon}orcMonJob" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purgeJobsResponse", propOrder = {
    "jobs"
})
public class PurgeJobsResponse {

    protected List<OrcMonJob> jobs;

    /**
     * Gets the value of the jobs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrcMonJob }
     * 
     * 
     */
    public List<OrcMonJob> getJobs() {
        if (jobs == null) {
            jobs = new ArrayList<OrcMonJob>();
        }
        return this.jobs;
    }

}
