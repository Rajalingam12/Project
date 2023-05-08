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
public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement btnRdoButton;
	@FindBy(id="continue")
	private WebElement btnContinue;
	@FindBy(xpath="//td[@class='login_title']")
	private WebElement txtSearchSuccessMsg;
	@FindBy(id="radiobutton_span")
	private WebElement txtSelectErrorMsg;
	
	public WebElement getBtnRdoButton() {
		return btnRdoButton;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	public WebElement getTxtSearchSuccessMsg() {
		return txtSearchSuccessMsg;
	}
	public WebElement getTxtSelectErrorMsg() {
		return txtSelectErrorMsg;
	}
    /**
     * @see businesslogics for selecthotel
     */
	public void selectHotel() {
		click(getBtnRdoButton());
		click(getBtnContinue());
	}
	 /**
     * @see businesslogics for selecthotel
     */
	public void selectHotelWithoutHotel() {
		click(getBtnContinue());
	}
	
}
