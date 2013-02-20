
package com.approuter.schemas._2008._1.system;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for systemCommand.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="systemCommand">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="removeJobHistory"/>
 *     &lt;enumeration value="removeProjects"/>
 *     &lt;enumeration value="removeRunningJobs"/>
 *     &lt;enumeration value="generatePostmortem"/>
 *     &lt;enumeration value="restart"/>
 *     &lt;enumeration value="reboot"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "systemCommand")
@XmlEnum
public enum SystemCommand {

    @XmlEnumValue("removeJobHistory")
    REMOVE_JOB_HISTORY("removeJobHistory"),
    @XmlEnumValue("removeProjects")
    REMOVE_PROJECTS("removeProjects"),
    @XmlEnumValue("removeRunningJobs")
    REMOVE_RUNNING_JOBS("removeRunningJobs"),
    @XmlEnumValue("generatePostmortem")
    GENERATE_POSTMORTEM("generatePostmortem"),
    @XmlEnumValue("restart")
    RESTART("restart"),
    @XmlEnumValue("reboot")
    REBOOT("reboot");
    private final String value;

    SystemCommand(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SystemCommand fromValue(String v) {
        for (SystemCommand c: SystemCommand.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
