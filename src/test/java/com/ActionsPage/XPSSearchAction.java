package com.ActionsPage;
import org.testng.Assert;
import com.LocatorPage.XPSSearchLocator;
import com.Utility.Parent_Base;



public class XPSSearchAction extends Parent_Base {
	
	XPSSearchLocator searchPageLocator = new XPSSearchLocator();
	
	public void VerifyXPSSearchResult() {
		
		
	Boolean searchResult = searchPageLocator.SearchResult.isDisplayed();
	Assert.assertTrue(searchResult);
		
	
		
		
	}
		
}
