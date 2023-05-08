package com.stepdefinition;

import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.manager.PageObjectManager;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class TC2_SearchHotelStep extends BaseClass {
	PageObjectManager pom=new PageObjectManager();
	/**
	 * @see User should perform search hotel by selecting all fields
	 * @param location
	 * @param hotels
	 * @param roomtype
	 * @param noofrooms
	 * @param checkin
	 * @param checkout
	 * @param adult
	 * @param child
	 */
	@Then("User should perform search hotel by selecting all fields {string},{string},{string},{string},{string},{string}, {string} and {string}")
	public void userShouldPerformSearchHotelBySelectingAllFieldsAnd(String location, String hotels, String roomtype, String noofrooms, String checkin, String checkout, String adult, String child) {
		pom.getSearchHotelPage().searchHotel(location, hotels, roomtype, noofrooms, checkin, checkout,adult,child);
	}
	/**
	 * @see User should perform search hotel by entering only mandatory fields
	 * @param location
	 * @param noofrooms
	 * @param checkin
	 * @param checkout
	 * @param adults
	 */
	@Then("User should perform search hotel by entering only mandatory fields {string},{string},{string},{string} and {string}")
	public void userShouldPerformSearchHotelByEnteringOnlyMandatoryFieldsAnd(String location, String noofrooms, String checkin, String checkout, String adults) {
	  pom.getSearchHotelPage().searchHotel(location, noofrooms, checkin, checkout, adults);
	}
	/**
	 * @see User should verify after search hotel error message in date field
	 * @param expcheckin
	 * @param expcheckout
	 */
	@Then("User should verify after search hotel error message in date field {string},{string}")
	public void userShouldVerifyAfterSearchHotelErrorMessageInDateField(String expCheckIn, String expCheckOut) {
	   WebElement elementin = pom.getSearchHotelPage().getCheckInDateErrorMsg();
	   String actualcheckin = elementin.getText();
	   boolean b = actualcheckin.contains(expCheckIn);
	   Assert.assertTrue("verify after checkin date error", b);
	   WebElement elementout = pom.getSearchHotelPage().getCheckOutDateErrorMsg();
	   String actcheckout = elementout.getText();
	   boolean a = actcheckout.contains(expCheckOut);
	   Assert.assertTrue("verify after checkout date error", a);
	   
	   
	}
	/**
	 * @see User should perform search hotel without entering value in any fields
	 */
	@Then("User should perform search hotel without entering value in any fields")
	public void userShouldPerformSearchHotelWithoutEnteringValueInAnyFields() {
	   pom.getSearchHotelPage().searchHotel();
	}
	/**
	 * @see User should verify after search hotel error message
	 * @param experrormsg
	 */
	@Then("User should verify after search hotel error message {string}")
	public void userShouldVerifyAfterSearchHotelErrorMessage(String expSearchHotelSuccessMsg) {
		WebElement element = pom.getSearchHotelPage().getTxtLocationErrorMsg();
		String actSearchHotelSuccessMsg = element.getText();
		boolean b = actSearchHotelSuccessMsg.contains(expSearchHotelSuccessMsg);
		Assert.assertTrue("verify after location error msg", b);
		
	   
	}
}
