package com.LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Parent_Base;

public class SearchPageLocator extends Parent_Base{

	public SearchPageLocator() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.CSS, using="h2[class='direct-content__title']")
	public WebElement SearchResult;
	
	@FindBy(how=How.XPATH, using="//h1[text()='Gaming PC Deals']")
	public WebElement PCDealsPage;

	@FindBy(how=How.XPATH, using="//h1[text()='Precision Workstations']")
	public WebElement WorkstationsPage;

}
