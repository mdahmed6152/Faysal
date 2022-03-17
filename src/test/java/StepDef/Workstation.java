package StepDef;

import com.ActionsPage.HomePageAction;
import com.ActionsPage.WorkstationAction;
import com.ActionsPage.XPSSearchAction;
import com.Utility.Parent_Base;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class Workstation extends Parent_Base {
	
	HomePageAction homePageAction = new HomePageAction();
	WorkstationAction workstationAction = new  WorkstationAction();
	
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
		
		workstationAction.VerifyWorkstationsPage();
	   
	}



}
