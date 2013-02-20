package com.koydooley.castiron.orcmon;

import javax.xml.datatype.XMLGregorianCalendar;

import com.approuter.schemas._2004._1.orcmon.OrcMonJobStatus;
import com.approuter.schemas._2008._1.orcmon.GetJobDetails;
import com.approuter.schemas._2008._1.orcmon.GetJobDetailsResponse;
import com.approuter.schemas._2008._1.orcmon.SearchJobs;
import com.approuter.schemas._2008._1.orcmon.SearchJobsResponse;

public interface OrcMonHelper {
	public void buildSearchJobRequest(String projectName, String version, String configName, String orchName, String jobId, String jobKey, XMLGregorianCalendar minStartDate, XMLGregorianCalendar maxStartDate, OrcMonJobStatus status,int page, int pageSize);
	public SearchJobsResponse searchJobs(SearchJobs searchJobsRequest, String sessionId);
	
	public GetJobDetailsResponse getJobDetails(String jobId, String sessionId);
	public GetJobDetailsResponse getJobDetails(GetJobDetails getJobDetailsRequest, String sessionId);
}
