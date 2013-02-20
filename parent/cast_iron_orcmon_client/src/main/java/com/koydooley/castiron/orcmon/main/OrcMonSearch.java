package com.koydooley.castiron.orcmon.main;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.koydooley.castiron.orcmon.OrcMonHelper;

public class OrcMonSearch {
	OrcMonHelper orcMon;
	GenericXmlApplicationContext ctx;
	String sessionId;
	Options options;
	
	public void printhelp(Options options){
		HelpFormatter formatter = new HelpFormatter();
		formatter.printHelp("OrcMonSearch", options);
		
	}
	
	public void init(String host, String username, String password){
			ctx = new GenericXmlApplicationContext();
			ctx.load("META-INF/spring/orcmon-context.xml");
			ctx.refresh();
			orcMon = (OrcMonHelper) ctx.getBean("orcMonBean");
			orcMon.init(host, username, password);

			sessionId = orcMon.getSecurity().getSessionID(host, username,
					password);
			
			System.out.println("SESSIONID: " + sessionId);
				
	}
	
	public Options buildOpts(){
		// create Options object
		//Options options = new Options();

		// add t option
		options.addOption("h", true, "hostname");
		options.addOption("u", true, "username");
		options.addOption("p", true, "password");
		options.addOption("r", true, "P(r)oject");
		options.addOption("o", true, "Orchestration");
		options.addOption("k", true, "key");
		options.addOption("v", true, "value");
		
		return options;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CommandLineParser parser = new PosixParser();
		OrcMonSearch search = new OrcMonSearch();
		
		try {
			CommandLine cmd = parser.parse( search.buildOpts(), args);
			
			String host = cmd.getOptionValue("h");
			String username = cmd.getOptionValue("u");
			String password = cmd.getOptionValue("p");
			String projectName = cmd.getOptionValue("r");
			String orcName = cmd.getOptionValue("o");
			String keyName = cmd.getOptionValue("k");
			String keyValue = cmd.getOptionValue("v");
			
			// System.out.println(host + username + password);
			
			
			
			search.init(host, username, password);
			ArrayList <String>matchedJobIds = search.orcMon.searchKeys(keyName, keyValue, projectName, orcName);
			
			for (Iterator iterator = matchedJobIds.iterator(); iterator
					.hasNext();) {
				String jobID = (String) iterator.next();
				
				System.out.println("JOBID: " + jobID);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
