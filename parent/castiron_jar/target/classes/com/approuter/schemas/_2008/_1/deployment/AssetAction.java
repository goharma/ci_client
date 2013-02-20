
package com.approuter.schemas._2008._1.deployment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assetAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="assetAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="create"/>
 *     &lt;enumeration value="delete"/>
 *     &lt;enumeration value="recreate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "assetAction")
@XmlEnum
public enum AssetAction {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("create")
    CREATE("create"),
    @XmlEnumValue("delete")
    DELETE("delete"),
    @XmlEnumValue("recreate")
    RECREATE("recreate");
    private final String value;

    AssetAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssetAction fromValue(String v) {
        for (AssetAction c: AssetAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
