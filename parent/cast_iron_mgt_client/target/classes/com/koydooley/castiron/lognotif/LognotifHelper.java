package com.koydooley.castiron.lognotif;

import java.net.URL;

import com.approuter.schemas._2008._1.lognotif.SearchLogs;
import com.approuter.schemas._2008._1.lognotif.SearchLogsResponse;

public interface LognotifHelper {
	
	public SearchLogs getUnrestrictedSeachLogs();
	
	public SearchLogsResponse searchLogs(String wsdlLocation, String SessionID,
			SearchLogs request) ;
}
