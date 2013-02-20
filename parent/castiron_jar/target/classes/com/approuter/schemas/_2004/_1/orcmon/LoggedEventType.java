
package com.approuter.schemas._2004._1.orcmon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoggedEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoggedEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taskStartLoggedEvent" type="{http://www.approuter.com/schemas/2004/1/orcmon/}TaskStartLoggedEventType" minOccurs="0"/>
 *         &lt;element name="taskEndLoggedEvent" type="{http://www.approuter.com/schemas/2004/1/orcmon/}TaskEndLoggedEventType" minOccurs="0"/>
 *         &lt;element name="activityStartLoggedEvent" type="{http://www.approuter.com/schemas/2004/1/orcmon/}ActivityStartLoggedEventType" minOccurs="0"/>
 *         &lt;element name="activityEndLoggedEvent" type="{http://www.approuter.com/schemas/2004/1/orcmon/}ActivityEndLoggedEventType" minOccurs="0"/>
 *         &lt;element name="saveVarsLoggedEvent" type="{http://www.approuter.com/schemas/2004/1/orcmon/}SaveVarsLoggedEventType" minOccurs="0"/>
 *         &lt;element name="activityEventLoggedEvent" type="{http://www.approuter.com/schemas/2004/1/orcmon/}ActivityEventLoggedEventType" minOccurs="0"/>
 *         &lt;element name="setStatusLoggedEvent" type="{http://www.approuter.com/schemas/2004/1/orcmon/}SetStatusLoggedEventType" minOccurs="0"/>
 *         &lt;element name="saveKeyLoggedEvent" type="{http://www.approuter.com/schemas/2004/1/orcmon/}SaveKeyLoggedEventType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoggedEventType", propOrder = {
    "taskStartLoggedEvent",
    "taskEndLoggedEvent",
    "activityStartLoggedEvent",
    "activityEndLoggedEvent",
    "saveVarsLoggedEvent",
    "activityEventLoggedEvent",
    "setStatusLoggedEvent",
    "saveKeyLoggedEvent"
})
public class LoggedEventType {

    protected TaskStartLoggedEventType taskStartLoggedEvent;
    protected TaskEndLoggedEventType taskEndLoggedEvent;
    protected ActivityStartLoggedEventType activityStartLoggedEvent;
    protected ActivityEndLoggedEventType activityEndLoggedEvent;
    protected SaveVarsLoggedEventType saveVarsLoggedEvent;
    protected ActivityEventLoggedEventType activityEventLoggedEvent;
    protected SetStatusLoggedEventType setStatusLoggedEvent;
    protected SaveKeyLoggedEventType saveKeyLoggedEvent;

    /**
     * Gets the value of the taskStartLoggedEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TaskStartLoggedEventType }
     *     
     */
    public TaskStartLoggedEventType getTaskStartLoggedEvent() {
        return taskStartLoggedEvent;
    }

    /**
     * Sets the value of the taskStartLoggedEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskStartLoggedEventType }
     *     
     */
    public void setTaskStartLoggedEvent(TaskStartLoggedEventType value) {
        this.taskStartLoggedEvent = value;
    }

    /**
     * Gets the value of the taskEndLoggedEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TaskEndLoggedEventType }
     *     
     */
    public TaskEndLoggedEventType getTaskEndLoggedEvent() {
        return taskEndLoggedEvent;
    }

    /**
     * Sets the value of the taskEndLoggedEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskEndLoggedEventType }
     *     
     */
    public void setTaskEndLoggedEvent(TaskEndLoggedEventType value) {
        this.taskEndLoggedEvent = value;
    }

    /**
     * Gets the value of the activityStartLoggedEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityStartLoggedEventType }
     *     
     */
    public ActivityStartLoggedEventType getActivityStartLoggedEvent() {
        return activityStartLoggedEvent;
    }

    /**
     * Sets the value of the activityStartLoggedEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityStartLoggedEventType }
     *     
     */
    public void setActivityStartLoggedEvent(ActivityStartLoggedEventType value) {
        this.activityStartLoggedEvent = value;
    }

    /**
     * Gets the value of the activityEndLoggedEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityEndLoggedEventType }
     *     
     */
    public ActivityEndLoggedEventType getActivityEndLoggedEvent() {
        return activityEndLoggedEvent;
    }

    /**
     * Sets the value of the activityEndLoggedEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityEndLoggedEventType }
     *     
     */
    public void setActivityEndLoggedEvent(ActivityEndLoggedEventType value) {
        this.activityEndLoggedEvent = value;
    }

    /**
     * Gets the value of the saveVarsLoggedEvent property.
     * 
     * @return
     *     possible object is
     *     {@link SaveVarsLoggedEventType }
     *     
     */
    public SaveVarsLoggedEventType getSaveVarsLoggedEvent() {
        return saveVarsLoggedEvent;
    }

    /**
     * Sets the value of the saveVarsLoggedEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveVarsLoggedEventType }
     *     
     */
    public void setSaveVarsLoggedEvent(SaveVarsLoggedEventType value) {
        this.saveVarsLoggedEvent = value;
    }

    /**
     * Gets the value of the activityEventLoggedEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityEventLoggedEventType }
     *     
     */
    public ActivityEventLoggedEventType getActivityEventLoggedEvent() {
        return activityEventLoggedEvent;
    }

    /**
     * Sets the value of the activityEventLoggedEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityEventLoggedEventType }
     *     
     */
    public void setActivityEventLoggedEvent(ActivityEventLoggedEventType value) {
        this.activityEventLoggedEvent = value;
    }

    /**
     * Gets the value of the setStatusLoggedEvent property.
     * 
     * @return
     *     possible object is
     *     {@link SetStatusLoggedEventType }
     *     
     */
    public SetStatusLoggedEventType getSetStatusLoggedEvent() {
        return setStatusLoggedEvent;
    }

    /**
     * Sets the value of the setStatusLoggedEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetStatusLoggedEventType }
     *     
     */
    public void setSetStatusLoggedEvent(SetStatusLoggedEventType value) {
        this.setStatusLoggedEvent = value;
    }

    /**
     * Gets the value of the saveKeyLoggedEvent property.
     * 
     * @return
     *     possible object is
     *     {@link SaveKeyLoggedEventType }
     *     
     */
    public SaveKeyLoggedEventType getSaveKeyLoggedEvent() {
        return saveKeyLoggedEvent;
    }

    /**
     * Sets the value of the saveKeyLoggedEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveKeyLoggedEventType }
     *     
     */
    public void setSaveKeyLoggedEvent(SaveKeyLoggedEventType value) {
        this.saveKeyLoggedEvent = value;
    }

}
