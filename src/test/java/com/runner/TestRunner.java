package com.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;
import com.reports.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

/**
 * 
 * @author PC
 * @see The class used for execution purpose
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,features ="src/test/resources",glue = "com.stepdefinition",dryRun = false, snippets = SnippetType.CAMELCASE,plugin = {"pretty","rerun:target/failed.text","json:target\\Automation.json"})
public class TestRunner extends BaseClass {
	@AfterClass
	public static void afterclass () throws FileNotFoundException, IOException {
		Reporting.generatejvmreport(getProjectPath()+getPropertyvalue("json"));

	}
	

}