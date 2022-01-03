package StepDef;

import com.ActionsPage.HomePageAction;
import com.ActionsPage.SearchPageAction;
import com.Utility.Parent_Base;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ProductsStepDef extends Parent_Base {
	
	HomePageAction homePageAction = new HomePageAction();
	SearchPageAction searchPageAction = new  SearchPageAction();
	
	@Then("^Mouseover on Products Link$")
	public void mouseover_on_Products_Link() throws Throwable {
		
		homePageAction.MouseoveronProductsLink();
	   
	}

	@Then("^Click on Workstations$")
	public void click_on_Workstations() throws Throwable {
		
		homePageAction.ClickonWorkstations();
	    
	}

	@And("^Verify Workstations Page$")
	public void verify_Workstations_Page() throws Throwable {
		
		searchPageAction.VerifyWorkstationsPage();
	   
	}



}
