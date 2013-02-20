
package com.approuter.schemas._2005._1.monitoringprops;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrcMonPropsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrcMonPropsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="purging" type="{http://www.approuter.com/schemas/2005/1/monitoringProps/}PurgingType" minOccurs="0"/>
 *         &lt;element name="archiving" type="{http://www.approuter.com/schemas/2005/1/monitoringProps/}ArchivingType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="debug" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrcMonPropsType", propOrder = {
    "purging",
    "archiving"
})
public class OrcMonPropsType {

    protected PurgingType purging;
    protected ArchivingType archiving;
    @XmlAttribute(name = "debug")
    protected Boolean debug;

    /**
     * Gets the value of the purging property.
     * 
     * @return
     *     possible object is
     *     {@link PurgingType }
     *     
     */
    public PurgingType getPurging() {
        return purging;
    }

    /**
     * Sets the value of the purging property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurgingType }
     *     
     */
    public void setPurging(PurgingType value) {
        this.purging = value;
    }

    /**
     * Gets the value of the archiving property.
     * 
     * @return
     *     possible object is
     *     {@link ArchivingType }
     *     
     */
    public ArchivingType getArchiving() {
        return archiving;
    }

    /**
     * Sets the value of the archiving property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchivingType }
     *     
     */
    public void setArchiving(ArchivingType value) {
        this.archiving = value;
    }

    /**
     * Gets the value of the debug property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDebug() {
        return debug;
    }

    /**
     * Sets the value of the debug property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDebug(Boolean value) {
        this.debug = value;
    }

}
