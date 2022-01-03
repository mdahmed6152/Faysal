package StepDef;

import com.ActionsPage.HomePageAction;
import com.ActionsPage.ServersDealsAction;
import com.Utility.Parent_Base;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ServersDeals extends Parent_Base {
	
	HomePageAction homePageAction = new HomePageAction();
	
	ServersDealsAction serversDealsAction = new ServersDealsAction();
	
	
	@When("^Click On Servers Deals$")
	public void click_On_Servers_Deals() throws Throwable {
		
		homePageAction.ClickOnServersDeals();
	   
	}

	@Then("^Verify Servers Deals Page$")
	public void verify_Servers_Deals_Page() throws Throwable {
		
		serversDealsAction.VerifyServersDealsPage();
	    
	}



}
