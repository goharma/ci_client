
package com.approuter.schemas._2008._1.deployment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for importType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="importType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="importProjects"/>
 *     &lt;enumeration value="importUsers"/>
 *     &lt;enumeration value="importProjectsAndUsers"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "importType")
@XmlEnum
public enum ImportType {

    @XmlEnumValue("importProjects")
    IMPORT_PROJECTS("importProjects"),
    @XmlEnumValue("importUsers")
    IMPORT_USERS("importUsers"),
    @XmlEnumValue("importProjectsAndUsers")
    IMPORT_PROJECTS_AND_USERS("importProjectsAndUsers");
    private final String value;

    ImportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImportType fromValue(String v) {
        for (ImportType c: ImportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
