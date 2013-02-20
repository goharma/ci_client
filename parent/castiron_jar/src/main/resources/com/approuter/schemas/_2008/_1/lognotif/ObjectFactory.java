
package com.approuter.schemas._2008._1.lognotif;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.approuter.schemas._2008._1.lognotif package. 
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

    private final static QName _SessionId_QNAME = new QName("http://www.approuter.com/schemas/2008/1/lognotif", "sessionId");
    private final static QName _SetEmailEndpoint_QNAME = new QName("http://www.approuter.com/schemas/2008/1/lognotif", "setEmailEndpoint");
    private final static QName _SetSnmpEndpoint_QNAME = new QName("http://www.approuter.com/schemas/2008/1/lognotif", "setSnmpEndpoint");
    private final static QName _GetEmailEndpoint_QNAME = new QName("http://www.approuter.com/schemas/2008/1/lognotif", "getEmailEndpoint");
    private final static QName _SetLogLevel_QNAME = new QName("http://www.approuter.com/schemas/2008/1/lognotif", "setLogLevel");
    private final static QName _GetSnmpEndpoint_QNAME = new QName("http://www.approuter.com/schemas/2008/1/lognotif", "getSnmpEndpoint");
    private final static QName _GetLogLevelResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/lognotif", "getLogLevelResponse");
    private final static QName _DeleteNotificationPolicyResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/lognotif", "deleteNotificationPolicyResponse");
    private final static QName _SetSnmpEndpointResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/lognotif", "setSnmpEndpointResponse");
    private final static QName _GetLogCount_QNAME = new QName("http://www.approuter.com/schemas/2008/1/lognotif", "getLogCount");
    private final static QName _SearchLogs_QNAME = new QName("http://www.approuter.com/schemas/2008/1/lognotif", "searchLogs");
    private final static QName _CreateNotificationPolicyResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/lognotif", "createNotificationPolicyResponse");
    private final static QName _GetNotificationPolicies_QNAME = new QName("http://www.approuter.com/schemas/2008/1/lognotif", "getNotificationPolicies");
    private final static QName _CreateNotificationPolicy_QNAME = new QName("http://www.approuter.com/schemas/2008/1/lognotif", "createNotificationPolicy");
    private final static QName _GetNotificationPolicy_QNAME = new QName("http://www.approuter.com/schemas/2008/1/lognotif", "getNotificationPolicy");
    private final static QName _SetLogLevelResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/lognotif", "setLogLevelResponse");
    private final static QName _GetNotificationPolicyResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/lognotif", "getNotificationPolicyResponse");
    private final static QName _GetNotificationPoliciesResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/lognotif", "getNotificationPoliciesResponse");
    private final static QName _GetSnmpEndpointResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/lognotif", "getSnmpEndpointResponse");
    private final static QName _SetEmailEndpointResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/lognotif", "setEmailEndpointResponse");
    private final static QName _GetEmailEndpointResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/lognotif", "getEmailEndpointResponse");
    private final static QName _GetLogCountResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/lognotif", "getLogCountResponse");
    private final static QName _SearchLogsResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/lognotif", "searchLogsResponse");
    private final static QName _DeleteNotificationPolicy_QNAME = new QName("http://www.approuter.com/schemas/2008/1/lognotif", "deleteNotificationPolicy");
    private final static QName _GetLogLevel_QNAME = new QName("http://www.approuter.com/schemas/2008/1/lognotif", "getLogLevel");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.approuter.schemas._2008._1.lognotif
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetSnmpEndpointResponse }
     * 
     */
    public SetSnmpEndpointResponse createSetSnmpEndpointResponse() {
        return new SetSnmpEndpointResponse();
    }

    /**
     * Create an instance of {@link GetLogCount }
     * 
     */
    public GetLogCount createGetLogCount() {
        return new GetLogCount();
    }

    /**
     * Create an instance of {@link DeleteNotificationPolicy }
     * 
     */
    public DeleteNotificationPolicy createDeleteNotificationPolicy() {
        return new DeleteNotificationPolicy();
    }

    /**
     * Create an instance of {@link GetLogLevelResponse }
     * 
     */
    public GetLogLevelResponse createGetLogLevelResponse() {
        return new GetLogLevelResponse();
    }

    /**
     * Create an instance of {@link DeleteNotificationPolicyResponse }
     * 
     */
    public DeleteNotificationPolicyResponse createDeleteNotificationPolicyResponse() {
        return new DeleteNotificationPolicyResponse();
    }

    /**
     * Create an instance of {@link SearchLogsResponse }
     * 
     */
    public SearchLogsResponse createSearchLogsResponse() {
        return new SearchLogsResponse();
    }

    /**
     * Create an instance of {@link CreateNotificationPolicyResponse }
     * 
     */
    public CreateNotificationPolicyResponse createCreateNotificationPolicyResponse() {
        return new CreateNotificationPolicyResponse();
    }

    /**
     * Create an instance of {@link GetLogLevel }
     * 
     */
    public GetLogLevel createGetLogLevel() {
        return new GetLogLevel();
    }

    /**
     * Create an instance of {@link SearchLogs }
     * 
     */
    public SearchLogs createSearchLogs() {
        return new SearchLogs();
    }

    /**
     * Create an instance of {@link SetLogLevelResponse }
     * 
     */
    public SetLogLevelResponse createSetLogLevelResponse() {
        return new SetLogLevelResponse();
    }

    /**
     * Create an instance of {@link GetNotificationPolicy }
     * 
     */
    public GetNotificationPolicy createGetNotificationPolicy() {
        return new GetNotificationPolicy();
    }

    /**
     * Create an instance of {@link SetSnmpEndpoint }
     * 
     */
    public SetSnmpEndpoint createSetSnmpEndpoint() {
        return new SetSnmpEndpoint();
    }

    /**
     * Create an instance of {@link GetEmailEndpoint }
     * 
     */
    public GetEmailEndpoint createGetEmailEndpoint() {
        return new GetEmailEndpoint();
    }

    /**
     * Create an instance of {@link GetNotificationPolicies }
     * 
     */
    public GetNotificationPolicies createGetNotificationPolicies() {
        return new GetNotificationPolicies();
    }

    /**
     * Create an instance of {@link SetEmailEndpoint }
     * 
     */
    public SetEmailEndpoint createSetEmailEndpoint() {
        return new SetEmailEndpoint();
    }

    /**
     * Create an instance of {@link CreateNotificationPolicy }
     * 
     */
    public CreateNotificationPolicy createCreateNotificationPolicy() {
        return new CreateNotificationPolicy();
    }

    /**
     * Create an instance of {@link GetEmailEndpointResponse }
     * 
     */
    public GetEmailEndpointResponse createGetEmailEndpointResponse() {
        return new GetEmailEndpointResponse();
    }

    /**
     * Create an instance of {@link GetLogCountResponse }
     * 
     */
    public GetLogCountResponse createGetLogCountResponse() {
        return new GetLogCountResponse();
    }

    /**
     * Create an instance of {@link SetLogLevel }
     * 
     */
    public SetLogLevel createSetLogLevel() {
        return new SetLogLevel();
    }

    /**
     * Create an instance of {@link GetSnmpEndpoint }
     * 
     */
    public GetSnmpEndpoint createGetSnmpEndpoint() {
        return new GetSnmpEndpoint();
    }

    /**
     * Create an instance of {@link GetNotificationPolicyResponse }
     * 
     */
    public GetNotificationPolicyResponse createGetNotificationPolicyResponse() {
        return new GetNotificationPolicyResponse();
    }

    /**
     * Create an instance of {@link GetNotificationPoliciesResponse }
     * 
     */
    public GetNotificationPoliciesResponse createGetNotificationPoliciesResponse() {
        return new GetNotificationPoliciesResponse();
    }

    /**
     * Create an instance of {@link SetEmailEndpointResponse }
     * 
     */
    public SetEmailEndpointResponse createSetEmailEndpointResponse() {
        return new SetEmailEndpointResponse();
    }

    /**
     * Create an instance of {@link GetSnmpEndpointResponse }
     * 
     */
    public GetSnmpEndpointResponse createGetSnmpEndpointResponse() {
        return new GetSnmpEndpointResponse();
    }

    /**
     * Create an instance of {@link SnmpEndpoint }
     * 
     */
    public SnmpEndpoint createSnmpEndpoint() {
        return new SnmpEndpoint();
    }

    /**
     * Create an instance of {@link NotificationPolicy }
     * 
     */
    public NotificationPolicy createNotificationPolicy() {
        return new NotificationPolicy();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link Guid }
     * 
     */
    public Guid createGuid() {
        return new Guid();
    }

    /**
     * Create an instance of {@link EmailEndpoint }
     * 
     */
    public EmailEndpoint createEmailEndpoint() {
        return new EmailEndpoint();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/lognotif", name = "sessionId")
    public JAXBElement<String> createSessionId(String value) {
        return new JAXBElement<String>(_SessionId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetEmailEndpoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/lognotif", name = "setEmailEndpoint")
    public JAXBElement<SetEmailEndpoint> createSetEmailEndpoint(SetEmailEndpoint value) {
        return new JAXBElement<SetEmailEndpoint>(_SetEmailEndpoint_QNAME, SetEmailEndpoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetSnmpEndpoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/lognotif", name = "setSnmpEndpoint")
    public JAXBElement<SetSnmpEndpoint> createSetSnmpEndpoint(SetSnmpEndpoint value) {
        return new JAXBElement<SetSnmpEndpoint>(_SetSnmpEndpoint_QNAME, SetSnmpEndpoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmailEndpoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/lognotif", name = "getEmailEndpoint")
    public JAXBElement<GetEmailEndpoint> createGetEmailEndpoint(GetEmailEndpoint value) {
        return new JAXBElement<GetEmailEndpoint>(_GetEmailEndpoint_QNAME, GetEmailEndpoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLogLevel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/lognotif", name = "setLogLevel")
    public JAXBElement<SetLogLevel> createSetLogLevel(SetLogLevel value) {
        return new JAXBElement<SetLogLevel>(_SetLogLevel_QNAME, SetLogLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSnmpEndpoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/lognotif", name = "getSnmpEndpoint")
    public JAXBElement<GetSnmpEndpoint> createGetSnmpEndpoint(GetSnmpEndpoint value) {
        return new JAXBElement<GetSnmpEndpoint>(_GetSnmpEndpoint_QNAME, GetSnmpEndpoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLogLevelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/lognotif", name = "getLogLevelResponse")
    public JAXBElement<GetLogLevelResponse> createGetLogLevelResponse(GetLogLevelResponse value) {
        return new JAXBElement<GetLogLevelResponse>(_GetLogLevelResponse_QNAME, GetLogLevelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteNotificationPolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/lognotif", name = "deleteNotificationPolicyResponse")
    public JAXBElement<DeleteNotificationPolicyResponse> createDeleteNotificationPolicyResponse(DeleteNotificationPolicyResponse value) {
        return new JAXBElement<DeleteNotificationPolicyResponse>(_DeleteNotificationPolicyResponse_QNAME, DeleteNotificationPolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetSnmpEndpointResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/lognotif", name = "setSnmpEndpointResponse")
    public JAXBElement<SetSnmpEndpointResponse> createSetSnmpEndpointResponse(SetSnmpEndpointResponse value) {
        return new JAXBElement<SetSnmpEndpointResponse>(_SetSnmpEndpointResponse_QNAME, SetSnmpEndpointResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLogCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/lognotif", name = "getLogCount")
    public JAXBElement<GetLogCount> createGetLogCount(GetLogCount value) {
        return new JAXBElement<GetLogCount>(_GetLogCount_QNAME, GetLogCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchLogs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/lognotif", name = "searchLogs")
    public JAXBElement<SearchLogs> createSearchLogs(SearchLogs value) {
        return new JAXBElement<SearchLogs>(_SearchLogs_QNAME, SearchLogs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNotificationPolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/lognotif", name = "createNotificationPolicyResponse")
    public JAXBElement<CreateNotificationPolicyResponse> createCreateNotificationPolicyResponse(CreateNotificationPolicyResponse value) {
        return new JAXBElement<CreateNotificationPolicyResponse>(_CreateNotificationPolicyResponse_QNAME, CreateNotificationPolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotificationPolicies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/lognotif", name = "getNotificationPolicies")
    public JAXBElement<GetNotificationPolicies> createGetNotificationPolicies(GetNotificationPolicies value) {
        return new JAXBElement<GetNotificationPolicies>(_GetNotificationPolicies_QNAME, GetNotificationPolicies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNotificationPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/lognotif", name = "createNotificationPolicy")
    public JAXBElement<CreateNotificationPolicy> createCreateNotificationPolicy(CreateNotificationPolicy value) {
        return new JAXBElement<CreateNotificationPolicy>(_CreateNotificationPolicy_QNAME, CreateNotificationPolicy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotificationPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/lognotif", name = "getNotificationPolicy")
    public JAXBElement<GetNotificationPolicy> createGetNotificationPolicy(GetNotificationPolicy value) {
        return new JAXBElement<GetNotificationPolicy>(_GetNotificationPolicy_QNAME, GetNotificationPolicy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLogLevelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/lognotif", name = "setLogLevelResponse")
    public JAXBElement<SetLogLevelResponse> createSetLogLevelResponse(SetLogLevelResponse value) {
        return new JAXBElement<SetLogLevelResponse>(_SetLogLevelResponse_QNAME, SetLogLevelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotificationPolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/lognotif", name = "getNotificationPolicyResponse")
    public JAXBElement<GetNotificationPolicyResponse> createGetNotificationPolicyResponse(GetNotificationPolicyResponse value) {
        return new JAXBElement<GetNotificationPolicyResponse>(_GetNotificationPolicyResponse_QNAME, GetNotificationPolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotificationPoliciesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/lognotif", name = "getNotificationPoliciesResponse")
    public JAXBElement<GetNotificationPoliciesResponse> createGetNotificationPoliciesResponse(GetNotificationPoliciesResponse value) {
        return new JAXBElement<GetNotificationPoliciesResponse>(_GetNotificationPoliciesResponse_QNAME, GetNotificationPoliciesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSnmpEndpointResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/lognotif", name = "getSnmpEndpointResponse")
    public JAXBElement<GetSnmpEndpointResponse> createGetSnmpEndpointResponse(GetSnmpEndpointResponse value) {
        return new JAXBElement<GetSnmpEndpointResponse>(_GetSnmpEndpointResponse_QNAME, GetSnmpEndpointResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetEmailEndpointResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/lognotif", name = "setEmailEndpointResponse")
    public JAXBElement<SetEmailEndpointResponse> createSetEmailEndpointResponse(SetEmailEndpointResponse value) {
        return new JAXBElement<SetEmailEndpointResponse>(_SetEmailEndpointResponse_QNAME, SetEmailEndpointResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmailEndpointResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/lognotif", name = "getEmailEndpointResponse")
    public JAXBElement<GetEmailEndpointResponse> createGetEmailEndpointResponse(GetEmailEndpointResponse value) {
        return new JAXBElement<GetEmailEndpointResponse>(_GetEmailEndpointResponse_QNAME, GetEmailEndpointResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLogCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/lognotif", name = "getLogCountResponse")
    public JAXBElement<GetLogCountResponse> createGetLogCountResponse(GetLogCountResponse value) {
        return new JAXBElement<GetLogCountResponse>(_GetLogCountResponse_QNAME, GetLogCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchLogsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/lognotif", name = "searchLogsResponse")
    public JAXBElement<SearchLogsResponse> createSearchLogsResponse(SearchLogsResponse value) {
        return new JAXBElement<SearchLogsResponse>(_SearchLogsResponse_QNAME, SearchLogsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteNotificationPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/lognotif", name = "deleteNotificationPolicy")
    public JAXBElement<DeleteNotificationPolicy> createDeleteNotificationPolicy(DeleteNotificationPolicy value) {
        return new JAXBElement<DeleteNotificationPolicy>(_DeleteNotificationPolicy_QNAME, DeleteNotificationPolicy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLogLevel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/lognotif", name = "getLogLevel")
    public JAXBElement<GetLogLevel> createGetLogLevel(GetLogLevel value) {
        return new JAXBElement<GetLogLevel>(_GetLogLevel_QNAME, GetLogLevel.class, null, value);
    }

}
