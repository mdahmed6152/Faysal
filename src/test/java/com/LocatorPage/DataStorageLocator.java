package com.LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Parent_Base;

public class DataStorageLocator extends Parent_Base {
	
	
	
	public DataStorageLocator() {
		
		
	PageFactory.initElements(driver, this);
	
		
	}
	

	@FindBy(how=How.XPATH, using="//h1[text()='Harness the power of storage solutions from Dell Technologies']")
	public WebElement DataStoragePageText;
	
	
	
}
