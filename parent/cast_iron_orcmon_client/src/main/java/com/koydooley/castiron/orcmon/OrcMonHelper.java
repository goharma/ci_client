package com.koydooley.castiron.orcmon;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.inject.Named;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;

import com.approuter.schemas._2004._1.orcmon.OrcMonJob;
import com.approuter.schemas._2004._1.orcmon.OrcMonJobStatus;
import com.approuter.schemas._2004._1.orcmon.OrcMonKeyForKeys;
import com.approuter.schemas._2008._1.orcmon.Exception_Exception;
import com.approuter.schemas._2008._1.orcmon.GetJobDetails;
import com.approuter.schemas._2008._1.orcmon.GetJobDetailsResponse;
import com.approuter.schemas._2008._1.orcmon.OrcMonManager;
import com.approuter.schemas._2008._1.orcmon.OrcMonManager_Service;
import com.approuter.schemas._2008._1.orcmon.SearchJobs;
import com.approuter.schemas._2008._1.orcmon.SearchJobsResponse;
import com.koydooley.castiron.security.SecurityHelper;

@Named("orcMonBean")
public class OrcMonHelper {
	OrcMonManager_Service service = null;
	OrcMonManager port = null;
	SecurityHelper security;
	String sessionId;
		
	public SecurityHelper getSecurity() {
		return security;
	}
	
	@Autowired
	public void setSecurity(SecurityHelper security) {
		this.security = security;
	}

	public void init(String host, String username, String password){
		try {
			service = new OrcMonManager_Service(new URL("https://" + host + "/ws/orcmon?wsdl"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		port = service.getOrcMonManagerPort();
		
		sessionId = security.getSessionID(host, username, password);
	}
	
	public void buildSearchJobRequest(String projectName, String version,
			String configName, String orchName, String jobId, String jobKey,
			XMLGregorianCalendar minStartDate,
			XMLGregorianCalendar maxStartDate, OrcMonJobStatus status,
			int page, int pageSize) {
	}
	
	public SearchJobsResponse searchJobs(SearchJobs searchJobsRequest, String sessionId) {
		
		
		// OrcMonManager_Service service = new OrcMonManager_Service();
		// OrcMonManager port = service.getOrcMonManagerPort();
		
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
	 * Sets Version and Config to 1 and default
	 * @param projectName
	 * @param orcName
	 * @param limit
	 * @return
	 */
	public SearchJobs buildDefaultSearchRequest(String projectName, String orcName, int limit){
		SearchJobs searchJobsRequest = new SearchJobs();
		searchJobsRequest.setProjectName(projectName);
		searchJobsRequest.setVersion("1.0");
		searchJobsRequest.setConfigName("Default");
		searchJobsRequest.setStatus(OrcMonJobStatus.ALL);
		searchJobsRequest.setPageSize(limit);
		searchJobsRequest.setOrchName(orcName);
		
		return searchJobsRequest;
	}
	
	public void logout(){
		security.logout();
	}
	
	/**
	 * 
	 * @param keyName
	 * @param keyValue
	 * @param projectName
	 * @param orcName
	 * @return
	 */
	public ArrayList searchKeys(String keyName, String keyValue, String projectName, String orcName){
		ArrayList matchJobsIds = new ArrayList(); // The list of JobIds that have key_name=key_value
		SearchJobs searchJobsRequest = buildDefaultSearchRequest(
				projectName, orcName, 1000);

		SearchJobsResponse response = searchJobs(searchJobsRequest,
				sessionId);

		List<OrcMonJob> jobs = response.getJobs();

		// ForEACH JOB
		for (Iterator iterator = jobs.iterator(); iterator.hasNext();) {
			OrcMonJob orcMonJob = (OrcMonJob) iterator.next();

			List <OrcMonKeyForKeys> keys = (List) orcMonJob.getKey();
			
			// FOR EACH KEY			
			for (Iterator keysIter = keys.iterator(); keysIter.hasNext();) {
				OrcMonKeyForKeys key = (OrcMonKeyForKeys) keysIter
						.next();
				if(keyName.equals(key.getName())) // passin the keyname
						if(keyValue.equals(key.getValue())){
							matchJobsIds.add(orcMonJob.getId());
						}
			}
		}
		
		return matchJobsIds;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
