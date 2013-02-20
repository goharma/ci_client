package com.koydooley.castiron.security;

import java.io.IOException;
import java.net.URL;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import com.approuter.schemas._2008._1.security.SecurityManager;
import com.approuter.schemas._2008._1.security.SecurityManager_Service;

public interface SecurityHelper {

	public String getSessionID(String host, String username, String password);

	void setSessionID(String sESSION_ID);
	
	public void logout();
}
