
package com.approuter.schemas._2008._1.deployment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.approuter.schemas._2008._1.deployment.types.DowntimeRule;


/**
 * <p>Java class for getRuleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRuleResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rule" type="{http://www.approuter.com/schemas/2008/1/deployment/types}downtimeRule" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRuleResponse", propOrder = {
    "rule"
})
public class GetRuleResponse {

    protected DowntimeRule rule;

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link DowntimeRule }
     *     
     */
    public DowntimeRule getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link DowntimeRule }
     *     
     */
    public void setRule(DowntimeRule value) {
        this.rule = value;
    }

}
