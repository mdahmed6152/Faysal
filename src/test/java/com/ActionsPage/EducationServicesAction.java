package com.ActionsPage;

import org.testng.Assert;

import com.LocatorPage.EducationServicesLocator;
import com.Utility.Parent_Base;


public class EducationServicesAction extends Parent_Base {
	
	EducationServicesLocator educationServicesLocator = new EducationServicesLocator();
	
	public void VerifyEducationServices() {
		
		boolean verifyEducationServices = educationServicesLocator.EducationServicesText.isDisplayed();
		Assert.assertTrue(verifyEducationServices);
		
	}

}
