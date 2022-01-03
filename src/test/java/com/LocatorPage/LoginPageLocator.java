package com.LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Parent_Base;

public class LoginPageLocator extends Parent_Base {

	
public LoginPageLocator() {
		
		PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(how=How.ID, using="EmailAddress")
	public WebElement Username;
	
	@FindBy(how=How.ID, using="Password")
	public WebElement Password;

	@FindBy(how=How.ID, using="sign-in-button")
	public WebElement LoginButton;
	
	@FindBy(how=How.ID, using="identifierId")
	public WebElement GmailUsername;
	
	@FindBy(how=How.CSS, using="input[type='password']")
	public WebElement GmailPassword;
	
	@FindBy(how=How.XPATH, using="//span[text()='Next']")
	public WebElement Next;
	
	

}
