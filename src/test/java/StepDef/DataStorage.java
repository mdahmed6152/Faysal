package StepDef;

import com.ActionsPage.DataStorageAction;
import com.ActionsPage.HomePageAction;
import com.Utility.Parent_Base;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataStorage extends Parent_Base {
	
	HomePageAction homePageAction = new HomePageAction();
	DataStorageAction dataStorageAction = new DataStorageAction();
	
	@When("^Click On Data Storage$")
	public void click_On_Data_Storage() throws Throwable {
	   
		homePageAction.ClickOnDataStorage();
		
	}

	@Then("^Verify Data Storage$")
	public void verify_Data_Storage() throws Throwable {
	  
		dataStorageAction.VerifyDataStorage();
		
		
	}
	
	
	
	

}
