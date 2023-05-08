package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * 
 * @author PC
 * @see used to maintain all locators of Search hotel page
 *
 */
public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement ddnLocation;
	@FindBy(id = "hotels")
	private WebElement ddnHotels;
	@FindBy(id = "room_type")
	private WebElement ddnRoomType;
	@FindBy(id = "room_nos")
	private WebElement ddnRoomno;
	@FindBy(id = "datepick_in")
	private WebElement txtCheckin;
	@FindBy(id = "datepick_out")
	private WebElement txtCheckout;
	@FindBy(id = "adult_room")
	private WebElement ddnAdults;
	@FindBy(id = "child_room")
	private WebElement ddnChild;
	@FindBy(id = "Submit")
	private WebElement btnsearch;
	@FindBy(id="username_show")
	private WebElement loginSuccessMsg;
	@FindBy(id="checkin_span")
	private WebElement checkInDateErrorMsg;
	@FindBy (id="checkout_span")
	private WebElement checkOutDateErrorMsg;
	@FindBy(id="location_span")
	private WebElement txtLocationErrorMsg;
	
	
	public WebElement getDdnLocation() {
		return ddnLocation;
	}
	public WebElement getDdnHotels() {
		return ddnHotels;
	}
	public WebElement getDdnRoomType() {
		return ddnRoomType;
	}
	public WebElement getDdnRoomno() {
		return ddnRoomno;
	}
	public WebElement getTxtCheckin() {
		return txtCheckin;
	}
	public WebElement getTxtCheckout() {
		return txtCheckout;
	}
	public WebElement getDdnAdults() {
		return ddnAdults;
	}
	public WebElement getDdnChild() {
		return ddnChild;
	}
	public WebElement getBtnsearch() {
		return btnsearch;
	}
	public WebElement getLoginSuccessMsg() {
		return loginSuccessMsg;
	}
	public WebElement getCheckInDateErrorMsg() {
		return checkInDateErrorMsg;
	}
	public WebElement getCheckOutDateErrorMsg() {
		return checkOutDateErrorMsg;
	}
	public WebElement getTxtLocationErrorMsg() {
		return txtLocationErrorMsg;
	}
	/**
	 * @see businesslogics for search hotel common steps
	 * @param location
	 * @param noofRooms
	 * @param checkin
	 * @param checkout
	 * @param adults
	 */

	public void searchHotelCommonStep(String location,String noofRooms,String checkin,String checkout,String adults) {
		selectbyvisibletext(getDdnLocation(), location);
		selectbyvisibletext(getDdnRoomno(), noofRooms);
		clear(getTxtCheckin());
		sendkeys(getTxtCheckin(), checkin);
		clear(getTxtCheckout());
		sendkeys(getTxtCheckout(), checkout);
		selectbyvisibletext(getDdnAdults(), adults);
	}
	/**
	 * @see businesslogics for search hotel
	 * @param location
	 * @param hotels
	 * @param roomType
	 * @param noofrooms
	 * @param checkin
	 * @param checkout
	 * @param adults
	 * @param child
	 */
	//1,3
	public void searchHotel(String location,String hotels,String roomType,String noofrooms,String checkin,String checkout,String adults,String child) {
		searchHotelCommonStep(location, noofrooms, checkin, checkout, adults);
		selectbyvisibletext(getDdnHotels(), hotels);
		selectbyvisibletext(getDdnRoomType(), roomType);
		selectbyvisibletext(getDdnChild(), child);
		click(getBtnsearch());
	}
	//2
	/**
	 * @see businesslogics for search hotel 
	 * @param location
	 * @param noofRooms
	 * @param checkin
	 * @param checkout
	 * @param adults
	 */
	public void searchHotel(String location,String noofRooms,String checkin,String checkout,String adults) {
		searchHotelCommonStep(location, noofRooms, checkin, checkout, adults);
		click(getBtnsearch());
	}
	//4
	public void searchHotel() {
		click(getBtnsearch());

	}
	
	


}
	


