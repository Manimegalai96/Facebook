package com.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import FaceBook.com.Facebook.FBAccountCreatePage;
import FaceBook.com.Facebook.FBHomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookRunnerClass  {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		FBHomePage fbhp=new FBHomePage(driver);
		fbhp.getName().sendKeys("Manimegalai guhan");
		fbhp.getPass().sendKeys("M@ni1996000");
		fbhp.getLogin().click();
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		FBAccountCreatePage fbap=new FBAccountCreatePage(driver);
		fbap.getCreate().click();
		Thread.sleep(2000);
		fbap.getFirstname().sendKeys("Manimegalai");
		fbap.getLastname().sendKeys("Nagendiran");
		fbap.getMobile().sendKeys("73586787159");
		fbap.getNewpassword().sendKeys("M@ni1999001");
		Select sday=new Select(fbap.getDay());
		sday.selectByValue("9");
		Select smonth=new Select(fbap.getMonth());
		smonth.selectByValue("10");
		Select syear=new Select(fbap.getYear());
		syear.selectByVisibleText("1996");
		fbap.getGender().click();
		fbap.getCreated().click();
		
		
		
		
		
		
		
		
				
	
		
		
	}}