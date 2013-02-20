
package com.approuter.schemas._2008._1.lognotif;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for logStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="logStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="resolved"/>
 *     &lt;enumeration value="unresolved"/>
 *     &lt;enumeration value="all"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "logStatus")
@XmlEnum
public enum LogStatus {

    @XmlEnumValue("resolved")
    RESOLVED("resolved"),
    @XmlEnumValue("unresolved")
    UNRESOLVED("unresolved"),
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    LogStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogStatus fromValue(String v) {
        for (LogStatus c: LogStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
