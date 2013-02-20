
package com.approuter.schemas._2008._1.lognotif.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for logComponent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="logComponent">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="hardware"/>
 *     &lt;enumeration value="resources"/>
 *     &lt;enumeration value="network"/>
 *     &lt;enumeration value="security"/>
 *     &lt;enumeration value="orchestration"/>
 *     &lt;enumeration value="deployment"/>
 *     &lt;enumeration value="all"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "logComponent")
@XmlEnum
public enum LogComponent {

    @XmlEnumValue("hardware")
    HARDWARE("hardware"),
    @XmlEnumValue("resources")
    RESOURCES("resources"),
    @XmlEnumValue("network")
    NETWORK("network"),
    @XmlEnumValue("security")
    SECURITY("security"),
    @XmlEnumValue("orchestration")
    ORCHESTRATION("orchestration"),
    @XmlEnumValue("deployment")
    DEPLOYMENT("deployment"),
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    LogComponent(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogComponent fromValue(String v) {
        for (LogComponent c: LogComponent.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
