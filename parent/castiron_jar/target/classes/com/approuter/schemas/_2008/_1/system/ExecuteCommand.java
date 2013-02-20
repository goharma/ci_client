
package com.approuter.schemas._2008._1.system;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for executeCommand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executeCommand">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="command" type="{http://www.approuter.com/schemas/2008/1/system}systemCommand" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeCommand", propOrder = {
    "command"
})
public class ExecuteCommand {

    protected SystemCommand command;

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link SystemCommand }
     *     
     */
    public SystemCommand getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemCommand }
     *     
     */
    public void setCommand(SystemCommand value) {
        this.command = value;
    }

}
