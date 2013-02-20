
package com.approuter.schema.router._1000.logging;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Event complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="moduleId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="eventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="args" type="{http://www.approuter.com/schema/router/1000/logging.xsd}Argument" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Event", propOrder = {
    "eventId",
    "moduleId",
    "level",
    "eventTime",
    "args"
})
public class Event {

    protected int eventId;
    protected int moduleId;
    protected int level;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventTime;
    @XmlElement(nillable = true)
    protected List<Argument> args;

    /**
     * Gets the value of the eventId property.
     * 
     */
    public int getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     */
    public void setEventId(int value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the moduleId property.
     * 
     */
    public int getModuleId() {
        return moduleId;
    }

    /**
     * Sets the value of the moduleId property.
     * 
     */
    public void setModuleId(int value) {
        this.moduleId = value;
    }

    /**
     * Gets the value of the level property.
     * 
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     */
    public void setLevel(int value) {
        this.level = value;
    }

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventTime(XMLGregorianCalendar value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the args property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the args property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Argument }
     * 
     * 
     */
    public List<Argument> getArgs() {
        if (args == null) {
            args = new ArrayList<Argument>();
        }
        return this.args;
    }

}
