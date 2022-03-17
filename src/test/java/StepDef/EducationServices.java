package StepDef;

import com.ActionsPage.EducationServicesAction;
import com.ActionsPage.HomePageAction;
import com.Utility.Parent_Base;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EducationServices extends Parent_Base {
	
	HomePageAction homePageAction = new HomePageAction();
	EducationServicesAction educationServicesAction = new  EducationServicesAction();
	
	@When("^Click On Services Option$")
	public void click_On_Services_Option() throws Throwable {
	
	homePageAction.ClickOnServicesOption();
	   
	}

	@Then("^Click On Education Services$")
	public void click_On_Education_Services() throws Throwable {
		
	homePageAction.ClickOnEducationServices();
	    
	}

	@And("^Verify Education Services$")
	public void verify_Education_Services() throws Throwable {
		
		educationServicesAction.VerifyEducationServices();
	    
	}

}
