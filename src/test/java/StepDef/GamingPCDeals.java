package StepDef;

import com.ActionsPage.GamingPCDealsAction;
import com.ActionsPage.HomePageAction;
import com.ActionsPage.XPSSearchAction;
import com.Utility.Parent_Base;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class GamingPCDeals extends Parent_Base {
	
	HomePageAction homePageAction = new HomePageAction();
	GamingPCDealsAction gamingPCDealsAction = new GamingPCDealsAction();
	
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
		gamingPCDealsAction.VerifyGamingPCDealsPage();
	   
	}

}
