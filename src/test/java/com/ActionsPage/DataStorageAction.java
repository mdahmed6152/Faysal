package com.ActionsPage;

import org.testng.Assert;

import com.LocatorPage.DataStorageLocator;
import com.Utility.Parent_Base;

public class DataStorageAction extends Parent_Base {

	DataStorageLocator dataStorageLocator = new DataStorageLocator();
	
	
	public void VerifyDataStorage() {
		
	boolean verifyDataStoragePage = dataStorageLocator.DataStoragePageText.isDisplayed();
	Assert.assertTrue(verifyDataStoragePage);
		
		
	}
	
	
}
