package com.ActionsPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.LocatorPage.ServersDealsLocator;
import com.Utility.Parent_Base;
import com.Utility.Test_Data;

public class ServersDealsAction extends Parent_Base {
	
	
	ServersDealsLocator serversDealsLocator = new ServersDealsLocator();
	
	
	public void VerifyServersDealsPage() {
		
	Boolean verifyServers = serversDealsLocator.ServersDealsPage.isDisplayed();
	Assert.assertTrue(verifyServers);
	
	WebDriverWait wait = new WebDriverWait(driver, Test_Data.explicitwait);
	wait.until(ExpectedConditions.visibilityOf(serversDealsLocator.ServersDealsPage));
		
			
	}

}
