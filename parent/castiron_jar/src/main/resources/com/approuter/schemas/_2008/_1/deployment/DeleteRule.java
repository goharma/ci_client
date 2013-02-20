
package com.approuter.schemas._2008._1.deployment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ruleId" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteRule", propOrder = {
    "ruleId"
})
public class DeleteRule {

    protected long ruleId;

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

}
