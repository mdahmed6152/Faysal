package com.LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Parent_Base;

public class XPSSearchLocator extends Parent_Base{

	public XPSSearchLocator() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.CSS, using="h2[class='direct-content__title']")
	public WebElement SearchResult;
	

}
