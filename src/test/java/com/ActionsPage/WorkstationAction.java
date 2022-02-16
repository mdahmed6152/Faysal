package com.ActionsPage;

import org.testng.Assert;

import com.LocatorPage.WorkstationLocator;
import com.Utility.Parent_Base;

public class WorkstationAction extends Parent_Base{
	
	WorkstationLocator workstationLocator = new WorkstationLocator();
	
	public void VerifyWorkstationsPage() {
		
		
	Boolean verifyWorkstation = workstationLocator.VerifyWorkstation.isDisplayed();
	Assert.assertTrue(verifyWorkstation);
		
	}
	
	
	

}
