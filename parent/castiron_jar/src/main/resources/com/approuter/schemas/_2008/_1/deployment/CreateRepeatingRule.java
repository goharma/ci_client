
package com.approuter.schemas._2008._1.deployment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.approuter.schemas._2008._1.deployment.types.DowntimeType;
import com.approuter.schemas._2008._1.deployment.types.RepeatType;


/**
 * <p>Java class for createRepeatingRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createRepeatingRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="projectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="configName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="stopDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="restartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="downtimeType" type="{http://www.approuter.com/schemas/2008/1/deployment/types}downtimeType" minOccurs="0" form="qualified"/>
 *         &lt;element name="repeatType" type="{http://www.approuter.com/schemas/2008/1/deployment/types}repeatType" minOccurs="0" form="qualified"/>
 *         &lt;element name="repeatInterval" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createRepeatingRule", propOrder = {
    "projectName",
    "version",
    "configName",
    "stopDate",
    "restartDate",
    "downtimeType",
    "repeatType",
    "repeatInterval"
})
public class CreateRepeatingRule {

    protected String projectName;
    protected String version;
    protected String configName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stopDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar restartDate;
    protected DowntimeType downtimeType;
    protected RepeatType repeatType;
    protected int repeatInterval;

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

}
