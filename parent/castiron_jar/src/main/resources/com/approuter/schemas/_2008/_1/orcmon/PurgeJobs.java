
package com.approuter.schemas._2008._1.orcmon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.approuter.schemas._2004._1.orcmon.OrcMonJobStatus;


/**
 * <p>Java class for purgeJobs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purgeJobs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="projectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="configName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="orchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="jobId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="jobKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="minStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="maxStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="status" type="{http://www.approuter.com/schemas/2004/1/orcmon}orcMonJobStatus" minOccurs="0" form="qualified"/>
 *         &lt;element name="exportJobs" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purgeJobs", propOrder = {
    "projectName",
    "version",
    "configName",
    "orchName",
    "jobId",
    "jobKey",
    "minStartDate",
    "maxStartDate",
    "status",
    "exportJobs"
})
public class PurgeJobs {

    protected String projectName;
    protected String version;
    protected String configName;
    protected String orchName;
    protected String jobId;
    protected String jobKey;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar minStartDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maxStartDate;
    protected OrcMonJobStatus status;
    protected boolean exportJobs;

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the configName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigName() {
        return configName;
    }

    /**
     * Sets the value of the configName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigName(String value) {
        this.configName = value;
    }

    /**
     * Gets the value of the orchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrchName() {
        return orchName;
    }

    /**
     * Sets the value of the orchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrchName(String value) {
        this.orchName = value;
    }

    /**
     * Gets the value of the jobId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobId(String value) {
        this.jobId = value;
    }

    /**
     * Gets the value of the jobKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobKey() {
        return jobKey;
    }

    /**
     * Sets the value of the jobKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobKey(String value) {
        this.jobKey = value;
    }

    /**
     * Gets the value of the minStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMinStartDate() {
        return minStartDate;
    }

    /**
     * Sets the value of the minStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMinStartDate(XMLGregorianCalendar value) {
        this.minStartDate = value;
    }

    /**
     * Gets the value of the maxStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaxStartDate() {
        return maxStartDate;
    }

    /**
     * Sets the value of the maxStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaxStartDate(XMLGregorianCalendar value) {
        this.maxStartDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link OrcMonJobStatus }
     *     
     */
    public OrcMonJobStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrcMonJobStatus }
     *     
     */
    public void setStatus(OrcMonJobStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the exportJobs property.
     * 
     */
    public boolean isExportJobs() {
        return exportJobs;
    }

    /**
     * Sets the value of the exportJobs property.
     * 
     */
    public void setExportJobs(boolean value) {
        this.exportJobs = value;
    }

}
