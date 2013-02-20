
package com.approuter.schemas._2008._1.deployment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for configuration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configuration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="envId" type="{http://www.approuter.com/schemas/2008/1/deployment}guid" minOccurs="0"/>
 *         &lt;element name="lastmodified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orchestrationValues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="orchestrationValue" type="{http://www.approuter.com/schemas/2008/1/deployment}orchestrationValue" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="projectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propertyValues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="propertyValue" type="{http://www.approuter.com/schemas/2008/1/deployment}propertyValue" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="state" type="{http://www.approuter.com/schemas/2008/1/deployment}configurationState" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configuration", propOrder = {
    "envId",
    "lastmodified",
    "name",
    "orchestrationValues",
    "projectName",
    "projectVersion",
    "propertyValues",
    "state"
})
public class Configuration {

    @XmlElement(namespace = "")
    protected Guid envId;
    @XmlElement(namespace = "")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastmodified;
    @XmlElement(namespace = "")
    protected String name;
    @XmlElement(namespace = "")
    protected Configuration.OrchestrationValues orchestrationValues;
    @XmlElement(namespace = "")
    protected String projectName;
    @XmlElement(namespace = "")
    protected String projectVersion;
    @XmlElement(namespace = "")
    protected Configuration.PropertyValues propertyValues;
    @XmlElement(namespace = "")
    protected ConfigurationState state;

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
     * Gets the value of the lastmodified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastmodified() {
        return lastmodified;
    }

    /**
     * Sets the value of the lastmodified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastmodified(XMLGregorianCalendar value) {
        this.lastmodified = value;
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
     * Gets the value of the orchestrationValues property.
     * 
     * @return
     *     possible object is
     *     {@link Configuration.OrchestrationValues }
     *     
     */
    public Configuration.OrchestrationValues getOrchestrationValues() {
        return orchestrationValues;
    }

    /**
     * Sets the value of the orchestrationValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Configuration.OrchestrationValues }
     *     
     */
    public void setOrchestrationValues(Configuration.OrchestrationValues value) {
        this.orchestrationValues = value;
    }

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
     * Gets the value of the projectVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectVersion() {
        return projectVersion;
    }

    /**
     * Sets the value of the projectVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectVersion(String value) {
        this.projectVersion = value;
    }

    /**
     * Gets the value of the propertyValues property.
     * 
     * @return
     *     possible object is
     *     {@link Configuration.PropertyValues }
     *     
     */
    public Configuration.PropertyValues getPropertyValues() {
        return propertyValues;
    }

    /**
     * Sets the value of the propertyValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Configuration.PropertyValues }
     *     
     */
    public void setPropertyValues(Configuration.PropertyValues value) {
        this.propertyValues = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationState }
     *     
     */
    public ConfigurationState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationState }
     *     
     */
    public void setState(ConfigurationState value) {
        this.state = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="orchestrationValue" type="{http://www.approuter.com/schemas/2008/1/deployment}orchestrationValue" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orchestrationValue"
    })
    public static class OrchestrationValues {

        @XmlElement(namespace = "")
        protected List<OrchestrationValue> orchestrationValue;

        /**
         * Gets the value of the orchestrationValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orchestrationValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrchestrationValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrchestrationValue }
         * 
         * 
         */
        public List<OrchestrationValue> getOrchestrationValue() {
            if (orchestrationValue == null) {
                orchestrationValue = new ArrayList<OrchestrationValue>();
            }
            return this.orchestrationValue;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="propertyValue" type="{http://www.approuter.com/schemas/2008/1/deployment}propertyValue" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "propertyValue"
    })
    public static class PropertyValues {

        @XmlElement(namespace = "")
        protected List<PropertyValue> propertyValue;

        /**
         * Gets the value of the propertyValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the propertyValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPropertyValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PropertyValue }
         * 
         * 
         */
        public List<PropertyValue> getPropertyValue() {
            if (propertyValue == null) {
                propertyValue = new ArrayList<PropertyValue>();
            }
            return this.propertyValue;
        }

    }

}
