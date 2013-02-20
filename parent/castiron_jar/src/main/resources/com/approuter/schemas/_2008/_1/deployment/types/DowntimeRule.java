
package com.approuter.schemas._2008._1.deployment.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.approuter.schemas._2008._1.deployment.Guid;


/**
 * <p>Java class for downtimeRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="downtimeRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="configUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="downtimeType" type="{http://www.approuter.com/schemas/2008/1/deployment/types}downtimeType" minOccurs="0"/>
 *         &lt;element name="envId" type="{http://www.approuter.com/schemas/2008/1/deployment}guid" minOccurs="0"/>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="repeatInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="repeatType" type="{http://www.approuter.com/schemas/2008/1/deployment/types}repeatType" minOccurs="0"/>
 *         &lt;element name="repeatingRule" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="restartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ruleId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="stopDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "downtimeRule", propOrder = {
    "configUrl",
    "downtimeType",
    "envId",
    "isActive",
    "repeatInterval",
    "repeatType",
    "repeatingRule",
    "restartDate",
    "ruleId",
    "stopDate"
})
public class DowntimeRule {

    protected String configUrl;
    protected DowntimeType downtimeType;
    protected Guid envId;
    protected boolean isActive;
    protected int repeatInterval;
    protected RepeatType repeatType;
    protected boolean repeatingRule;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar restartDate;
    protected long ruleId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stopDate;

    /**
     * Gets the value of the configUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigUrl() {
        return configUrl;
    }

    /**
     * Sets the value of the configUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigUrl(String value) {
        this.configUrl = value;
    }

    /**
     * Gets the value of the downtimeType property.
     * 
     * @return
     *     possible object is
     *     {@link DowntimeType }
     *     
     */
    public DowntimeType getDowntimeType() {
        return downtimeType;
    }

    /**
     * Sets the value of the downtimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DowntimeType }
     *     
     */
    public void setDowntimeType(DowntimeType value) {
        this.downtimeType = value;
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
     * Gets the value of the isActive property.
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the repeatInterval property.
     * 
     */
    public int getRepeatInterval() {
        return repeatInterval;
    }

    /**
     * Sets the value of the repeatInterval property.
     * 
     */
    public void setRepeatInterval(int value) {
        this.repeatInterval = value;
    }

    /**
     * Gets the value of the repeatType property.
     * 
     * @return
     *     possible object is
     *     {@link RepeatType }
     *     
     */
    public RepeatType getRepeatType() {
        return repeatType;
    }

    /**
     * Sets the value of the repeatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepeatType }
     *     
     */
    public void setRepeatType(RepeatType value) {
        this.repeatType = value;
    }

    /**
     * Gets the value of the repeatingRule property.
     * 
     */
    public boolean isRepeatingRule() {
        return repeatingRule;
    }

    /**
     * Sets the value of the repeatingRule property.
     * 
     */
    public void setRepeatingRule(boolean value) {
        this.repeatingRule = value;
    }

    /**
     * Gets the value of the restartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRestartDate() {
        return restartDate;
    }

    /**
     * Sets the value of the restartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRestartDate(XMLGregorianCalendar value) {
        this.restartDate = value;
    }

    /**
     * Gets the value of the ruleId property.
     * 
     */
    public long getRuleId() {
        return ruleId;
    }

    /**
     * Sets the value of the ruleId property.
     * 
     */
    public void setRuleId(long value) {
        this.ruleId = value;
    }

    /**
     * Gets the value of the stopDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStopDate() {
        return stopDate;
    }

    /**
     * Sets the value of the stopDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStopDate(XMLGregorianCalendar value) {
        this.stopDate = value;
    }

}
