package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * 
 * @author PC
 * @see used to maintain all locators of Booking Confirmation page
 *
 */
public class BookingConfirmationPage extends BaseClass {
	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement txtorderid;
	@FindBy(xpath="//td[@class='login_title']")
	private WebElement txtBookingSuccessMsg;
	
	public WebElement getTxtBookingSuccessMsg() {
		return txtBookingSuccessMsg;
	}
	public WebElement getTxtorderid() {
		return txtorderid;
	}
	public String bookingConfirmation() {
	String attributevalue = getAttributevalue(getTxtorderid());
		return attributevalue;
	}
	
}
