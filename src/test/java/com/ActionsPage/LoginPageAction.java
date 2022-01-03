package com.ActionsPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.LocatorPage.LoginPageLocator;
import com.Utility.Parent_Base;
import com.Utility.Test_Data;

public class LoginPageAction extends Parent_Base {
	
	LoginPageLocator loginPageLocator = new LoginPageLocator();
	
	public void UserLogin(String u, String p) {
		loginPageLocator.Username.sendKeys(u);
		loginPageLocator.Password.sendKeys(p);
		loginPageLocator.LoginButton.click();
		
	}
	
	
	public void EnterUsernameandClickOnNext(String GmailU, String GmailP) {
		
		loginPageLocator.GmailUsername.sendKeys(GmailU);
		loginPageLocator.Next.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Test_Data.explicitwait);
		wait.until(ExpectedConditions.visibilityOf(loginPageLocator.GmailPassword));
		
		loginPageLocator.GmailPassword.sendKeys(GmailP);
		
		loginPageLocator.Next.click();
		
	}
	
	
	
	

}
