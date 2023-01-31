package com.CucumberRunner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import FaceBook.com.Facebook.Baseclass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import properties.Configurationhelper;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\CucumberFeature\\Facebook.feature",
glue="com.Cucumber.Stepdefinition",stepNotifications = true,
monochrome=true,plugin="pretty")

public class CucumberRunner {
	
	public static WebDriver driver ;
	
	@BeforeClass
	public static void browserLaunch() throws Exception {
		
		String browser=Configurationhelper.getInstanceCR().getbrowser();
		
		driver= Baseclass.browserLaunch(browser);
		

	}
	@AfterClass
	public static void browserclose() throws InterruptedException {
		Thread.sleep(2000);
		
		driver.close();

	}
	
		

	}


