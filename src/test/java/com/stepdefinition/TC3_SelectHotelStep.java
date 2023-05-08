package com.stepdefinition;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.manager.PageObjectManager;
import com.pages.SelectHotelPage;

import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class TC3_SelectHotelStep extends BaseClass{
	PageObjectManager pom=new PageObjectManager();
    /**
     * @see User should perform Select Hotel by selecting the Hotel
     */
	@Then("User should perform Select Hotel by selecting the Hotel")
	public void userShouldPerformSelectHotelBySelectingTheHotel() {
		pom.getSelectHotelPage().selectHotel();
	   
	}
	/**
	 * @see User should perform Select Hotel without selecting the Hotel
	 */
	@Then("User should perform Select Hotel without selecting the Hotel")
	public void userShouldPerformSelectHotelWithoutSelectingTheHotel() {
	    pom.getSelectHotelPage().selectHotelWithoutHotel();
	}
	/**
	 * @see User should verify after Select Hotel error message 
	 * @param expErrorMsg
	 */
	@Then("User should verify after Select Hotel error message {string}")
	public void userShouldVerifyAfterSelectHotelErrorMessage(String expSelectHotelErrorMsg) {
		WebElement element = pom.getSelectHotelPage().getTxtSelectErrorMsg();
		String actSelectHotelErrorMsg= gettext(element);
	boolean b = actSelectHotelErrorMsg.contains(expSelectHotelErrorMsg);
	Assert.assertTrue("Verify after select hotel Error Message", b);
	}






}
