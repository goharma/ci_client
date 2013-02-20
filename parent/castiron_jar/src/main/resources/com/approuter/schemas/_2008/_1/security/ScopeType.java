
package com.approuter.schemas._2008._1.security;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scopeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="scopeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GLOBAL"/>
 *     &lt;enumeration value="TENANT"/>
 *     &lt;enumeration value="ENV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "scopeType")
@XmlEnum
public enum ScopeType {

    GLOBAL,
    TENANT,
    ENV;

    public String value() {
        return name();
    }

    public static ScopeType fromValue(String v) {
        return valueOf(v);
    }

}
