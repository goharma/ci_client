
package com.approuter.schemas._2004._1.orcmon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orcMonKeyForEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orcMonKeyForEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventType" type="{http://www.approuter.com/schemas/2004/1/orcmon/}LoggedEventType"/>
 *         &lt;element name="variable" type="{http://www.approuter.com/schemas/2004/1/orcmon}orcMonKeyForVariables" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="seqNum" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orcMonKeyForEvents", namespace = "http://www.approuter.com/schemas/2004/1/orcmon", propOrder = {
    "eventType",
    "variable"
})
public class OrcMonKeyForEvents {

    @XmlElement(required = true)
    protected LoggedEventType eventType;
    protected List<OrcMonKeyForVariables> variable;
    @XmlAttribute(name = "seqNum", required = true)
    protected int seqNum;

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link LoggedEventType }
     *     
     */
    public LoggedEventType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoggedEventType }
     *     
     */
    public void setEventType(LoggedEventType value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the variable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrcMonKeyForVariables }
     * 
     * 
     */
    public List<OrcMonKeyForVariables> getVariable() {
        if (variable == null) {
            variable = new ArrayList<OrcMonKeyForVariables>();
        }
        return this.variable;
    }

    /**
     * Gets the value of the seqNum property.
     * 
     */
    public int getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     */
    public void setSeqNum(int value) {
        this.seqNum = value;
    }

}
