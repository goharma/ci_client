package com.koydooley.castiron.orcmon;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.approuter.schemas._2004._1.orcmon.OrcMonJob;
import com.approuter.schemas._2004._1.orcmon.OrcMonJobStatus;
import com.approuter.schemas._2004._1.orcmon.OrcMonKeyForKeys;
import com.approuter.schemas._2008._1.orcmon.GetJobDetails;
import com.approuter.schemas._2008._1.orcmon.GetJobDetailsResponse;
import com.approuter.schemas._2008._1.orcmon.SearchJobs;
import com.approuter.schemas._2008._1.orcmon.SearchJobsResponse;
import com.koydooley.castiron.security.SecurityHelper;

public class OrcMonHelperTest {
	// String host = "kci-dev-m.pbs.gsa.gov";
	String host = "new-host-5";
	String username = "admin";
	String password = "!n0r1t5@C";
	GenericXmlApplicationContext ctx;
	OrcMonHelper orcMon;
	String sessionId;

	@Before
	public void setup() {
		ctx = new GenericXmlApplicationContext();
		ctx.load("META-INF/spring/app-context.xml");
		ctx.refresh();
		orcMon = (OrcMonHelper) ctx.getBean("orcMonBean");
		//orcMon.init(host);

		sessionId = orcMon.getSecurity().getSessionID(host, username,
				password);
		System.out.println("SESSIONID: " + sessionId);

	}

	@Test
	public void searchJobsTest() {
//		ArrayList<String> matchJobsIds = new ArrayList<String>(); // The list of JobIds that have key_name=key_value
//		SearchJobs searchJobsRequest = orcMon.buildDefaultSearchRequest(
//				"WSTest", "Orchestration");
//
//		SearchJobsResponse response = orcMon.searchJobs(searchJobsRequest,
//				sessionId);
//
//		List<OrcMonJob> jobs = response.getJobs();
//
//		// ForEACH JOB
//		for (Iterator iterator = jobs.iterator(); iterator.hasNext();) {
//			OrcMonJob orcMonJob = (OrcMonJob) iterator.next();
//
//			List <OrcMonKeyForKeys> keys = (List) orcMonJob.getKey();
//			
//			// FOR EACH KEY			
//			for (Iterator keysIter = keys.iterator(); keysIter.hasNext();) {
//				OrcMonKeyForKeys key = (OrcMonKeyForKeys) keysIter
//						.next();
//				if("key1".equals(key.getName())) // passin the keyname
//						if("A3140F8202937F2C948D0184348D3BCA".equals(key.getValue())){
//							matchJobsIds.add(orcMonJob.getId());
//						}
//			}
//		}
//		
//		System.out.println("JOB ID: " + matchJobsIds.get(0));
//		//orcMon.getSecurity().logout();
	}

	@Test
	public void searchKeysTest(){
		String keyName = "key1";
		String keyValue = "test1";
		String projectName = "WSTest";
		String orcName = "Orchestration";
		
		orcMon.sessionId = sessionId;
		ArrayList<String> matchJobsIds = orcMon.searchKeys(keyName, keyValue, projectName, orcName);
		
		for (Iterator iterator = matchJobsIds.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			
			System.out.println("JOB ID: " + string);
		}
	}
	
	@Test
	public void getJobDetailsTest() {
//		GetJobDetails request = new GetJobDetails();
//		
//		GetJobDetailsResponse detailResponse = orcMon.getJobDetails(request, sessionId);
//		
//		detailResponse.getEvents();
	}

}
