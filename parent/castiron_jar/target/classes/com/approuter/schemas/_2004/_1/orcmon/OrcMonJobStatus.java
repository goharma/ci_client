
package com.approuter.schemas._2004._1.orcmon;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orcMonJobStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="orcMonJobStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="success"/>
 *     &lt;enumeration value="errored"/>
 *     &lt;enumeration value="running"/>
 *     &lt;enumeration value="cancelling"/>
 *     &lt;enumeration value="terminated"/>
 *     &lt;enumeration value="cancelled"/>
 *     &lt;enumeration value="suspended"/>
 *     &lt;enumeration value="crashed"/>
 *     &lt;enumeration value="suspending"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="all"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "orcMonJobStatus", namespace = "http://www.approuter.com/schemas/2004/1/orcmon")
@XmlEnum
public enum OrcMonJobStatus {

    @XmlEnumValue("success")
    SUCCESS("success"),
    @XmlEnumValue("errored")
    ERRORED("errored"),
    @XmlEnumValue("running")
    RUNNING("running"),
    @XmlEnumValue("cancelling")
    CANCELLING("cancelling"),
    @XmlEnumValue("terminated")
    TERMINATED("terminated"),
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),
    @XmlEnumValue("suspended")
    SUSPENDED("suspended"),
    @XmlEnumValue("crashed")
    CRASHED("crashed"),
    @XmlEnumValue("suspending")
    SUSPENDING("suspending"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    OrcMonJobStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrcMonJobStatus fromValue(String v) {
        for (OrcMonJobStatus c: OrcMonJobStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
