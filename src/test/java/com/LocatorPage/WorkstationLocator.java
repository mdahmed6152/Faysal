package com.LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Parent_Base;

public class WorkstationLocator extends Parent_Base {
	
public WorkstationLocator() {
		
		PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(how=How.XPATH, using="//h1[text()='Precision Workstations']")
	public WebElement VerifyWorkstation;
	

}
