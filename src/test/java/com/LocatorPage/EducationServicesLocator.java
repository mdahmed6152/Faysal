package com.LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Parent_Base;

public class EducationServicesLocator extends Parent_Base {
	
	
	public EducationServicesLocator() {
		
		PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(how=How.CSS, using="h2[class='heading noCta noText']")
	public WebElement EducationServicesText;
	

}
