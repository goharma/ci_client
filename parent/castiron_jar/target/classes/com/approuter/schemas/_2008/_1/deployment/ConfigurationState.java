
package com.approuter.schemas._2008._1.deployment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for configurationState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="configurationState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="undeployed"/>
 *     &lt;enumeration value="running"/>
 *     &lt;enumeration value="suspended"/>
 *     &lt;enumeration value="suspending"/>
 *     &lt;enumeration value="stopped"/>
 *     &lt;enumeration value="stopping"/>
 *     &lt;enumeration value="starting"/>
 *     &lt;enumeration value="deploying"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "configurationState")
@XmlEnum
public enum ConfigurationState {

    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("undeployed")
    UNDEPLOYED("undeployed"),
    @XmlEnumValue("running")
    RUNNING("running"),
    @XmlEnumValue("suspended")
    SUSPENDED("suspended"),
    @XmlEnumValue("suspending")
    SUSPENDING("suspending"),
    @XmlEnumValue("stopped")
    STOPPED("stopped"),
    @XmlEnumValue("stopping")
    STOPPING("stopping"),
    @XmlEnumValue("starting")
    STARTING("starting"),
    @XmlEnumValue("deploying")
    DEPLOYING("deploying");
    private final String value;

    ConfigurationState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationState fromValue(String v) {
        for (ConfigurationState c: ConfigurationState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
