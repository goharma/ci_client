
package com.approuter.schemas._2005._1.monitoringprops;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PurgingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurgingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="triggerPolling" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="diskFreeTrigger" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="timeTriggerType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="timeTrigger" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="scheduledTriggerStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="scheduledTriggerPeriod" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="scheduledTriggerPeriodUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxCompletedJobsTrigger" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="maxErroredJobsTrigger" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="jobType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="jobAge" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="jobCount" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="compressionMode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxJobsCompressTrigger" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="maxPercentRemainingJobsCompressTrigger" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="diskFreeHighWaterMark" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="waitAfterHighWaterMark" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurgingType")
public class PurgingType {

    @XmlAttribute(name = "triggerPolling")
    protected Duration triggerPolling;
    @XmlAttribute(name = "diskFreeTrigger")
    protected Integer diskFreeTrigger;
    @XmlAttribute(name = "timeTriggerType")
    protected String timeTriggerType;
    @XmlAttribute(name = "timeTrigger")
    protected Duration timeTrigger;
    @XmlAttribute(name = "scheduledTriggerStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledTriggerStart;
    @XmlAttribute(name = "scheduledTriggerPeriod")
    protected Integer scheduledTriggerPeriod;
    @XmlAttribute(name = "scheduledTriggerPeriodUnit")
    protected String scheduledTriggerPeriodUnit;
    @XmlAttribute(name = "maxCompletedJobsTrigger")
    protected Integer maxCompletedJobsTrigger;
    @XmlAttribute(name = "maxErroredJobsTrigger")
    protected Integer maxErroredJobsTrigger;
    @XmlAttribute(name = "jobType")
    protected String jobType;
    @XmlAttribute(name = "jobAge")
    protected Duration jobAge;
    @XmlAttribute(name = "jobCount")
    protected Integer jobCount;
    @XmlAttribute(name = "compressionMode")
    protected String compressionMode;
    @XmlAttribute(name = "maxJobsCompressTrigger")
    protected Integer maxJobsCompressTrigger;
    @XmlAttribute(name = "maxPercentRemainingJobsCompressTrigger")
    protected Integer maxPercentRemainingJobsCompressTrigger;
    @XmlAttribute(name = "diskFreeHighWaterMark")
    protected Integer diskFreeHighWaterMark;
    @XmlAttribute(name = "waitAfterHighWaterMark")
    protected Duration waitAfterHighWaterMark;

    /**
     * Gets the value of the triggerPolling property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTriggerPolling() {
        return triggerPolling;
    }

    /**
     * Sets the value of the triggerPolling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTriggerPolling(Duration value) {
        this.triggerPolling = value;
    }

    /**
     * Gets the value of the diskFreeTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiskFreeTrigger() {
        return diskFreeTrigger;
    }

    /**
     * Sets the value of the diskFreeTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiskFreeTrigger(Integer value) {
        this.diskFreeTrigger = value;
    }

    /**
     * Gets the value of the timeTriggerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeTriggerType() {
        return timeTriggerType;
    }

    /**
     * Sets the value of the timeTriggerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeTriggerType(String value) {
        this.timeTriggerType = value;
    }

    /**
     * Gets the value of the timeTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeTrigger() {
        return timeTrigger;
    }

    /**
     * Sets the value of the timeTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeTrigger(Duration value) {
        this.timeTrigger = value;
    }

    /**
     * Gets the value of the scheduledTriggerStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledTriggerStart() {
        return scheduledTriggerStart;
    }

    /**
     * Sets the value of the scheduledTriggerStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledTriggerStart(XMLGregorianCalendar value) {
        this.scheduledTriggerStart = value;
    }

    /**
     * Gets the value of the scheduledTriggerPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScheduledTriggerPeriod() {
        return scheduledTriggerPeriod;
    }

    /**
     * Sets the value of the scheduledTriggerPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScheduledTriggerPeriod(Integer value) {
        this.scheduledTriggerPeriod = value;
    }

    /**
     * Gets the value of the scheduledTriggerPeriodUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledTriggerPeriodUnit() {
        return scheduledTriggerPeriodUnit;
    }

    /**
     * Sets the value of the scheduledTriggerPeriodUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledTriggerPeriodUnit(String value) {
        this.scheduledTriggerPeriodUnit = value;
    }

    /**
     * Gets the value of the maxCompletedJobsTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxCompletedJobsTrigger() {
        return maxCompletedJobsTrigger;
    }

    /**
     * Sets the value of the maxCompletedJobsTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCompletedJobsTrigger(Integer value) {
        this.maxCompletedJobsTrigger = value;
    }

    /**
     * Gets the value of the maxErroredJobsTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxErroredJobsTrigger() {
        return maxErroredJobsTrigger;
    }

    /**
     * Sets the value of the maxErroredJobsTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxErroredJobsTrigger(Integer value) {
        this.maxErroredJobsTrigger = value;
    }

    /**
     * Gets the value of the jobType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * Sets the value of the jobType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobType(String value) {
        this.jobType = value;
    }

    /**
     * Gets the value of the jobAge property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getJobAge() {
        return jobAge;
    }

    /**
     * Sets the value of the jobAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setJobAge(Duration value) {
        this.jobAge = value;
    }

    /**
     * Gets the value of the jobCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJobCount() {
        return jobCount;
    }

    /**
     * Sets the value of the jobCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJobCount(Integer value) {
        this.jobCount = value;
    }

    /**
     * Gets the value of the compressionMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompressionMode() {
        return compressionMode;
    }

    /**
     * Sets the value of the compressionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompressionMode(String value) {
        this.compressionMode = value;
    }

    /**
     * Gets the value of the maxJobsCompressTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxJobsCompressTrigger() {
        return maxJobsCompressTrigger;
    }

    /**
     * Sets the value of the maxJobsCompressTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxJobsCompressTrigger(Integer value) {
        this.maxJobsCompressTrigger = value;
    }

    /**
     * Gets the value of the maxPercentRemainingJobsCompressTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxPercentRemainingJobsCompressTrigger() {
        return maxPercentRemainingJobsCompressTrigger;
    }

    /**
     * Sets the value of the maxPercentRemainingJobsCompressTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxPercentRemainingJobsCompressTrigger(Integer value) {
        this.maxPercentRemainingJobsCompressTrigger = value;
    }

    /**
     * Gets the value of the diskFreeHighWaterMark property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiskFreeHighWaterMark() {
        return diskFreeHighWaterMark;
    }

    /**
     * Sets the value of the diskFreeHighWaterMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiskFreeHighWaterMark(Integer value) {
        this.diskFreeHighWaterMark = value;
    }

    /**
     * Gets the value of the waitAfterHighWaterMark property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getWaitAfterHighWaterMark() {
        return waitAfterHighWaterMark;
    }

    /**
     * Sets the value of the waitAfterHighWaterMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setWaitAfterHighWaterMark(Duration value) {
        this.waitAfterHighWaterMark = value;
    }

}
