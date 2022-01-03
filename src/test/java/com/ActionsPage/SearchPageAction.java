package com.ActionsPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.LocatorPage.SearchPageLocator;
import com.Utility.Parent_Base;
import com.Utility.Test_Data;
import com.Utility.Utility;

public class SearchPageAction extends Parent_Base {
	
	SearchPageLocator searchPageLocator = new SearchPageLocator();
	
	public void VerifyXPSSearchResult() {
		
	Boolean verifyXPSresult = searchPageLocator.SearchResult.isDisplayed();
	Assert.assertTrue(verifyXPSresult);
	Utility.takescreenshot(driver, "XPSresult");

	}
	
	public void VerifyGamingPCDealsPage() {
		
	Boolean VerifyGamingPCDeals = searchPageLocator.PCDealsPage.isDisplayed();
	Assert.assertTrue(VerifyGamingPCDeals);
	Utility.takescreenshot(driver, "Gaming PC Deals");
	
	WebDriverWait wait = new WebDriverWait(driver, Test_Data.explicitwait);
	wait.until(ExpectedConditions.visibilityOf(searchPageLocator.PCDealsPage));
		
	}
	
	public void VerifyWorkstationsPage() {
		
	Boolean VerifyWorkstations = searchPageLocator.WorkstationsPage.isDisplayed();
	Assert.assertTrue(VerifyWorkstations);
	
	WebDriverWait wait = new WebDriverWait(driver, Test_Data.explicitwait);
	wait.until(ExpectedConditions.visibilityOf(searchPageLocator.WorkstationsPage));
		
		
	}
		
}
