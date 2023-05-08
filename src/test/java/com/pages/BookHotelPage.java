package com.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * 
 * @author PC
 * @see used to maintain all locators of Book hotel page
 *
 */
public class BookHotelPage extends BaseClass {
	public BookHotelPage(){
		PageFactory.initElements(driver, this);
	}
	 @FindBy(id="first_name")
	 private WebElement txtFirstName;
	 @FindBy(id="last_name")
	 private WebElement txtLastName;
	 @FindBy(id="address")
	 private WebElement txtAddress;
	 @FindBy(id="cc_num")
	 private WebElement txtCard;
	 @FindBy(id="cc_type")
	 private WebElement ddnCardType;
	 @FindBy(id="cc_exp_month")
	 private WebElement ddnExpMonth;
	 @FindBy(id="cc_exp_year")
	 private WebElement ddnExpYear;
	 @FindBy(id="cc_cvv")
	 private WebElement txtCvv;
	 @FindBy(id="book_now")
	 private WebElement btnBookNow;
	 @FindBy(xpath="(//td[@class='login_title'])[2]")
	 private WebElement txtSelectSuccessMsg;
	 @FindBy(id="first_name_span")
	 private WebElement txtFirstNameErrorMsg;
	 @FindBy(id="last_name_span")
	 private WebElement txtLastNameErrorMsg;
	 @FindBy(id="address_span")
	 private WebElement txtAddressErrorMsg;
	 @FindBy(id="cc_num_span")
	 private WebElement txtCcNumErrorMsg;
	 @FindBy(id="cc_type_span")
	 private WebElement txtCcTypeErrorMsg;
	 @FindBy(id="cc_expiry_span")
	 private WebElement txtExpErrorMsg;
	 @FindBy(id="cc_cvv_span")
	 private WebElement txtCvvErrorMsg;
		
		
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getTxtCard() {
		return txtCard;
	}
	public WebElement getDdnCardType() {
		return ddnCardType;
	}
	public WebElement getDdnExpMonth() {
		return ddnExpMonth;
	}
	public WebElement getDdnExpYear() {
		return ddnExpYear;
	}
	public WebElement getTxtCvv() {
		return txtCvv;
	}
	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	public WebElement getTxtSelectSuccessMsg() {
		return txtSelectSuccessMsg;
	}
	public WebElement getTxtFirstNameErrorMsg() {
		return txtFirstNameErrorMsg;
	}
	public WebElement getTxtLastNameErrorMsg() {
		return txtLastNameErrorMsg;
	}
	public WebElement getTxtAddressErrorMsg() {
		return txtAddressErrorMsg;
	}
	public WebElement getTxtCcNumErrorMsg() {
		return txtCcNumErrorMsg;
	}
	public WebElement getTxtCcTypeErrorMsg() {
		return txtCcTypeErrorMsg;
	}
	public WebElement getTxtExpErrorMsg() {
		return txtExpErrorMsg;
	}
	public WebElement getTxtCvvErrorMsg() {
		return txtCvvErrorMsg;
	}
	
	//1
	/**
	 * @see business logics for booking hotel
	 * @param first
	 * @param last
	 * @param address
	 * @param datatable
	 * @throws InterruptedException
	 */
	public void bookHotelSelectingAll(String first,String last,String address,DataTable datatable) throws InterruptedException  {
	 sendkeys(getTxtFirstName(), first);
	 sendkeys(getTxtLastName(), last);
	 sendkeys(getTxtAddress(), address);
	 
	 List<Map<String, String>> data = datatable.asMaps();
	    String creditcardno = data.get(1).get("CreditcardNo");
	    String cardtype = data.get(1).get("Creditcardtype");
	    String expmonth = data.get(1).get("Expmonth");
	    String expyear = data.get(1).get("Expyear");
	    String cvv = data.get(1).get("Cvv");
	    
	    sendkeys(getTxtCard(), creditcardno);
	    selectbyvisibletext(getDdnCardType(), cardtype);
	    selectbyvisibletext(getDdnExpMonth(), expmonth);
	    selectbyvisibletext(getDdnExpYear(), expyear);
	    sendkeys(getTxtCvv(), cvv);
	    click(getBtnBookNow());
	    threadsleep();
	 
	 }
	//2
	public void bookHotelWithoutSelecting() {
	 click(getBtnBookNow());	
	}
	

		
}
