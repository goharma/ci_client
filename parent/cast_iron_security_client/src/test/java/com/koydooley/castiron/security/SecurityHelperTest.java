package com.koydooley.castiron.security;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SecurityHelperTest {

	@Test
	public void testGetSessionID() {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("META-INF/spring/security-context.xml");
		ctx.refresh();

		String host = "kci-dev-m.pbs.gsa.gov";
		String username = "prahtdooley";
		String password = "NeverW0rks!";
		
		SecurityHelper security = (SecurityHelper) ctx.getBean("securityBean");
		
		String sessionID = security.getSessionID(host, username, password);
		assertNotNull(sessionID);
	}
}
