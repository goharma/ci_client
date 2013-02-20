
package com.approuter.schemas._2008._1.deployment.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for repeatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="repeatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="daily"/>
 *     &lt;enumeration value="weekly"/>
 *     &lt;enumeration value="monthly"/>
 *     &lt;enumeration value="yearly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "repeatType")
@XmlEnum
public enum RepeatType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("daily")
    DAILY("daily"),
    @XmlEnumValue("weekly")
    WEEKLY("weekly"),
    @XmlEnumValue("monthly")
    MONTHLY("monthly"),
    @XmlEnumValue("yearly")
    YEARLY("yearly");
    private final String value;

    RepeatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RepeatType fromValue(String v) {
        for (RepeatType c: RepeatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
