package com.ActionsPage;

import org.junit.Assert;

import com.LocatorPage.ProfilePageLocator;
import com.Utility.Parent_Base;
import com.Utility.Utility;

public class ProfilePageAction extends Parent_Base {
	
	ProfilePageLocator profilePageLocator = new ProfilePageLocator();
	
	public void VerifyUserinProfilePage() {
		
	Boolean profile = profilePageLocator.ProfilePage.isDisplayed();
	Assert.assertTrue(profile);
	Utility.takescreenshot(driver, "Profile Page");
		
	}

	public void VerifyUserisintheGmailAccount() {
		
	Boolean GmailProfile = profilePageLocator.GmailProfilePage.isDisplayed();
	Assert.assertTrue(GmailProfile);
		
	}
	
	
	
	
}
