package com.stepdefinition;

import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Then;
import junit.framework.Assert;

/**
 * 
 * @author PC
 * @see to maintain the common steps in the program
 *
 */
public class CommonSteps extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

	/**
	 * @see User should verify after login success message
	 * @param expSuccessMsg
	 */
	@Then("User should verify after login success message {string}")
	public void userShouldVerifyAfterLoginSuccessMessage(String expLoginSuccessMsg) {
		WebElement element = pom.getSearchHotelPage().getLoginSuccessMsg();
		String actLoginSuccessMsg = getAttribute(element, "value");
		Assert.assertEquals("Verify after login success message", expLoginSuccessMsg, actLoginSuccessMsg);
	}

	/**
	 * @see User should verify after search hotel success message
	 * @param expSuccessMsg
	 */
	@Then("User should verify after search hotel success message {string}")
	public void userShouldVerifyAfterSearchHotelSuccessMessage(String expSearchHotelSuccessMsg) {
		WebElement element = pom.getSelectHotelPage().getTxtSearchSuccessMsg();
		String actSearchHotelSuccessMsg = gettext(element);
		Assert.assertEquals("Verify after search hotel success Message", expSearchHotelSuccessMsg,
				actSearchHotelSuccessMsg);
	}

	/**
	 * @see User should verify after Select Hotel success message
	 * @param expectedSuccessMsg
	 */
	@Then("User should verify after Select Hotel success message {string}")
	public void userShouldVerifyAfterSelectHotelSuccessMessage(String expSelectHotelSuccessMsg) {
		WebElement element = pom.getBookHotelPage().getTxtSelectSuccessMsg();
		String actSelectHotelSuccessMsg = gettext(element);
		Assert.assertEquals("Verify after select hotel", expSelectHotelSuccessMsg, actSelectHotelSuccessMsg);

	}

	/**
	 * @see User should verify after Book Hotel success message and save the order
	 *      id
	 * @param expSuccessMsg
	 */
	@Then("User should verify after Book Hotel success message {string} and save the order id")
	public void userShouldVerifyAfterBookHotelSuccessMessageAndSaveTheOrderId(String expBookHotelSuccessMsg) {
		WebElement element = pom.getBookingConfirmationPage().getTxtBookingSuccessMsg();
		String actBookHotelSuccessMsg = gettext(element);
		Assert.assertEquals("Verify after booking hotel", expBookHotelSuccessMsg, actBookHotelSuccessMsg);
		String bookingConfirmation = pom.getBookingConfirmationPage().bookingConfirmation();
		System.out.println(bookingConfirmation);
	}

	/**
	 * @see User should verify after Cancel Booking success message {string}
	 * @param expSuccesMsg
	 */
	@Then("User should verify after Cancel Booking success message {string}")
	public void userShouldVerifyAfterCancelBookingSuccessMessage(String expCancelBookingSuccesMsg) {
		WebElement cancelSuccessMsg = pom.getBookingCancellationPage().getTxtCancelSuccessMsg();
		String actCancelBookingSuccessMsg = gettext(cancelSuccessMsg);
		Assert.assertEquals("Verify After cancel booking", expCancelBookingSuccesMsg, actCancelBookingSuccessMsg);
	}

}
