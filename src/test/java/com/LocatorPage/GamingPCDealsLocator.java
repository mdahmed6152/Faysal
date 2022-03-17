package com.LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Parent_Base;

public class GamingPCDealsLocator extends Parent_Base {
	
public GamingPCDealsLocator() {
		
		PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(how=How.XPATH, using="//h1[text()='Gaming PC Deals | Presidents Day Sale']")
	public WebElement GamingPCDeals;
	

}
