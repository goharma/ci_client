package com.koydooley.castiron;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.approuter.schemas._2008._1.lognotif.SearchLogs;
import com.approuter.schemas._2008._1.lognotif.SearchLogsResponse;
import com.approuter.schemas._2008._1.lognotif.types.Log;
import com.approuter.schemas._2008._1.lognotif.types.LogComponent;
import com.koydooley.castiron.lognotif.LogNotifHelperImpl;
import com.koydooley.castiron.security.SecurityHelper;
import com.koydooley.castiron.security.SecurityHelperImpl;

public class TestLogNotifHelperImpl {
	String sessionID = null;
	final String LOGNOTIF_URL = "https://new-host-5/ws/lognotif?wsdl";
	final String SECURITY_URL = "https://new-host-5/ws/security?wsdl";
	
	@Test
	public void testGetUnrestrictedSeachLogs() {
		LogNotifHelperImpl lognotif = new LogNotifHelperImpl();
		
		SearchLogs searchLogs = lognotif.getUnrestrictedSeachLogs();
		
		assertEquals(LogComponent.ALL,searchLogs.getLogComponent());
	}

	@Test
	public void testSearchLogs() {
		SearchLogsResponse response = null;
		
		String username = "admin";
		String password = "!n0r1t5@C";

//		SecurityHelper security = new SecurityHelperImpl();
//
//		sessionID = security.login(SECURITY_URL, username, password);
//		
//		LogNotifHelperImpl lognotif = new LogNotifHelperImpl();
//		
//		response = lognotif.searchLogs(LOGNOTIF_URL, sessionID, null);
//		
//		List<Log> logs = response.getLogs();
//		
//		System.out.println(logs.size());
//		
//		for (Log log : logs) {
//			System.out.println(log.getMessage());
//		}
		
		
		
		
	}

}
