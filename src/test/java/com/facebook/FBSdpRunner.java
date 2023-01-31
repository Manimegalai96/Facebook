package com.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import FaceBook.com.Facebook.FacebookSDP;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FBSdpRunner {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			FacebookSDP fsdp=new FacebookSDP(driver);
			fsdp.getFbhp().getName().sendKeys("Manimegalai Nagendiran");
			fsdp.getFbhp().getPass().sendKeys("M@ni199603");
			fsdp.getFbhp().getLogin().click();
			
			Thread.sleep(2000);
			driver.navigate().back();
			fsdp.getFbap().getCreate().click();
			Thread.sleep(2000);
			fsdp.getFbap().getFirstname().sendKeys("Manimegalai");
			fsdp.getFbap().getLastname().sendKeys("Nagendiran");
			fsdp.getFbap().getMobile().sendKeys("73586787159");
			fsdp.getFbap().getNewpassword().sendKeys("M@ni1996037");
			Select sday=new Select(fsdp.getFbap().getDay());
			sday.selectByValue("9");
			Select smonth=new Select(fsdp.getFbap().getMonth());
			smonth.selectByValue("10");
			Select syear=new Select(fsdp.getFbap().getYear());
			syear.selectByVisibleText("1996");
			fsdp.getFbap().getGender().click();
			fsdp.getFbap().getCreated().click();
			
			
		}
	
	}
