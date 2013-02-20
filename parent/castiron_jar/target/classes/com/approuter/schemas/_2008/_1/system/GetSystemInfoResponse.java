
package com.approuter.schemas._2008._1.system;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.approuter.schemas._2008._1.util.types.NameValuePair;


/**
 * <p>Java class for getSystemInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSystemInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="systemInfo" type="{http://www.approuter.com/schemas/2008/1/util/types}nameValuePair" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSystemInfoResponse", propOrder = {
    "systemInfo"
})
public class GetSystemInfoResponse {

    protected List<NameValuePair> systemInfo;

    /**
     * Gets the value of the systemInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValuePair }
     * 
     * 
     */
    public List<NameValuePair> getSystemInfo() {
        if (systemInfo == null) {
            systemInfo = new ArrayList<NameValuePair>();
        }
        return this.systemInfo;
    }

}
