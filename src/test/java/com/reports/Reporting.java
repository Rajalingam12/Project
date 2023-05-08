package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;



import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

/**
 * 
 * @author PC
 * @see used to generate reports 
 *
 */
public class Reporting {
	
	
		public static void generatejvmreport(String jsonfile) {
			File file=new File("C:\\Users\\PC\\eclipse-workspace\\OMRBranchAutomation\\target");
			
			Configuration configuration=new Configuration(file, "Adactin Automation");
			
			configuration.addClassifications("Browser","Chrome");
			configuration.addClassifications("Version","108");
			configuration.addClassifications("OS","WIN11");
			configuration.addClassifications("Sprint","34");
			
			List<String> json=new ArrayList<String>();
			json.add(jsonfile);
			ReportBuilder builder=new ReportBuilder(json, configuration);
			
			builder.generateReports();
			

		}

	}



