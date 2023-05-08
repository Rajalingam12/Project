package com.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
/**
 * 
 * @author PC
 * @see Maintain the steps in login page
 *
 */
public class TC1_LoginStep extends BaseClass{
	PageObjectManager pom= new PageObjectManager();
	
	/**
	 * @see User is on Adactin page
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	@Given("User is on Adactin page")
	public void userIsOnAdactinPage() throws FileNotFoundException, IOException {
		
        	   
	}
	/**
	 * @see User should perform login 
	 * @param name
	 * @param password
	 */
	@When("User should perform login {string},{string}")
	public void userShouldPerformLogin(String name, String password) {
		pom.getLoginPage().login(name, password);
		
	  
	}
	/**
	 * @see User should perform login with Enter key
	 * @param name
	 * @param password
	 * @throws AWTException
	 */
	@When("User should perform login {string},{string} with Enter key")
	public void userShouldPerformLoginWithEnterKey(String name, String password) throws AWTException {
		pom.getLoginPage().loginwithenter(name, password);
	  
	}
	/**
	 * @see User should verify after login error message contains 
	 * @param expectedMessage
	 */
	@Then("User should verify after login error message contains {string}")
	public void userShouldVerifyAfterLoginErrorMessageContains(String expLoginErrorMsg) {
		WebElement element = pom.getLoginPage().getTxtInvalidMsg();
		String actLoginErrorMsg = gettext(element);
		boolean b = actLoginErrorMsg.contains(expLoginErrorMsg);
		Assert.assertTrue("Verify after login error message", b);
		
	   
	}








}
