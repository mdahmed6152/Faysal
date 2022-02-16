package com.ActionsPage;


import com.LocatorPage.HomePageLocator;
import com.Utility.Parent_Base;
import com.Utility.Test_Data;

public class HomePageAction extends Parent_Base {
	
	HomePageLocator homePageLocator = new HomePageLocator();
	
	public void ClickSigninAndClickSignINButton() {
		
		homePageLocator.SignInLink.click();
		homePageLocator.SignInButton.click();			
	}
	
	public void EnterXPSonSearchField() {
		
		homePageLocator.SearchField.sendKeys(Test_Data.SearchData1);	
		
	}
	
	public void ClickonSearchButton() {
		
		homePageLocator.SearchButton.click();
	}
	
	public void MouseoveronDealsLink() {
		
		homePageLocator.DealsLink.click();
			
	}
	public void ClickonGamingPCDeals() {
		
		homePageLocator.GamingPC.click();
		
	}
	
	public void MouseoveronProductsLink() {
		
		homePageLocator.Products.click();
		
		
	}
	
	public void ClickonWorkstations() {
		
		homePageLocator.Workstations.click();
		
	}
	
	public void ClickOnServersDeals() {
		
		homePageLocator.ServersDeals.click();
		
		
	}
	
   public void ClickOnServicesOption() {
		
		homePageLocator.ServicesOption.click();
		
		
	}
	
   public void ClickOnEducationServices() {
		
		homePageLocator.EducationServices.click();
		
		
	}
	
		
	
	

}
