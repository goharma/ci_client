package com.koydooley.castiron.security;

import java.io.IOException;
import java.net.URL;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.approuter.schemas._2008._1.security.SecurityManager;
import com.approuter.schemas._2008._1.security.SecurityManager_Service;



@Service
public class SecurityHelperImpl implements SecurityHelper {
	String SESSION_ID = null;
	final String SECURITY_URL = "/ws/security?wsdl";
	final String PROTO = "https://";
	String TEST_URL = null;	
	String HOST = null;
	String username = "admin";
	String password = "!n0r1t5@C";
	
	@Autowired
	public SecurityHelperImpl(String host, String user, String password){
		TEST_URL = PROTO + HOST + SECURITY_URL;
		this.username = user;
		this.password = password;
		TEST_URL = PROTO + host + SECURITY_URL;
	}
	
	public String getSESSION_ID() {
		return SESSION_ID;
	}
		
	public void setSESSION_ID(String sESSION_ID) {
		SESSION_ID = sESSION_ID;
	}


	public String login(String url, String username, String password) {
		SecurityManager_Service service = null;
		URL host_url = null;
		
		try {
			host_url = new URL(url);

			HttpsURLConnection httpsCon = (HttpsURLConnection) host_url
					.openConnection();
			httpsCon.setHostnameVerifier(new HostnameVerifier() {
				public boolean verify(String hostname, SSLSession session) {
					return true;
				}
			});
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		service = new SecurityManager_Service(host_url);

		SecurityManager sm = null;

		sm = service.getSecurityManagerPort();

		SESSION_ID = sm.login(username, password);
		
		return SESSION_ID;
	}

}
