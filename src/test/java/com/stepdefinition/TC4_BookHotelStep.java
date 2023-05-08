package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class TC4_BookHotelStep extends BaseClass {
	PageObjectManager pom=new PageObjectManager();
	/**
	 * @see User should perform Book Hotel by selecting all the fields
	 * @param First
	 * @param last
	 * @param Address
	 * @param dataTable
	 * @throws InterruptedException
	 */
	@Then("User should perform Book Hotel by selecting all the fields {string},{string} and {string}")
	public void userShouldPerformBookHotelBySelectingAllTheFieldsAnd(String First, String last, String Address, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    pom.getBookHotelPage().bookHotelSelectingAll(First, last, Address, dataTable);
	    
	}
	/**
	 * @see User should perform Book Hotel Without selecting any fields
	 */
	@Then("User should perform Book Hotel Without selecting any fields")
	public void userShouldPerformBookHotelWithoutSelectingAnyFields() {
		pom.getBookHotelPage().bookHotelWithoutSelecting();
	   
	}
	/**
	 * @see User should verify after Book Hotel error messages
	 * @param expfirst
	 * @param explast
	 * @param expadd
	 * @param expcardno
	 * @param expcardtype
	 * @param expexpiry
	 * @param expcvv
	 */
	@Then("User should verify after Book Hotel error messages {string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldVerifyAfterBookHotelErrorMessagesAnd(String expfirst, String explast, String expadd, String expcardno, String expcardtype, String expexpiry, String expcvv) {
	   WebElement firstname = pom.getBookHotelPage().getTxtFirstNameErrorMsg();
	   String actfirst = gettext(firstname);
	   boolean containsfirst = actfirst.contains(expfirst);
	   Assert.assertTrue("Verify at firstname", containsfirst);
	   WebElement lastname = pom.getBookHotelPage().getTxtLastNameErrorMsg();
	   String actlast = gettext(lastname);
	   boolean containslast = actlast.contains(explast);
	   Assert.assertTrue("Verify at lastname", containslast);
	   WebElement address = pom.getBookHotelPage().getTxtAddressErrorMsg();
	   String actadd = gettext(address);
	   boolean containsadd = actadd.contains(expadd);
	   Assert.assertTrue("Verify at add", containsadd);
	   WebElement ccnum = pom.getBookHotelPage().getTxtCcNumErrorMsg();
	   String actnum = gettext(ccnum);
	   boolean containsnum = actnum.contains(expcardno);
	   Assert.assertTrue("Verfiy at card num", containsnum);
	   WebElement cctype = pom.getBookHotelPage().getTxtCcTypeErrorMsg();
	   String acttype = gettext(cctype);
	   boolean containstype = acttype.contains(expcardtype);
	   Assert.assertTrue("Verify at card type", containstype);
	   WebElement expiry = pom.getBookHotelPage().getTxtExpErrorMsg();
	   String actexpiry = gettext(expiry);
	   boolean containsexpiry = actexpiry.contains(expexpiry);
	   Assert.assertTrue("Verfiy at expiry", containsexpiry);
	   WebElement cccvv = pom.getBookHotelPage().getTxtCvvErrorMsg();
	   String actcvv = gettext(cccvv);
	   boolean containscvv = actcvv.contains(expcvv);
	   Assert.assertTrue("Verify at cvv", containscvv);
	   
	  
	}






	

	
}







