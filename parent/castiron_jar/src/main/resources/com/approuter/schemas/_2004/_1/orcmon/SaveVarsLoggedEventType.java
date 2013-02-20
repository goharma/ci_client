
package com.approuter.schemas._2004._1.orcmon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaveVarsLoggedEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaveVarsLoggedEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="activityPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="variableName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveVarsLoggedEventType", propOrder = {
    "taskId",
    "sequenceNumber",
    "activityPath",
    "activityId",
    "variableName"
})
public class SaveVarsLoggedEventType {

    @XmlElement(required = true)
    protected String taskId;
    protected int sequenceNumber;
    protected String activityPath;
    protected int activityId;
    @XmlElement(required = true)
    protected List<String> variableName;

    /**
     * Gets the value of the taskId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskId(String value) {
        this.taskId = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     */
    public int getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     */
    public void setSequenceNumber(int value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the activityPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityPath() {
        return activityPath;
    }

    /**
     * Sets the value of the activityPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityPath(String value) {
        this.activityPath = value;
    }

    /**
     * Gets the value of the activityId property.
     * 
     */
    public int getActivityId() {
        return activityId;
    }

    /**
     * Sets the value of the activityId property.
     * 
     */
    public void setActivityId(int value) {
        this.activityId = value;
    }

    /**
     * Gets the value of the variableName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variableName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariableName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVariableName() {
        if (variableName == null) {
            variableName = new ArrayList<String>();
        }
        return this.variableName;
    }

}
