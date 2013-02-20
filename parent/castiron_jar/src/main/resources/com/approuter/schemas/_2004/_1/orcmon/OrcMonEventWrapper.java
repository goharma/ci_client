
package com.approuter.schemas._2004._1.orcmon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.approuter.schemas._2008._1.lognotif.types.LogLevel;


/**
 * <p>Java class for orcMonEventWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orcMonEventWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elapsedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="events" type="{http://www.approuter.com/schemas/2004/1/orcmon}event" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="logLevel" type="{http://www.approuter.com/schemas/2008/1/lognotif/types}logLevel" minOccurs="0"/>
 *         &lt;element name="loggedEvent" type="{http://www.approuter.com/schemas/2004/1/orcmon/}LoggedEventType" minOccurs="0"/>
 *         &lt;element name="moduleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="variables" type="{http://www.approuter.com/schemas/2004/1/orcmon/}SaveVarsLoggedEventType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orcMonEventWrapper", namespace = "http://www.approuter.com/schemas/2004/1/orcmon", propOrder = {
    "activityName",
    "defaultName",
    "description",
    "elapsedTime",
    "endTime",
    "events",
    "logLevel",
    "loggedEvent",
    "moduleName",
    "name",
    "nodeName",
    "startTime",
    "variables"
})
public class OrcMonEventWrapper {

    protected String activityName;
    protected String defaultName;
    protected String description;
    protected String elapsedTime;
    @XmlSchemaType(name = "anySimpleType")
    protected Object endTime;
    protected List<Event> events;
    protected LogLevel logLevel;
    protected LoggedEventType loggedEvent;
    protected String moduleName;
    protected String name;
    protected String nodeName;
    @XmlSchemaType(name = "anySimpleType")
    protected Object startTime;
    protected List<SaveVarsLoggedEventType> variables;

    /**
     * Gets the value of the activityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * Sets the value of the activityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityName(String value) {
        this.activityName = value;
    }

    /**
     * Gets the value of the defaultName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultName() {
        return defaultName;
    }

    /**
     * Sets the value of the defaultName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultName(String value) {
        this.defaultName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the elapsedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElapsedTime() {
        return elapsedTime;
    }

    /**
     * Sets the value of the elapsedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElapsedTime(String value) {
        this.elapsedTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEndTime(Object value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the events property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Event }
     * 
     * 
     */
    public List<Event> getEvents() {
        if (events == null) {
            events = new ArrayList<Event>();
        }
        return this.events;
    }

    /**
     * Gets the value of the logLevel property.
     * 
     * @return
     *     possible object is
     *     {@link LogLevel }
     *     
     */
    public LogLevel getLogLevel() {
        return logLevel;
    }

    /**
     * Sets the value of the logLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogLevel }
     *     
     */
    public void setLogLevel(LogLevel value) {
        this.logLevel = value;
    }

    /**
     * Gets the value of the loggedEvent property.
     * 
     * @return
     *     possible object is
     *     {@link LoggedEventType }
     *     
     */
    public LoggedEventType getLoggedEvent() {
        return loggedEvent;
    }

    /**
     * Sets the value of the loggedEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoggedEventType }
     *     
     */
    public void setLoggedEvent(LoggedEventType value) {
        this.loggedEvent = value;
    }

    /**
     * Gets the value of the moduleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * Sets the value of the moduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleName(String value) {
        this.moduleName = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets the value of the nodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeName(String value) {
        this.nodeName = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStartTime(Object value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the variables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SaveVarsLoggedEventType }
     * 
     * 
     */
    public List<SaveVarsLoggedEventType> getVariables() {
        if (variables == null) {
            variables = new ArrayList<SaveVarsLoggedEventType>();
        }
        return this.variables;
    }

}
