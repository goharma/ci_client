
package com.approuter.schemas._2008._1.lognotif.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for logLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="logLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="critical"/>
 *     &lt;enumeration value="error"/>
 *     &lt;enumeration value="warning"/>
 *     &lt;enumeration value="info"/>
 *     &lt;enumeration value="all"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "logLevel", namespace = "http://www.approuter.com/schemas/2008/1/lognotif/types")
@XmlEnum
public enum LogLevel {

    @XmlEnumValue("critical")
    CRITICAL("critical"),
    @XmlEnumValue("error")
    ERROR("error"),
    @XmlEnumValue("warning")
    WARNING("warning"),
    @XmlEnumValue("info")
    INFO("info"),
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    LogLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogLevel fromValue(String v) {
        for (LogLevel c: LogLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
