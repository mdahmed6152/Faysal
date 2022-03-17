package com.ActionsPage;

import org.testng.Assert;

import com.LocatorPage.GamingPCDealsLocator;
import com.Utility.Parent_Base;

public class GamingPCDealsAction extends Parent_Base {
	
	
	GamingPCDealsLocator gamingPCDealsLocator = new GamingPCDealsLocator();

	
	public void  VerifyGamingPCDealsPage() {
		
	Boolean verifyGamingPC = gamingPCDealsLocator.GamingPCDeals.isDisplayed();
	Assert.assertTrue(verifyGamingPC);
		
		
	}
}
