
package com.approuter.schemas._2004._1.orcmon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.approuter.schema.router._1000.logging.Event;


/**
 * <p>Java class for ActivityEventLoggedEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityEventLoggedEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="activityPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="event" type="{http://www.approuter.com/schema/router/1000/logging.xsd}Event"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityEventLoggedEventType", propOrder = {
    "taskId",
    "sequenceNumber",
    "activityPath",
    "activityId",
    "event"
})
public class ActivityEventLoggedEventType {

    @XmlElement(required = true)
    protected String taskId;
    protected int sequenceNumber;
    protected String activityPath;
    protected int activityId;
    @XmlElement(required = true)
    protected Event event;

    /**
     * Gets the value of the taskId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskId(String value) {
        this.taskId = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     */
    public int getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     */
    public void setSequenceNumber(int value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the activityPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityPath() {
        return activityPath;
    }

    /**
     * Sets the value of the activityPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityPath(String value) {
        this.activityPath = value;
    }

    /**
     * Gets the value of the activityId property.
     * 
     */
    public int getActivityId() {
        return activityId;
    }

    /**
     * Sets the value of the activityId property.
     * 
     */
    public void setActivityId(int value) {
        this.activityId = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link Event }
     *     
     */
    public Event getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link Event }
     *     
     */
    public void setEvent(Event value) {
        this.event = value;
    }

}
