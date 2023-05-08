package com.stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
/**
 * 
 * @author PC
 * @see the class used to execute the failed testcases
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "@target/failed.text",glue="com.stepdefinition")
public class FailedTestRunner {
	

}
