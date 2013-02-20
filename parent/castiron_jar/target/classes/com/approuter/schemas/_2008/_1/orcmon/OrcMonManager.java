
package com.approuter.schemas._2008._1.orcmon;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "OrcMonManager", targetNamespace = "http://www.approuter.com/schemas/2008/1/orcmon")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.approuter.schema.router._1000.logging.ObjectFactory.class,
    com.approuter.schemas._2004._1.orcmon.ObjectFactory.class,
    com.approuter.schemas._2005._1.monitoringprops.ObjectFactory.class,
    com.approuter.schemas._2008._1.orcmon.ObjectFactory.class,
    com.approuter.schemas._2008._1.lognotif.types.ObjectFactory.class
})
public interface OrcMonManager {


    /**
     * 
     * @param sessionId
     * @param parameters
     * @return
     *     returns com.approuter.schemas._2008._1.orcmon.GetMonitoringPropertiesResponse
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(name = "getMonitoringPropertiesResponse", targetNamespace = "http://www.approuter.com/schemas/2008/1/orcmon", partName = "result")
    public GetMonitoringPropertiesResponse getMonitoringProperties(
        @WebParam(name = "getMonitoringProperties", targetNamespace = "http://www.approuter.com/schemas/2008/1/orcmon", partName = "parameters")
        GetMonitoringProperties parameters,
        @WebParam(name = "sessionId", targetNamespace = "http://www.approuter.com/schemas/2008/1/orcmon", header = true, partName = "sessionId")
        String sessionId)
        throws Exception_Exception
    ;

    /**
     * 
     * @param sessionId
     * @param parameters
     * @return
     *     returns com.approuter.schemas._2008._1.orcmon.SetMonitoringPropertiesResponse
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(name = "setMonitoringPropertiesResponse", targetNamespace = "http://www.approuter.com/schemas/2008/1/orcmon", partName = "result")
    public SetMonitoringPropertiesResponse setMonitoringProperties(
        @WebParam(name = "setMonitoringProperties", targetNamespace = "http://www.approuter.com/schemas/2008/1/orcmon", partName = "parameters")
        SetMonitoringProperties parameters,
        @WebParam(name = "sessionId", targetNamespace = "http://www.approuter.com/schemas/2008/1/orcmon", header = true, partName = "sessionId")
        String sessionId)
        throws Exception_Exception
    ;

    /**
     * 
     * @param sessionId
     * @param parameters
     * @return
     *     returns com.approuter.schemas._2008._1.orcmon.GetJobCountResponse
     */
    @WebMethod
    @WebResult(name = "getJobCountResponse", targetNamespace = "http://www.approuter.com/schemas/2008/1/orcmon", partName = "result")
    public GetJobCountResponse getJobCount(
        @WebParam(name = "getJobCount", targetNamespace = "http://www.approuter.com/schemas/2008/1/orcmon", partName = "parameters")
        GetJobCount parameters,
        @WebParam(name = "sessionId", targetNamespace = "http://www.approuter.com/schemas/2008/1/orcmon", header = true, partName = "sessionId")
        String sessionId);

    /**
     * 
     * @param sessionId
     * @param parameters
     * @return
     *     returns com.approuter.schemas._2008._1.orcmon.SearchJobsResponse
     */
    @WebMethod
    @WebResult(name = "searchJobsResponse", targetNamespace = "http://www.approuter.com/schemas/2008/1/orcmon", partName = "result")
    public SearchJobsResponse searchJobs(
        @WebParam(name = "searchJobs", targetNamespace = "http://www.approuter.com/schemas/2008/1/orcmon", partName = "parameters")
        SearchJobs parameters,
        @WebParam(name = "sessionId", targetNamespace = "http://www.approuter.com/schemas/2008/1/orcmon", header = true, partName = "sessionId")
        String sessionId);

    /**
     * 
     * @param sessionId
     * @param parameters
     * @return
     *     returns com.approuter.schemas._2008._1.orcmon.PurgeJobsResponse
     */
    @WebMethod
    @WebResult(name = "purgeJobsResponse", targetNamespace = "http://www.approuter.com/schemas/2008/1/orcmon", partName = "result")
    public PurgeJobsResponse purgeJobs(
        @WebParam(name = "purgeJobs", targetNamespace = "http://www.approuter.com/schemas/2008/1/orcmon", partName = "parameters")
        PurgeJobs parameters,
        @WebParam(name = "sessionId", targetNamespace = "http://www.approuter.com/schemas/2008/1/orcmon", header = true, partName = "sessionId")
        String sessionId);

    /**
     * 
     * @param sessionId
     * @param parameters
     * @return
     *     returns com.approuter.schemas._2008._1.orcmon.GetJobDetailsResponse
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(name = "getJobDetailsResponse", targetNamespace = "http://www.approuter.com/schemas/2008/1/orcmon", partName = "result")
    public GetJobDetailsResponse getJobDetails(
        @WebParam(name = "getJobDetails", targetNamespace = "http://www.approuter.com/schemas/2008/1/orcmon", partName = "parameters")
        GetJobDetails parameters,
        @WebParam(name = "sessionId", targetNamespace = "http://www.approuter.com/schemas/2008/1/orcmon", header = true, partName = "sessionId")
        String sessionId)
        throws Exception_Exception
    ;

}