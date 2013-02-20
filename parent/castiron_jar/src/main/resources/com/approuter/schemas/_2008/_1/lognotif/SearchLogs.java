
package com.approuter.schemas._2008._1.lognotif;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.approuter.schemas._2008._1.lognotif.types.LogComponent;
import com.approuter.schemas._2008._1.lognotif.types.LogLevel;


/**
 * <p>Java class for searchLogs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchLogs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="logComponent" type="{http://www.approuter.com/schemas/2008/1/lognotif/types}logComponent" minOccurs="0" form="qualified"/>
 *         &lt;element name="logLevel" type="{http://www.approuter.com/schemas/2008/1/lognotif/types}logLevel" minOccurs="0" form="qualified"/>
 *         &lt;element name="maxDaysOld" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/>
 *         &lt;element name="status" type="{http://www.approuter.com/schemas/2008/1/lognotif}logStatus" minOccurs="0" form="qualified"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchLogs", propOrder = {
    "logComponent",
    "logLevel",
    "maxDaysOld",
    "status",
    "page",
    "pageSize"
})
public class SearchLogs {

    protected LogComponent logComponent;
    protected LogLevel logLevel;
    protected int maxDaysOld;
    protected LogStatus status;
    protected int page;
    protected int pageSize;

    /**
     * Gets the value of the logComponent property.
     * 
     * @return
     *     possible object is
     *     {@link LogComponent }
     *     
     */
    public LogComponent getLogComponent() {
        return logComponent;
    }

    /**
     * Sets the value of the logComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogComponent }
     *     
     */
    public void setLogComponent(LogComponent value) {
        this.logComponent = value;
    }

    /**
     * Gets the value of the logLevel property.
     * 
     * @return
     *     possible object is
     *     {@link LogLevel }
     *     
     */
    public LogLevel getLogLevel() {
        return logLevel;
    }

    /**
     * Sets the value of the logLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogLevel }
     *     
     */
    public void setLogLevel(LogLevel value) {
        this.logLevel = value;
    }

    /**
     * Gets the value of the maxDaysOld property.
     * 
     */
    public int getMaxDaysOld() {
        return maxDaysOld;
    }

    /**
     * Sets the value of the maxDaysOld property.
     * 
     */
    public void setMaxDaysOld(int value) {
        this.maxDaysOld = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link LogStatus }
     *     
     */
    public LogStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogStatus }
     *     
     */
    public void setStatus(LogStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the page property.
     * 
     */
    public int getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     */
    public void setPage(int value) {
        this.page = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

}
