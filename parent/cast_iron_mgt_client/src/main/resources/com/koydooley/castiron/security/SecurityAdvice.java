package com.koydooley.castiron.security;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecurityAdvice implements MethodBeforeAdvice {
	SecurityHelper security = null;

	public SecurityHelper getSecurity() {
		return security;
	}

	@Autowired
	public void setSecurity(SecurityHelper security) {
		this.security = security;
	}

	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		// Check SESSION_ID
		// if none login		
		// security.login(url, username, password);
		System.out.println("BEFORE");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
