
package com.approuter.schemas._2008._1.deployment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orchestrationLoggingLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="orchestrationLoggingLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="inline"/>
 *     &lt;enumeration value="initialValuesOnly"/>
 *     &lt;enumeration value="errorValues"/>
 *     &lt;enumeration value="initialAndErrorValues"/>
 *     &lt;enumeration value="all"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "orchestrationLoggingLevel")
@XmlEnum
public enum OrchestrationLoggingLevel {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("inline")
    INLINE("inline"),
    @XmlEnumValue("initialValuesOnly")
    INITIAL_VALUES_ONLY("initialValuesOnly"),
    @XmlEnumValue("errorValues")
    ERROR_VALUES("errorValues"),
    @XmlEnumValue("initialAndErrorValues")
    INITIAL_AND_ERROR_VALUES("initialAndErrorValues"),
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    OrchestrationLoggingLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrchestrationLoggingLevel fromValue(String v) {
        for (OrchestrationLoggingLevel c: OrchestrationLoggingLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
