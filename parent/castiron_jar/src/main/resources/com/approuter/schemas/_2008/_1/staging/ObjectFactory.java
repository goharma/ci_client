
package com.approuter.schemas._2008._1.staging;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.approuter.schemas._2008._1.staging package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _StopStagingDatabase_QNAME = new QName("http://www.approuter.com/schemas/2008/1/staging", "stopStagingDatabase");
    private final static QName _StartStagingDatabaseResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/staging", "startStagingDatabaseResponse");
    private final static QName _IsStagingDatabaseStarted_QNAME = new QName("http://www.approuter.com/schemas/2008/1/staging", "isStagingDatabaseStarted");
    private final static QName _IsStagingDatabaseStartedResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/staging", "isStagingDatabaseStartedResponse");
    private final static QName _StopStagingDatabaseResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/staging", "stopStagingDatabaseResponse");
    private final static QName _StartStagingDatabase_QNAME = new QName("http://www.approuter.com/schemas/2008/1/staging", "startStagingDatabase");
    private final static QName _SessionId_QNAME = new QName("http://www.approuter.com/schemas/2008/1/staging", "sessionId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.approuter.schemas._2008._1.staging
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StopStagingDatabaseResponse }
     * 
     */
    public StopStagingDatabaseResponse createStopStagingDatabaseResponse() {
        return new StopStagingDatabaseResponse();
    }

    /**
     * Create an instance of {@link StartStagingDatabase }
     * 
     */
    public StartStagingDatabase createStartStagingDatabase() {
        return new StartStagingDatabase();
    }

    /**
     * Create an instance of {@link IsStagingDatabaseStarted }
     * 
     */
    public IsStagingDatabaseStarted createIsStagingDatabaseStarted() {
        return new IsStagingDatabaseStarted();
    }

    /**
     * Create an instance of {@link StopStagingDatabase }
     * 
     */
    public StopStagingDatabase createStopStagingDatabase() {
        return new StopStagingDatabase();
    }

    /**
     * Create an instance of {@link StartStagingDatabaseResponse }
     * 
     */
    public StartStagingDatabaseResponse createStartStagingDatabaseResponse() {
        return new StartStagingDatabaseResponse();
    }

    /**
     * Create an instance of {@link IsStagingDatabaseStartedResponse }
     * 
     */
    public IsStagingDatabaseStartedResponse createIsStagingDatabaseStartedResponse() {
        return new IsStagingDatabaseStartedResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopStagingDatabase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/staging", name = "stopStagingDatabase")
    public JAXBElement<StopStagingDatabase> createStopStagingDatabase(StopStagingDatabase value) {
        return new JAXBElement<StopStagingDatabase>(_StopStagingDatabase_QNAME, StopStagingDatabase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartStagingDatabaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/staging", name = "startStagingDatabaseResponse")
    public JAXBElement<StartStagingDatabaseResponse> createStartStagingDatabaseResponse(StartStagingDatabaseResponse value) {
        return new JAXBElement<StartStagingDatabaseResponse>(_StartStagingDatabaseResponse_QNAME, StartStagingDatabaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsStagingDatabaseStarted }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/staging", name = "isStagingDatabaseStarted")
    public JAXBElement<IsStagingDatabaseStarted> createIsStagingDatabaseStarted(IsStagingDatabaseStarted value) {
        return new JAXBElement<IsStagingDatabaseStarted>(_IsStagingDatabaseStarted_QNAME, IsStagingDatabaseStarted.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsStagingDatabaseStartedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/staging", name = "isStagingDatabaseStartedResponse")
    public JAXBElement<IsStagingDatabaseStartedResponse> createIsStagingDatabaseStartedResponse(IsStagingDatabaseStartedResponse value) {
        return new JAXBElement<IsStagingDatabaseStartedResponse>(_IsStagingDatabaseStartedResponse_QNAME, IsStagingDatabaseStartedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopStagingDatabaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/staging", name = "stopStagingDatabaseResponse")
    public JAXBElement<StopStagingDatabaseResponse> createStopStagingDatabaseResponse(StopStagingDatabaseResponse value) {
        return new JAXBElement<StopStagingDatabaseResponse>(_StopStagingDatabaseResponse_QNAME, StopStagingDatabaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartStagingDatabase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/staging", name = "startStagingDatabase")
    public JAXBElement<StartStagingDatabase> createStartStagingDatabase(StartStagingDatabase value) {
        return new JAXBElement<StartStagingDatabase>(_StartStagingDatabase_QNAME, StartStagingDatabase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/staging", name = "sessionId")
    public JAXBElement<String> createSessionId(String value) {
        return new JAXBElement<String>(_SessionId_QNAME, String.class, null, value);
    }

}
