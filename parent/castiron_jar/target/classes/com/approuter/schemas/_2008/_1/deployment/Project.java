
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
 * <p>Java class for project complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="project">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="asset" type="{http://www.approuter.com/schemas/2008/1/deployment}asset" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="configurations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="configuration" type="{http://www.approuter.com/schemas/2008/1/deployment}configuration" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="envId" type="{http://www.approuter.com/schemas/2008/1/deployment}guid" minOccurs="0"/>
 *         &lt;element name="lastpublished" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orchestrations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="orchestration" type="{http://www.approuter.com/schemas/2008/1/deployment}orchestration" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="properties" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="property" type="{http://www.approuter.com/schemas/2008/1/deployment}property" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "project", propOrder = {
    "assets",
    "configurations",
    "description",
    "envId",
    "lastpublished",
    "name",
    "orchestrations",
    "properties",
    "version"
})
public class Project {

    @XmlElement(namespace = "")
    protected Project.Assets assets;
    @XmlElement(namespace = "")
    protected Project.Configurations configurations;
    @XmlElement(namespace = "")
    protected String description;
    @XmlElement(namespace = "")
    protected Guid envId;
    @XmlElement(namespace = "")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastpublished;
    @XmlElement(namespace = "")
    protected String name;
    @XmlElement(namespace = "")
    protected Project.Orchestrations orchestrations;
    @XmlElement(namespace = "")
    protected Project.Properties properties;
    @XmlElement(namespace = "")
    protected String version;

    /**
     * Gets the value of the assets property.
     * 
     * @return
     *     possible object is
     *     {@link Project.Assets }
     *     
     */
    public Project.Assets getAssets() {
        return assets;
    }

    /**
     * Sets the value of the assets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project.Assets }
     *     
     */
    public void setAssets(Project.Assets value) {
        this.assets = value;
    }

    /**
     * Gets the value of the configurations property.
     * 
     * @return
     *     possible object is
     *     {@link Project.Configurations }
     *     
     */
    public Project.Configurations getConfigurations() {
        return configurations;
    }

    /**
     * Sets the value of the configurations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project.Configurations }
     *     
     */
    public void setConfigurations(Project.Configurations value) {
        this.configurations = value;
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
     * Gets the value of the lastpublished property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastpublished() {
        return lastpublished;
    }

    /**
     * Sets the value of the lastpublished property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastpublished(XMLGregorianCalendar value) {
        this.lastpublished = value;
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
     * Gets the value of the orchestrations property.
     * 
     * @return
     *     possible object is
     *     {@link Project.Orchestrations }
     *     
     */
    public Project.Orchestrations getOrchestrations() {
        return orchestrations;
    }

    /**
     * Sets the value of the orchestrations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project.Orchestrations }
     *     
     */
    public void setOrchestrations(Project.Orchestrations value) {
        this.orchestrations = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link Project.Properties }
     *     
     */
    public Project.Properties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project.Properties }
     *     
     */
    public void setProperties(Project.Properties value) {
        this.properties = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="asset" type="{http://www.approuter.com/schemas/2008/1/deployment}asset" maxOccurs="unbounded" minOccurs="0"/>
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
        "asset"
    })
    public static class Assets {

        @XmlElement(namespace = "")
        protected List<Asset> asset;

        /**
         * Gets the value of the asset property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the asset property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAsset().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Asset }
         * 
         * 
         */
        public List<Asset> getAsset() {
            if (asset == null) {
                asset = new ArrayList<Asset>();
            }
            return this.asset;
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
     *         &lt;element name="configuration" type="{http://www.approuter.com/schemas/2008/1/deployment}configuration" maxOccurs="unbounded" minOccurs="0"/>
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
        "configuration"
    })
    public static class Configurations {

        @XmlElement(namespace = "")
        protected List<Configuration> configuration;

        /**
         * Gets the value of the configuration property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the configuration property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConfiguration().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Configuration }
         * 
         * 
         */
        public List<Configuration> getConfiguration() {
            if (configuration == null) {
                configuration = new ArrayList<Configuration>();
            }
            return this.configuration;
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
     *         &lt;element name="orchestration" type="{http://www.approuter.com/schemas/2008/1/deployment}orchestration" maxOccurs="unbounded" minOccurs="0"/>
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
        "orchestration"
    })
    public static class Orchestrations {

        @XmlElement(namespace = "")
        protected List<Orchestration> orchestration;

        /**
         * Gets the value of the orchestration property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orchestration property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrchestration().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Orchestration }
         * 
         * 
         */
        public List<Orchestration> getOrchestration() {
            if (orchestration == null) {
                orchestration = new ArrayList<Orchestration>();
            }
            return this.orchestration;
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
     *         &lt;element name="property" type="{http://www.approuter.com/schemas/2008/1/deployment}property" maxOccurs="unbounded" minOccurs="0"/>
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
        "property"
    })
    public static class Properties {

        @XmlElement(namespace = "")
        protected List<Property> property;

        /**
         * Gets the value of the property property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the property property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Property }
         * 
         * 
         */
        public List<Property> getProperty() {
            if (property == null) {
                property = new ArrayList<Property>();
            }
            return this.property;
        }

    }

}
