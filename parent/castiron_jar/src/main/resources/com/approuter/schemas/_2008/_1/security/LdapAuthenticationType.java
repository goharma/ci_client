
package com.approuter.schemas._2008._1.security;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ldapAuthenticationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ldapAuthenticationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="simple"/>
 *     &lt;enumeration value="sasl"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ldapAuthenticationType")
@XmlEnum
public enum LdapAuthenticationType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("simple")
    SIMPLE("simple"),
    @XmlEnumValue("sasl")
    SASL("sasl");
    private final String value;

    LdapAuthenticationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LdapAuthenticationType fromValue(String v) {
        for (LdapAuthenticationType c: LdapAuthenticationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
