package com.koydooley.castiron.security;

import java.io.IOException;
import java.net.URL;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import com.approuter.schemas._2008._1.security.SecurityManager;
import com.approuter.schemas._2008._1.security.SecurityManager_Service;

public interface SecurityHelper {
	String login(String url, String username, String password);

	String getSESSION_ID();

	void setSESSION_ID(String sESSION_ID);
}
