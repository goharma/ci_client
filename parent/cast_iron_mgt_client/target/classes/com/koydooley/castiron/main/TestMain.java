package com.koydooley.castiron.main;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import com.approuter.*;
import com.approuter.schema.router._1000.security._03.ObjectFactory;
import com.approuter.schema.router._1000.security._03.User;
import com.approuter.schemas._2008._1.security.SecurityManager_Service;
import com.approuter.schemas._2008._1.security.SecurityManager;
import com.koydooley.castiron.security.SecurityHelper;
import com.koydooley.castiron.security.SecurityHelperImpl;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final String TEST_URL = "https://new-host-5/ws/security?wsdl";
		String username = "admin";
		String password = "!n0r1t5@C";
		
		//SecurityHelper security =  new SecurityHelperImpl();
		
		//security.login(TEST_URL, username, password);
	}

}
