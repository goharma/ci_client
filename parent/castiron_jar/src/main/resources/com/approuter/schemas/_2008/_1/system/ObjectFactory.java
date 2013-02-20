
package com.approuter.schemas._2008._1.system;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.approuter.schemas._2008._1.system package. 
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

    private final static QName _GetApplianceNameResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/system", "getApplianceNameResponse");
    private final static QName _GetApplianceName_QNAME = new QName("http://www.approuter.com/schemas/2008/1/system", "getApplianceName");
    private final static QName _SetApplianceNameResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/system", "setApplianceNameResponse");
    private final static QName _ExecuteCommand_QNAME = new QName("http://www.approuter.com/schemas/2008/1/system", "executeCommand");
    private final static QName _GetSystemInfo_QNAME = new QName("http://www.approuter.com/schemas/2008/1/system", "getSystemInfo");
    private final static QName _SessionId_QNAME = new QName("http://www.approuter.com/schemas/2008/1/system", "sessionId");
    private final static QName _SetNetworkConfiguration_QNAME = new QName("http://www.approuter.com/schemas/2008/1/system", "setNetworkConfiguration");
    private final static QName _ExecuteCommandResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/system", "executeCommandResponse");
    private final static QName _GetNetworkConfiguration_QNAME = new QName("http://www.approuter.com/schemas/2008/1/system", "getNetworkConfiguration");
    private final static QName _DownloadPostmortem_QNAME = new QName("http://www.approuter.com/schemas/2008/1/system", "downloadPostmortem");
    private final static QName _GetNetworkConfigurationResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/system", "getNetworkConfigurationResponse");
    private final static QName _SetApplianceName_QNAME = new QName("http://www.approuter.com/schemas/2008/1/system", "setApplianceName");
    private final static QName _Exception_QNAME = new QName("http://www.approuter.com/schemas/2008/1/system", "Exception");
    private final static QName _SetNetworkConfigurationResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/system", "setNetworkConfigurationResponse");
    private final static QName _DownloadPostmortemResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/system", "downloadPostmortemResponse");
    private final static QName _GetSystemInfoResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/system", "getSystemInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.approuter.schemas._2008._1.system
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetNetworkConfigurationResponse }
     * 
     */
    public SetNetworkConfigurationResponse createSetNetworkConfigurationResponse() {
        return new SetNetworkConfigurationResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link GetSystemInfoResponse }
     * 
     */
    public GetSystemInfoResponse createGetSystemInfoResponse() {
        return new GetSystemInfoResponse();
    }

    /**
     * Create an instance of {@link DownloadPostmortemResponse }
     * 
     */
    public DownloadPostmortemResponse createDownloadPostmortemResponse() {
        return new DownloadPostmortemResponse();
    }

    /**
     * Create an instance of {@link SetApplianceName }
     * 
     */
    public SetApplianceName createSetApplianceName() {
        return new SetApplianceName();
    }

    /**
     * Create an instance of {@link GetNetworkConfigurationResponse }
     * 
     */
    public GetNetworkConfigurationResponse createGetNetworkConfigurationResponse() {
        return new GetNetworkConfigurationResponse();
    }

    /**
     * Create an instance of {@link GetNetworkConfiguration }
     * 
     */
    public GetNetworkConfiguration createGetNetworkConfiguration() {
        return new GetNetworkConfiguration();
    }

    /**
     * Create an instance of {@link DownloadPostmortem }
     * 
     */
    public DownloadPostmortem createDownloadPostmortem() {
        return new DownloadPostmortem();
    }

    /**
     * Create an instance of {@link SetNetworkConfiguration }
     * 
     */
    public SetNetworkConfiguration createSetNetworkConfiguration() {
        return new SetNetworkConfiguration();
    }

    /**
     * Create an instance of {@link ExecuteCommandResponse }
     * 
     */
    public ExecuteCommandResponse createExecuteCommandResponse() {
        return new ExecuteCommandResponse();
    }

    /**
     * Create an instance of {@link GetSystemInfo }
     * 
     */
    public GetSystemInfo createGetSystemInfo() {
        return new GetSystemInfo();
    }

    /**
     * Create an instance of {@link SetApplianceNameResponse }
     * 
     */
    public SetApplianceNameResponse createSetApplianceNameResponse() {
        return new SetApplianceNameResponse();
    }

    /**
     * Create an instance of {@link GetApplianceName }
     * 
     */
    public GetApplianceName createGetApplianceName() {
        return new GetApplianceName();
    }

    /**
     * Create an instance of {@link GetApplianceNameResponse }
     * 
     */
    public GetApplianceNameResponse createGetApplianceNameResponse() {
        return new GetApplianceNameResponse();
    }

    /**
     * Create an instance of {@link ExecuteCommand }
     * 
     */
    public ExecuteCommand createExecuteCommand() {
        return new ExecuteCommand();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplianceNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/system", name = "getApplianceNameResponse")
    public JAXBElement<GetApplianceNameResponse> createGetApplianceNameResponse(GetApplianceNameResponse value) {
        return new JAXBElement<GetApplianceNameResponse>(_GetApplianceNameResponse_QNAME, GetApplianceNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplianceName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/system", name = "getApplianceName")
    public JAXBElement<GetApplianceName> createGetApplianceName(GetApplianceName value) {
        return new JAXBElement<GetApplianceName>(_GetApplianceName_QNAME, GetApplianceName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetApplianceNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/system", name = "setApplianceNameResponse")
    public JAXBElement<SetApplianceNameResponse> createSetApplianceNameResponse(SetApplianceNameResponse value) {
        return new JAXBElement<SetApplianceNameResponse>(_SetApplianceNameResponse_QNAME, SetApplianceNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteCommand }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/system", name = "executeCommand")
    public JAXBElement<ExecuteCommand> createExecuteCommand(ExecuteCommand value) {
        return new JAXBElement<ExecuteCommand>(_ExecuteCommand_QNAME, ExecuteCommand.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSystemInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/system", name = "getSystemInfo")
    public JAXBElement<GetSystemInfo> createGetSystemInfo(GetSystemInfo value) {
        return new JAXBElement<GetSystemInfo>(_GetSystemInfo_QNAME, GetSystemInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/system", name = "sessionId")
    public JAXBElement<String> createSessionId(String value) {
        return new JAXBElement<String>(_SessionId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNetworkConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/system", name = "setNetworkConfiguration")
    public JAXBElement<SetNetworkConfiguration> createSetNetworkConfiguration(SetNetworkConfiguration value) {
        return new JAXBElement<SetNetworkConfiguration>(_SetNetworkConfiguration_QNAME, SetNetworkConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteCommandResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/system", name = "executeCommandResponse")
    public JAXBElement<ExecuteCommandResponse> createExecuteCommandResponse(ExecuteCommandResponse value) {
        return new JAXBElement<ExecuteCommandResponse>(_ExecuteCommandResponse_QNAME, ExecuteCommandResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNetworkConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/system", name = "getNetworkConfiguration")
    public JAXBElement<GetNetworkConfiguration> createGetNetworkConfiguration(GetNetworkConfiguration value) {
        return new JAXBElement<GetNetworkConfiguration>(_GetNetworkConfiguration_QNAME, GetNetworkConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadPostmortem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/system", name = "downloadPostmortem")
    public JAXBElement<DownloadPostmortem> createDownloadPostmortem(DownloadPostmortem value) {
        return new JAXBElement<DownloadPostmortem>(_DownloadPostmortem_QNAME, DownloadPostmortem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNetworkConfigurationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/system", name = "getNetworkConfigurationResponse")
    public JAXBElement<GetNetworkConfigurationResponse> createGetNetworkConfigurationResponse(GetNetworkConfigurationResponse value) {
        return new JAXBElement<GetNetworkConfigurationResponse>(_GetNetworkConfigurationResponse_QNAME, GetNetworkConfigurationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetApplianceName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/system", name = "setApplianceName")
    public JAXBElement<SetApplianceName> createSetApplianceName(SetApplianceName value) {
        return new JAXBElement<SetApplianceName>(_SetApplianceName_QNAME, SetApplianceName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/system", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNetworkConfigurationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/system", name = "setNetworkConfigurationResponse")
    public JAXBElement<SetNetworkConfigurationResponse> createSetNetworkConfigurationResponse(SetNetworkConfigurationResponse value) {
        return new JAXBElement<SetNetworkConfigurationResponse>(_SetNetworkConfigurationResponse_QNAME, SetNetworkConfigurationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadPostmortemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/system", name = "downloadPostmortemResponse")
    public JAXBElement<DownloadPostmortemResponse> createDownloadPostmortemResponse(DownloadPostmortemResponse value) {
        return new JAXBElement<DownloadPostmortemResponse>(_DownloadPostmortemResponse_QNAME, DownloadPostmortemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSystemInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/system", name = "getSystemInfoResponse")
    public JAXBElement<GetSystemInfoResponse> createGetSystemInfoResponse(GetSystemInfoResponse value) {
        return new JAXBElement<GetSystemInfoResponse>(_GetSystemInfoResponse_QNAME, GetSystemInfoResponse.class, null, value);
    }

}
