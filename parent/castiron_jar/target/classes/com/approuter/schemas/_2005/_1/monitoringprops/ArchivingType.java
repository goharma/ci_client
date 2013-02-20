
package com.approuter.schemas._2005._1.monitoringprops;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArchivingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArchivingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="fileExport" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="fileReplace" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="fileDir" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ftpExport" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ftpHost" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ftpPort" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ftpUsername" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ftpPassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ftpDir" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ftpExportUtilizationData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArchivingType")
public class ArchivingType {

    @XmlAttribute(name = "fileExport")
    protected Boolean fileExport;
    @XmlAttribute(name = "fileReplace")
    protected Boolean fileReplace;
    @XmlAttribute(name = "fileDir")
    protected String fileDir;
    @XmlAttribute(name = "ftpExport")
    protected Boolean ftpExport;
    @XmlAttribute(name = "ftpHost")
    protected String ftpHost;
    @XmlAttribute(name = "ftpPort")
    protected Integer ftpPort;
    @XmlAttribute(name = "ftpUsername")
    protected String ftpUsername;
    @XmlAttribute(name = "ftpPassword")
    protected String ftpPassword;
    @XmlAttribute(name = "ftpDir")
    protected String ftpDir;
    @XmlAttribute(name = "ftpExportUtilizationData")
    protected Boolean ftpExportUtilizationData;

    /**
     * Gets the value of the fileExport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFileExport() {
        return fileExport;
    }

    /**
     * Sets the value of the fileExport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFileExport(Boolean value) {
        this.fileExport = value;
    }

    /**
     * Gets the value of the fileReplace property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFileReplace() {
        return fileReplace;
    }

    /**
     * Sets the value of the fileReplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFileReplace(Boolean value) {
        this.fileReplace = value;
    }

    /**
     * Gets the value of the fileDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileDir() {
        return fileDir;
    }

    /**
     * Sets the value of the fileDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileDir(String value) {
        this.fileDir = value;
    }

    /**
     * Gets the value of the ftpExport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFtpExport() {
        return ftpExport;
    }

    /**
     * Sets the value of the ftpExport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFtpExport(Boolean value) {
        this.ftpExport = value;
    }

    /**
     * Gets the value of the ftpHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtpHost() {
        return ftpHost;
    }

    /**
     * Sets the value of the ftpHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtpHost(String value) {
        this.ftpHost = value;
    }

    /**
     * Gets the value of the ftpPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFtpPort() {
        return ftpPort;
    }

    /**
     * Sets the value of the ftpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFtpPort(Integer value) {
        this.ftpPort = value;
    }

    /**
     * Gets the value of the ftpUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtpUsername() {
        return ftpUsername;
    }

    /**
     * Sets the value of the ftpUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtpUsername(String value) {
        this.ftpUsername = value;
    }

    /**
     * Gets the value of the ftpPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtpPassword() {
        return ftpPassword;
    }

    /**
     * Sets the value of the ftpPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtpPassword(String value) {
        this.ftpPassword = value;
    }

    /**
     * Gets the value of the ftpDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtpDir() {
        return ftpDir;
    }

    /**
     * Sets the value of the ftpDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtpDir(String value) {
        this.ftpDir = value;
    }

    /**
     * Gets the value of the ftpExportUtilizationData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFtpExportUtilizationData() {
        return ftpExportUtilizationData;
    }

    /**
     * Sets the value of the ftpExportUtilizationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFtpExportUtilizationData(Boolean value) {
        this.ftpExportUtilizationData = value;
    }

}
