package com.TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.Parent_Base;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features ={"src/test/resources/myBDDFeatures"} , 
plugin = {"json:target/cucumber.json"},
glue = "StepDef", tags={"@dataStorage"})

public class TestRunner extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	
	public void launchURL() {
		
		Parent_Base BeTest = new Parent_Base();
		BeTest.browserinti();
	}
	
	@AfterTest
	public void closeURL() {
		
		Parent_Base AfTest = new Parent_Base();
		AfTest.driver.quit();	
		
	}
		
	
}
