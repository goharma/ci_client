
package com.approuter.schema.router._1000.security._03;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for principalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="principalType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="user"/>
 *     &lt;enumeration value="group"/>
 *     &lt;enumeration value="realm"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "principalType")
@XmlEnum
public enum PrincipalType {

    @XmlEnumValue("user")
    USER("user"),
    @XmlEnumValue("group")
    GROUP("group"),
    @XmlEnumValue("realm")
    REALM("realm"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    PrincipalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrincipalType fromValue(String v) {
        for (PrincipalType c: PrincipalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}