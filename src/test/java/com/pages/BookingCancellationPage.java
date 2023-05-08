package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * 
 * @author PC
 * @see used to maintain all locators of Booking Cancellation page
 *
 */
public class BookingCancellationPage extends BaseClass {
	public BookingCancellationPage() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement btnBookingItinerary;
	@FindBy(id="order_id_text")
	private WebElement txtOrderId;
	@FindBy(id="search_hotel_id")
	private WebElement btnGo;
	@FindBy (xpath="//input[@type='button']")
	private WebElement btnClickCancel;
	@FindBy(id="search_result_error")
	private WebElement txtCancelSuccessMsg;
   
	public WebElement getBtnBookingItinerary() {
		return btnBookingItinerary;
	}

	public WebElement getTxtOrderId() {
		return txtOrderId;
	}

	public WebElement getBtnGo() {
		return btnGo;
	}

	public WebElement getBtnClickCancel() {
		return btnClickCancel;
	}

	public WebElement getTxtCancelSuccessMsg() {
		return txtCancelSuccessMsg;
	}

	/**
	 * @see Cancel bookin business logics
	 * @param orderid
	 */
	public void bookingCancel(String orderid) {
		click(getBtnBookingItinerary());
		sendkeys(getTxtOrderId(), orderid);
		click(getBtnGo());
		click(getBtnClickCancel());
		alertok();
	}

}
