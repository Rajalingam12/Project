package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * 
 * @author PC
 * @see used to maintain login page locators
 * 
 *
 */
public class LoginPage extends BaseClass {
	public LoginPage(){
		PageFactory.initElements(driver, this);
		}
	@FindBy(id="username")
	private WebElement txtUserName;
	@FindBy(id="password")
	private WebElement txtPassword;
	@FindBy(name="login")
	private WebElement btnLogin;
	@FindBy(xpath="//b[contains(text(),'Invalid Login')]")
	private WebElement txtInvalidMsg;
	public WebElement getTxtInvalidMsg() {
		return txtInvalidMsg;
	}
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	/**
	 * @see business logics for login page common steps
	 * @param user
	 * @param pass
	 */
	public void logincommonstep(String user,String pass) {
		sendkeys(getTxtUserName(), user);
		sendkeys(getTxtPassword(), pass);
		
	}
	/**
	 * @see business logics to perform login
	 * @param user
	 * @param pass
	 */
	public void login(String user,String pass) {
		logincommonstep(user, pass);
		click(getBtnLogin());
	}
	/**
	 * @see business logics to perform login with enter keys
	 * @param user
	 * @param pass
	 * @throws AWTException
	 */
	public void loginwithenter(String user,String pass) throws AWTException {
		logincommonstep(user, pass);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
		
}
