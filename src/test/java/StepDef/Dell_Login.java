package StepDef;


import com.ActionsPage.HomePageAction;
import com.ActionsPage.LoginPageAction;
import com.ActionsPage.ProfilePageAction;
import com.Utility.Parent_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Dell_Login extends Parent_Base {
	
	HomePageAction homePageAction = new HomePageAction();
	
	LoginPageAction loginPageAction = new LoginPageAction();
	
	ProfilePageAction profilePageAction = new ProfilePageAction();
	
	
	@Given("^Launch Dell \"([^\"]*)\"$")
	public void launch_Dell(String URL) throws Throwable {
		launchURL(URL);
	   
	}

	@Then("^Click SignIn and Click SignIn Button$")
	public void click_SignIn_and_Click_SignIn_Button() throws Throwable {
		homePageAction.ClickSigninAndClickSignINButton();
	    
	}

	@Then("^Enter UserName and Password and Click Login$")
	public void enter_UserName_and_Password_and_Click_Login() throws Throwable {
		loginPageAction.UserLogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
	   
	}

	@Then("^Verify User in Profile Page$")
	public void verify_User_in_Profile_Page() throws Throwable {
		profilePageAction.VerifyUserinProfilePage();
		
		    
	}
	





}
