
package com.approuter.schemas._2008._1.lognotif.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for log complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="log">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="system" type="{http://www.approuter.com/schemas/2008/1/lognotif/types}logComponent" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="job" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="level" type="{http://www.approuter.com/schemas/2008/1/lognotif/types}logLevel" minOccurs="0"/>
 *         &lt;element name="orchestration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resolvedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resolvedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "log", propOrder = {
    "system",
    "message",
    "id",
    "job",
    "level",
    "orchestration",
    "resolvedBy",
    "resolvedOn",
    "timestamp"
})
public class Log {

    protected LogComponent system;
    protected String message;
    protected long id;
    protected String job;
    protected LogLevel level;
    protected String orchestration;
    protected String resolvedBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar resolvedOn;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link LogComponent }
     *     
     */
    public LogComponent getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogComponent }
     *     
     */
    public void setSystem(LogComponent value) {
        this.system = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the job property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJob() {
        return job;
    }

    /**
     * Sets the value of the job property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJob(String value) {
        this.job = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link LogLevel }
     *     
     */
    public LogLevel getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogLevel }
     *     
     */
    public void setLevel(LogLevel value) {
        this.level = value;
    }

    /**
     * Gets the value of the orchestration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrchestration() {
        return orchestration;
    }

    /**
     * Sets the value of the orchestration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrchestration(String value) {
        this.orchestration = value;
    }

    /**
     * Gets the value of the resolvedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolvedBy() {
        return resolvedBy;
    }

    /**
     * Sets the value of the resolvedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolvedBy(String value) {
        this.resolvedBy = value;
    }

    /**
     * Gets the value of the resolvedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResolvedOn() {
        return resolvedOn;
    }

    /**
     * Sets the value of the resolvedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResolvedOn(XMLGregorianCalendar value) {
        this.resolvedOn = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

}
