package com.LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Parent_Base;

public class HomePageLocator extends Parent_Base {
	
	public HomePageLocator() {
		
		PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(how=How.ID, using="um-si-label")
	public WebElement SignInLink;
	
	@FindBy(how=How.CSS, using="a[class='mh-btn mh-btn-primary navigate']")
	public WebElement SignInButton;
	
	@FindBy(how=How.ID, using="mh-search-input")
	public WebElement SearchField;
	
	@FindBy(how=How.CSS, using="button[class='mh-search-btn mh-search-submit']")
	public WebElement SearchButton;
	
	@FindBy(how=How.XPATH, using="//span[text()='Deals']")
	public WebElement DealsLink;
	
	@FindBy(how=How.LINK_TEXT, using="Gaming PC Deals")
	public WebElement GamingPC;
	 
	@FindBy(how=How.XPATH, using="//span[text()='Products']")
	public WebElement Products;
	
	@FindBy(how=How.XPATH, using="//a[text()='Workstations']")
	public WebElement Workstations;
	
	@FindBy(how=How.XPATH, using="//a[text()='Server Deals']")
	public WebElement ServersDeals;
	
	@FindBy(how=How.XPATH, using="//span[text()='Services']")
	public WebElement ServicesOption;
	
	@FindBy(how=How.LINK_TEXT, using="Education Services")
	public WebElement EducationServices;
	
	@FindBy(how=How.XPATH, using="//a[text()='Data Storage']")
	public WebElement DataStorage;
	
	
	
	
}





