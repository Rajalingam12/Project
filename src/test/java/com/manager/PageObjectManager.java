package com.manager;

import com.pages.BookHotelPage;

import com.pages.BookingCancellationPage;
import com.pages.BookingConfirmationPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;
/**
 * 
 * @author PC
 *
 */
public class PageObjectManager {
	private LoginPage loginPage;
	private SelectHotelPage selectHotelPage;
	private SearchHotelPage searchHotelPage;
	private BookHotelPage bookHotelPage;
	private BookingConfirmationPage bookingConfirmationPage;
	private BookingCancellationPage bookingCancellationPage;
	
	public LoginPage getLoginPage() {
		return (loginPage==null)? loginPage=new LoginPage(): loginPage;
	}
	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage==null)? searchHotelPage=new SearchHotelPage(): searchHotelPage;
	}
	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage==null)? selectHotelPage=new SelectHotelPage(): selectHotelPage;
	}
	
	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage==null)?bookHotelPage=new BookHotelPage(): bookHotelPage;
	}
	public BookingConfirmationPage getBookingConfirmationPage() {
		return (bookingConfirmationPage==null)?bookingConfirmationPage=new BookingConfirmationPage(): bookingConfirmationPage;
	}
	public BookingCancellationPage getBookingCancellationPage() {
		return (bookingCancellationPage==null)?bookingCancellationPage=new BookingCancellationPage(): bookingCancellationPage;
	}
	

}
