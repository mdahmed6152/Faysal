package com.LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Parent_Base;

public class ServersDealsLocator extends Parent_Base {

public ServersDealsLocator() {
		
		PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(how=How.CSS, using="h1[class='category-page-title']")
	public WebElement ServersDealsPage;
	
}
