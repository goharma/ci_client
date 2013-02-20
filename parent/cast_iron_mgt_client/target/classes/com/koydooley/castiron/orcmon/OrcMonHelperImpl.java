package com.koydooley.castiron.orcmon;

import javax.annotation.Resource;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Service;

import com.approuter.schemas._2004._1.orcmon.OrcMonJobStatus;
import com.approuter.schemas._2008._1.orcmon.Exception_Exception;
import com.approuter.schemas._2008._1.orcmon.GetJobDetails;
import com.approuter.schemas._2008._1.orcmon.GetJobDetailsResponse;
import com.approuter.schemas._2008._1.orcmon.OrcMonManager;
import com.approuter.schemas._2008._1.orcmon.OrcMonManager_Service;
import com.approuter.schemas._2008._1.orcmon.SearchJobs;
import com.approuter.schemas._2008._1.orcmon.SearchJobsResponse;
import com.koydooley.castiron.security.SecurityHelper;
import com.koydooley.castiron.security.SecurityHelperImpl;

@Service
public class OrcMonHelperImpl implements OrcMonHelper {
	OrcMonManager_Service service = null;
	OrcMonManager port = null;

	private void init(){
		service = new OrcMonManager_Service();
		service.getOrcMonManagerPort();
	}
	
	private void login(){
		//security.login(url, username, password)
	}
	
	public void buildSearchJobRequest(String projectName, String version,
			String configName, String orchName, String jobId, String jobKey,
			XMLGregorianCalendar minStartDate,
			XMLGregorianCalendar maxStartDate, OrcMonJobStatus status,
			int page, int pageSize) {
	}
	
	public SearchJobsResponse searchJobs(SearchJobs searchJobsRequest, String sessionId) {
		
		
		OrcMonManager_Service service = new OrcMonManager_Service();
		OrcMonManager port = service.getOrcMonManagerPort();
		
		return port.searchJobs(searchJobsRequest, sessionId);		
	}

	public GetJobDetailsResponse getJobDetails(GetJobDetails getJobDetailsRequest, String sessionId) {
		OrcMonManager_Service service = new OrcMonManager_Service();
		OrcMonManager port = service.getOrcMonManagerPort();
		
		try {
			return port.getJobDetails(getJobDetailsRequest, sessionId);
		} catch (Exception_Exception e) {
			return null;
		}
	}

	public GetJobDetailsResponse getJobDetails(String jobId, String sessionId) {
		GetJobDetails jobDetails = new GetJobDetails();
		jobDetails.setJobId(jobId);
		
		
		return getJobDetails(jobDetails, sessionId);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}



}
