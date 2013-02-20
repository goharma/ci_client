package com.koydooley.castiron;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.koydooley.castiron.orcmon.OrcMonHelper;
import com.koydooley.castiron.security.SecurityHelper;
import com.koydooley.castiron.security.SecurityHelperImpl;

public class SecurityHelperImplTest {

	@Test
	public void testLogin() {
		final String TEST_URL = "https://new-host-5/ws/security?wsdl";
		
		final String host = "new-host-5";
		String username = "admin";
		String password = "!n0r1t5@C";

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("META-INF/spring/app-context.xml");
		//ctx.load("META-INF/spring/app-context.xml");
		//ctx.refresh();
		
		SecurityHelper security = ctx.getBean("securityHelperImpl", SecurityHelper.class);
		OrcMonHelper orcMon = ctx.getBean("orcMonHelper", OrcMonHelper.class);
		
		security.login(TEST_URL, username, password);
		
		orcMon.getJobDetails("test", "test");
		
		assertNotNull(security.getSESSION_ID());
	}

}
