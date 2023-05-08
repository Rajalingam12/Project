package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC5_CancelBookingStep extends BaseClass {
	PageObjectManager pom=new PageObjectManager();
	/**
	 * @see User should perform Cancel Booking for that order id
	 * @throws InterruptedException
	 */
	@Then("User should perform Cancel Booking for that order id")
	public void userShouldPerformCancelBookingForThatOrderId() throws InterruptedException {
		String bookingConfirmation = pom.getBookingConfirmationPage().bookingConfirmation();
		System.out.println(bookingConfirmation);
		pom.getBookingCancellationPage().bookingCancel(bookingConfirmation);
		
	}
	/**
	 * @see User should perform Cancel Booking for existing order id
	 * @param orderid
	 */
	
    @Then("User should perform Cancel Booking for existing order id {string}")
	public void userShouldPerformCancelBookingForExistingOrderId(String orderid) {
    	pom.getBookingCancellationPage().bookingCancel(orderid); 
	}
	









}
