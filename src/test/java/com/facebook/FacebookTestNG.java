package com.facebook;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import DataDriven.DataDrivenFBreader;
import properties.ConfigurationReader;
import properties.Configurationhelper;



public class FacebookTestNG extends FaceBook.com.Facebook.Baseclass {
	
	public static WebDriver driver;
	String title1;
	
	@BeforeClass
	private void browserLaunch() throws IOException {

	   String getbrowser = Configurationhelper.getInstanceCR().getbrowser();
	   String url = Configurationhelper.getInstanceCR().getUrl();

	   
		driver=browserLaunch(getbrowser);
		launchUrl(url);
		getCurrentUrl();
	}
	
	@Test(priority=0)
	private void getPage() {
		
		getTitle();
	}
	@Test(priority=1)
	private void login() throws Exception {
		
		WebElement name = driver.findElement(By.id("email"));
		String sheet = Configurationhelper.getInstanceCR().getSheet();
		String username = DataDrivenFBreader.singleData(sheet, 0, 0);
		UserInput(name, username);
		String pwd = DataDrivenFBreader.singleData(sheet, 1, 0);
		
		WebElement password = driver.findElement(By.id("pass"));
   
		UserInput(password, pwd);
		
		WebElement login = driver.findElement(By.name("login"));
		

		click(login);
		
	}
	@Test(priority=2)
	private void screenshot1() throws InterruptedException, IOException {
		sleep();
		screenshot();

		navigateBack();
	}
@Test(priority=3)
	private void createuser() throws Exception {
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		click(create);
		sleep();
		
		WebElement firstname = driver.findElement(By.name("firstname"));

		UserInput(firstname, "Manimegalai");
		
		WebElement lastname = driver.findElement(By.name("lastname"));

		UserInput(lastname, "Nagendiran");
        
        WebElement mobile = driver.findElement(By.xpath("(//input[@data-type='text'])[3]"));

        UserInput(mobile, "73586787159");
		
		WebElement newpassword = driver.findElement(By.id("password_step_input"));

		UserInput(newpassword, "Mbdisbdsi");
		
		WebElement dateofbirth = driver.findElement(By.id("day"));

		selectdropdown(dateofbirth, "value" ,"9");
		isMultiple(dateofbirth);
		

		
		WebElement month = driver.findElement(By.id("month"));

		selectdropdown(month, "value" ,"10");
		
		isMultiple(month);

		
		WebElement year = driver.findElement(By.id("year"));

		selectdropdown(year, "text" ,"1996");
		isMultiple(year);

		
		WebElement button = driver.findElement(By.name("sex"));

		click(button);

		isSelected(button);
		
		WebElement created = driver.findElement(By.name("websubmit"));

		click(created);
	}
@Test(priority=4)
private void screenshot2() throws IOException {

	screenshot();
}@Test(priority=5,dependsOnMethods = "getPage")
private void getpage2() throws Exception {

WebElement close = driver.findElement(By.xpath("//img[@height='24']"));

click(close);

getTitle();
}

@AfterClass
private void closeapp() {
quit();
}

	

}
