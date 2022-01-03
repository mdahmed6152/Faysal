package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_Base {
	
	public static Properties prop;
	public static WebDriver driver;
	
   public Parent_Base() {
		
	prop = new Properties();
		
	try {
		FileInputStream fls = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\Config\\Config.properties");
		
		prop.load(fls);
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
		
	}

	public void browserinti() {
		
	String BrowserName = prop.getProperty("Browser1");
	
	if(BrowserName.equalsIgnoreCase("Chrome")) {
		
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
    
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().pageLoadTimeout(Test_Data.pageLoadTimeout, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Test_Data.implicitlyWait, TimeUnit.SECONDS);
	    
	}
	
	else if(BrowserName.equalsIgnoreCase("FireFox"));
		
	}
	
	public static void launchURL(String URL) {
		
		driver.get(prop.getProperty("url1"));
	}

}
