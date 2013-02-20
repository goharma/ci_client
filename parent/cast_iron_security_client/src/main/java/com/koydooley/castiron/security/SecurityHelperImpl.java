package com.koydooley.castiron.security;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.approuter.schemas._2008._1.security.SecurityManager;
import com.approuter.schemas._2008._1.security.SecurityManager_Service;

import javax.inject.Inject;
import javax.inject.Named;
/*
 * This is used to get a SessionID for operations.  
 */

@Named("securityBean")
public class SecurityHelperImpl implements SecurityHelper {
	static String sessionID = null;
	final String SECURITY_URL = "/ws/security?wsdl";
	final String PROTO = "https://";
	String TEST_URL = null;	
	String HOST = null;
	String username = null;
	String password = null;
	SecurityManager sm;
	
	public SecurityHelperImpl(){
	}
	
	public String getSessionID(String host, String username, String password) {
		if(this.sessionID == null)
			this.sessionID = login(host, username, password);
		
		return this.sessionID;
	}
		
	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}


	public String login(String url, String username, String password) {
		SecurityManager_Service service = null;
		URL host_url = null;
		
		try {
			host_url = new URL(PROTO + url + SECURITY_URL);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		service = new SecurityManager_Service(host_url);

		sm = null;

		sm = service.getSecurityManagerPort();

		sessionID = sm.login(username, password);
		
		return sessionID;
	}

	public void logout() {
		sm.logout(null, sessionID);		
	}

}
