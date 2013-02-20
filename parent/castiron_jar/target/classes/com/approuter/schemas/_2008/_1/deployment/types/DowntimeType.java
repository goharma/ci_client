
package com.approuter.schemas._2008._1.deployment.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for downtimeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="downtimeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="stop"/>
 *     &lt;enumeration value="stopAndCancel"/>
 *     &lt;enumeration value="suspend"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "downtimeType")
@XmlEnum
public enum DowntimeType {

    @XmlEnumValue("stop")
    STOP("stop"),
    @XmlEnumValue("stopAndCancel")
    STOP_AND_CANCEL("stopAndCancel"),
    @XmlEnumValue("suspend")
    SUSPEND("suspend");
    private final String value;

    DowntimeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DowntimeType fromValue(String v) {
        for (DowntimeType c: DowntimeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
