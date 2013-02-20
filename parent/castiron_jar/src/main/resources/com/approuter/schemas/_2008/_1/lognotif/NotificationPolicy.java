
package com.approuter.schemas._2008._1.lognotif;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.approuter.schemas._2008._1.lognotif.types.LogComponent;
import com.approuter.schemas._2008._1.lognotif.types.LogLevel;


/**
 * <p>Java class for notificationPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emailAddresses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="envId" type="{http://www.approuter.com/schemas/2008/1/lognotif}guid" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="logComponent" type="{http://www.approuter.com/schemas/2008/1/lognotif/types}logComponent" minOccurs="0"/>
 *         &lt;element name="logLevel" type="{http://www.approuter.com/schemas/2008/1/lognotif/types}logLevel" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snmp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationPolicy", propOrder = {
    "emailAddresses",
    "envId",
    "id",
    "logComponent",
    "logLevel",
    "name",
    "snmp"
})
public class NotificationPolicy {

    @XmlElement(namespace = "", nillable = true)
    protected List<String> emailAddresses;
    @XmlElement(namespace = "")
    protected Guid envId;
    @XmlElement(namespace = "")
    protected long id;
    @XmlElement(namespace = "")
    protected LogComponent logComponent;
    @XmlElement(namespace = "")
    protected LogLevel logLevel;
    @XmlElement(namespace = "")
    protected String name;
    @XmlElement(namespace = "")
    protected boolean snmp;

    /**
     * Gets the value of the emailAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmailAddresses() {
        if (emailAddresses == null) {
            emailAddresses = new ArrayList<String>();
        }
        return this.emailAddresses;
    }

    /**
     * Gets the value of the envId property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getEnvId() {
        return envId;
    }

    /**
     * Sets the value of the envId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setEnvId(Guid value) {
        this.envId = value;
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
     * Gets the value of the logComponent property.
     * 
     * @return
     *     possible object is
     *     {@link LogComponent }
     *     
     */
    public LogComponent getLogComponent() {
        return logComponent;
    }

    /**
     * Sets the value of the logComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogComponent }
     *     
     */
    public void setLogComponent(LogComponent value) {
        this.logComponent = value;
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
     * Gets the value of the snmp property.
     * 
     */
    public boolean isSnmp() {
        return snmp;
    }

    /**
     * Sets the value of the snmp property.
     * 
     */
    public void setSnmp(boolean value) {
        this.snmp = value;
    }

}
