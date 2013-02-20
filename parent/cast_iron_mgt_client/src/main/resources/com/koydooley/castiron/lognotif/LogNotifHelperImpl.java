package com.koydooley.castiron.lognotif;

import java.io.IOException;
import java.net.URL;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import com.approuter.schemas._2008._1.lognotif.LogAndNotifManager;
import com.approuter.schemas._2008._1.lognotif.LogAndNotifManager_Service;
import com.approuter.schemas._2008._1.lognotif.LogStatus;
import com.approuter.schemas._2008._1.lognotif.ObjectFactory;
import com.approuter.schemas._2008._1.lognotif.SearchLogs;
import com.approuter.schemas._2008._1.lognotif.SearchLogsResponse;
import com.approuter.schemas._2008._1.lognotif.types.LogComponent;
import com.approuter.schemas._2008._1.lognotif.types.LogLevel;

public class LogNotifHelperImpl implements LognotifHelper {

	/*
	 * LogNotif only searches the System logs
	 * 
	 */
	public SearchLogs getUnrestrictedSeachLogs(){
		SearchLogs searchLogs = new SearchLogs();
		
		searchLogs.setLogComponent(LogComponent.ALL);
		searchLogs.setLogLevel(LogLevel.ALL);
		searchLogs.setMaxDaysOld(1);
		searchLogs.setPage(0);
		searchLogs.setPageSize(100);
		searchLogs.setStatus(LogStatus.ALL);
		
		return searchLogs;
	}
	
	public SearchLogsResponse searchLogs(String wsdlLocation, String SessionID,
			SearchLogs request) {
		SearchLogsResponse response = null;
		LogAndNotifManager_Service service = null;
		LogAndNotifManager manager = null;
		
		if (SessionID == null)
			return null;
		
		if(request == null)
			request = getUnrestrictedSeachLogs();
		
		URL host_url = null;
		
		try {
			host_url = new URL(wsdlLocation);

			HttpsURLConnection httpsCon = (HttpsURLConnection) host_url
					.openConnection();
			httpsCon.setHostnameVerifier(new HostnameVerifier() {
				public boolean verify(String hostname, SSLSession session) {
					return true;
				}
			});
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			ObjectFactory factory = new ObjectFactory();

			service = new LogAndNotifManager_Service(host_url);
			
			manager = service.getLogAndNotifManagerPort();
			
			response = manager.searchLogs(request, SessionID);
		

		return response;
	}

}
