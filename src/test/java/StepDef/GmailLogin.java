package StepDef;

import com.ActionsPage.LoginPageAction;
import com.ActionsPage.ProfilePageAction;
import com.Utility.Parent_Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GmailLogin extends Parent_Base {
	
	LoginPageAction loginPageAction = new LoginPageAction();
	ProfilePageAction profilePageAction = new ProfilePageAction();
	
	
	@Given("^Launch Gmail \"([^\"]*)\"$")
	public void launch_Gmail(String URL) throws Throwable {
	 launchURL(URL);
	}

	@Then("^Enter Username and Enter Password and Click On Next$")
	public void enter_Username_and_enter_Password_and_Click_On_Next() throws Throwable {
		
		loginPageAction.EnterUsernameandClickOnNext(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		
	}
		
	
	@Then("^Verify User is in the Gmail Account$")
	public void verify_User_is_in_the_Gmail_Account() throws Throwable {
		
		profilePageAction.VerifyUserisintheGmailAccount();
	   
	}



}
