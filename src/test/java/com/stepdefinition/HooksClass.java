package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

/**
 * 
 * @author PC
 * @see Used to maintain the pre and post conditions for the program
 *
 */
public class HooksClass extends BaseClass {
	/**
	 * @see this method have the precondition steps
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {
		getDriver(getPropertyvalue("browser"));
		webAppln(getPropertyvalue("url"));
		maximizewindow();

	}
	/**
	 * @see this method have the postcondition steps
	 * @param scenario
	 */
    @After
	public void afterScenario(Scenario scenario) {
    	scenario.attach(screenshotbyte(), "image/png", "Every Scenario");
        quit();
	}
}
