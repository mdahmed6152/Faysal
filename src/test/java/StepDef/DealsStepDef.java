package StepDef;

import com.ActionsPage.HomePageAction;
import com.ActionsPage.SearchPageAction;
import com.Utility.Parent_Base;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class DealsStepDef extends Parent_Base {
	
	HomePageAction homePageAction = new HomePageAction();
	SearchPageAction searchPageAction = new SearchPageAction();
	
	@Then("^Mouseover on Deals Link$")
	public void mouseover_on_Deals_Link() throws Throwable {
		
		homePageAction.MouseoveronDealsLink();
	    
	}

	@Then("^Click on Gaming PC Deals$")
	public void click_on_Gaming_PC_Deals() throws Throwable {
		homePageAction.ClickonGamingPCDeals();
	   
	}

	@And("^Verify Gaming PC Deals Page$")
	public void verify_Gaming_PC_Deals_Page() throws Throwable {
		searchPageAction.VerifyGamingPCDealsPage();
	   
	}

}
