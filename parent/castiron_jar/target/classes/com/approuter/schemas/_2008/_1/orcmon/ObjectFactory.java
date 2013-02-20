
package com.approuter.schemas._2008._1.orcmon;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.approuter.schemas._2008._1.orcmon package. 
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

    private final static QName _GetJobDetailsResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/orcmon", "getJobDetailsResponse");
    private final static QName _SearchJobsResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/orcmon", "searchJobsResponse");
    private final static QName _GetJobCount_QNAME = new QName("http://www.approuter.com/schemas/2008/1/orcmon", "getJobCount");
    private final static QName _GetMonitoringProperties_QNAME = new QName("http://www.approuter.com/schemas/2008/1/orcmon", "getMonitoringProperties");
    private final static QName _SetMonitoringPropertiesResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/orcmon", "setMonitoringPropertiesResponse");
    private final static QName _GetJobCountResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/orcmon", "getJobCountResponse");
    private final static QName _PurgeJobsResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/orcmon", "purgeJobsResponse");
    private final static QName _SessionId_QNAME = new QName("http://www.approuter.com/schemas/2008/1/orcmon", "sessionId");
    private final static QName _PurgeJobs_QNAME = new QName("http://www.approuter.com/schemas/2008/1/orcmon", "purgeJobs");
    private final static QName _GetJobDetails_QNAME = new QName("http://www.approuter.com/schemas/2008/1/orcmon", "getJobDetails");
    private final static QName _GetMonitoringPropertiesResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/orcmon", "getMonitoringPropertiesResponse");
    private final static QName _Exception_QNAME = new QName("http://www.approuter.com/schemas/2008/1/orcmon", "Exception");
    private final static QName _SearchJobs_QNAME = new QName("http://www.approuter.com/schemas/2008/1/orcmon", "searchJobs");
    private final static QName _SetMonitoringProperties_QNAME = new QName("http://www.approuter.com/schemas/2008/1/orcmon", "setMonitoringProperties");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.approuter.schemas._2008._1.orcmon
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link SearchJobs }
     * 
     */
    public SearchJobs createSearchJobs() {
        return new SearchJobs();
    }

    /**
     * Create an instance of {@link SetMonitoringProperties }
     * 
     */
    public SetMonitoringProperties createSetMonitoringProperties() {
        return new SetMonitoringProperties();
    }

    /**
     * Create an instance of {@link PurgeJobsResponse }
     * 
     */
    public PurgeJobsResponse createPurgeJobsResponse() {
        return new PurgeJobsResponse();
    }

    /**
     * Create an instance of {@link PurgeJobs }
     * 
     */
    public PurgeJobs createPurgeJobs() {
        return new PurgeJobs();
    }

    /**
     * Create an instance of {@link GetMonitoringPropertiesResponse }
     * 
     */
    public GetMonitoringPropertiesResponse createGetMonitoringPropertiesResponse() {
        return new GetMonitoringPropertiesResponse();
    }

    /**
     * Create an instance of {@link GetJobDetails }
     * 
     */
    public GetJobDetails createGetJobDetails() {
        return new GetJobDetails();
    }

    /**
     * Create an instance of {@link SearchJobsResponse }
     * 
     */
    public SearchJobsResponse createSearchJobsResponse() {
        return new SearchJobsResponse();
    }

    /**
     * Create an instance of {@link GetMonitoringProperties }
     * 
     */
    public GetMonitoringProperties createGetMonitoringProperties() {
        return new GetMonitoringProperties();
    }

    /**
     * Create an instance of {@link GetJobCount }
     * 
     */
    public GetJobCount createGetJobCount() {
        return new GetJobCount();
    }

    /**
     * Create an instance of {@link SetMonitoringPropertiesResponse }
     * 
     */
    public SetMonitoringPropertiesResponse createSetMonitoringPropertiesResponse() {
        return new SetMonitoringPropertiesResponse();
    }

    /**
     * Create an instance of {@link GetJobCountResponse }
     * 
     */
    public GetJobCountResponse createGetJobCountResponse() {
        return new GetJobCountResponse();
    }

    /**
     * Create an instance of {@link GetJobDetailsResponse }
     * 
     */
    public GetJobDetailsResponse createGetJobDetailsResponse() {
        return new GetJobDetailsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJobDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/orcmon", name = "getJobDetailsResponse")
    public JAXBElement<GetJobDetailsResponse> createGetJobDetailsResponse(GetJobDetailsResponse value) {
        return new JAXBElement<GetJobDetailsResponse>(_GetJobDetailsResponse_QNAME, GetJobDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchJobsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/orcmon", name = "searchJobsResponse")
    public JAXBElement<SearchJobsResponse> createSearchJobsResponse(SearchJobsResponse value) {
        return new JAXBElement<SearchJobsResponse>(_SearchJobsResponse_QNAME, SearchJobsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJobCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/orcmon", name = "getJobCount")
    public JAXBElement<GetJobCount> createGetJobCount(GetJobCount value) {
        return new JAXBElement<GetJobCount>(_GetJobCount_QNAME, GetJobCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMonitoringProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/orcmon", name = "getMonitoringProperties")
    public JAXBElement<GetMonitoringProperties> createGetMonitoringProperties(GetMonitoringProperties value) {
        return new JAXBElement<GetMonitoringProperties>(_GetMonitoringProperties_QNAME, GetMonitoringProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMonitoringPropertiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/orcmon", name = "setMonitoringPropertiesResponse")
    public JAXBElement<SetMonitoringPropertiesResponse> createSetMonitoringPropertiesResponse(SetMonitoringPropertiesResponse value) {
        return new JAXBElement<SetMonitoringPropertiesResponse>(_SetMonitoringPropertiesResponse_QNAME, SetMonitoringPropertiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJobCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/orcmon", name = "getJobCountResponse")
    public JAXBElement<GetJobCountResponse> createGetJobCountResponse(GetJobCountResponse value) {
        return new JAXBElement<GetJobCountResponse>(_GetJobCountResponse_QNAME, GetJobCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeJobsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/orcmon", name = "purgeJobsResponse")
    public JAXBElement<PurgeJobsResponse> createPurgeJobsResponse(PurgeJobsResponse value) {
        return new JAXBElement<PurgeJobsResponse>(_PurgeJobsResponse_QNAME, PurgeJobsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/orcmon", name = "sessionId")
    public JAXBElement<String> createSessionId(String value) {
        return new JAXBElement<String>(_SessionId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeJobs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/orcmon", name = "purgeJobs")
    public JAXBElement<PurgeJobs> createPurgeJobs(PurgeJobs value) {
        return new JAXBElement<PurgeJobs>(_PurgeJobs_QNAME, PurgeJobs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJobDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/orcmon", name = "getJobDetails")
    public JAXBElement<GetJobDetails> createGetJobDetails(GetJobDetails value) {
        return new JAXBElement<GetJobDetails>(_GetJobDetails_QNAME, GetJobDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMonitoringPropertiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/orcmon", name = "getMonitoringPropertiesResponse")
    public JAXBElement<GetMonitoringPropertiesResponse> createGetMonitoringPropertiesResponse(GetMonitoringPropertiesResponse value) {
        return new JAXBElement<GetMonitoringPropertiesResponse>(_GetMonitoringPropertiesResponse_QNAME, GetMonitoringPropertiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/orcmon", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchJobs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/orcmon", name = "searchJobs")
    public JAXBElement<SearchJobs> createSearchJobs(SearchJobs value) {
        return new JAXBElement<SearchJobs>(_SearchJobs_QNAME, SearchJobs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMonitoringProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/orcmon", name = "setMonitoringProperties")
    public JAXBElement<SetMonitoringProperties> createSetMonitoringProperties(SetMonitoringProperties value) {
        return new JAXBElement<SetMonitoringProperties>(_SetMonitoringProperties_QNAME, SetMonitoringProperties.class, null, value);
    }

}
