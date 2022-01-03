package StepDef;

import com.ActionsPage.HomePageAction;
import com.ActionsPage.SearchPageAction;
import com.Utility.Parent_Base;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SearchResult extends Parent_Base {
	
	HomePageAction homePageAction = new HomePageAction();
	SearchPageAction searchPageAction = new SearchPageAction();
	
	@Then("^Enter XPS on Search Field$")
	public void enter_XPS_on_Search_Field() throws Throwable {
		homePageAction.EnterXPSonSearchField();
		   
	}

	@Then("^Click on Search Button$")
	public void click_on_Search_Button() throws Throwable {
		homePageAction.ClickonSearchButton();
	}

	@And("^Verify XPS Search Result$")
	public void verify_XPS_Search_Result() throws Throwable {
		searchPageAction.VerifyXPSSearchResult();
	   
	}

}
