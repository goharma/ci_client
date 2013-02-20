
package com.approuter.schemas._2008._1.deployment;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for importRepository complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="importRepository">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="importType" type="{http://www.approuter.com/schemas/2008/1/deployment}importType" minOccurs="0" form="qualified"/>
 *         &lt;element name="repository" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importRepository", propOrder = {
    "importType",
    "repository"
})
public class ImportRepository {

    protected ImportType importType;
    @XmlMimeType("application/x-tar-gz")
    protected DataHandler repository;

    /**
     * Gets the value of the importType property.
     * 
     * @return
     *     possible object is
     *     {@link ImportType }
     *     
     */
    public ImportType getImportType() {
        return importType;
    }

    /**
     * Sets the value of the importType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportType }
     *     
     */
    public void setImportType(ImportType value) {
        this.importType = value;
    }

    /**
     * Gets the value of the repository property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getRepository() {
        return repository;
    }

    /**
     * Sets the value of the repository property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setRepository(DataHandler value) {
        this.repository = value;
    }

}
