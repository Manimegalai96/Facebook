package com.facebook;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;



public class FacebookScript extends FaceBook.com.Facebook.Baseclass{
	
	
public static WebDriver driver;
static String title1;

	public static void main(String[] args) throws Throwable {
	       
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manimegalai\\Desktop\\Selenium\\Selenium_MiniProjects\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.manage().window().maximize();

		
	
		
		String title1 = driver.getTitle();

		System.out.println(title1);
		
		
		
		if (title1.contains("Facebook")) {
			
			System.out.println("user launched correct application");
			
		} else {
			
			driver.quit();}

		

		WebElement name = driver.findElement(By.id("email"));
		name.sendKeys("Manimegalai Nagendiran");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("M@ni19960327");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Manimegalai\\Desktop\\Selenium\\Selenium_MiniProjects\\Screenshot\\fb.png");
		FileUtils.copyFile(source, destination);
		driver.navigate().back();
		
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		Thread.sleep(3000);
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Manimegalai");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Nagendiran");
        
        WebElement mobile = driver.findElement(By.xpath("(//input[@data-type='text'])[3]"));
		mobile.sendKeys("73586787159");
		
		WebElement newpassword = driver.findElement(By.id("password_step_input"));
		newpassword.sendKeys("Mbdisbdsi");
		
		WebElement dateofbirth = driver.findElement(By.id("day"));
		Select sdate=new Select(dateofbirth);
		sdate.selectByValue("9");
		boolean multipledate = sdate.isMultiple();
		System.out.println(multipledate);
		
		WebElement month = driver.findElement(By.id("month"));
		Select smonth= new Select(month);
		smonth.selectByValue("10");
		boolean multiplemonth = smonth.isMultiple();
		System.out.println(multiplemonth);
		
		WebElement year = driver.findElement(By.id("year"));
		Select syear= new Select(year);
		syear.selectByVisibleText("1996");
		boolean multipleyear = syear.isMultiple();
		System.out.println(multipleyear);
		
		WebElement button = driver.findElement(By.name("sex"));
		button.click();
		boolean selected = button.isSelected();
		System.out.println(selected);
		
		WebElement created = driver.findElement(By.name("websubmit"));
		created.click();
		
		TakesScreenshot tK=(TakesScreenshot)driver;
		File source1 = tK.getScreenshotAs(OutputType.FILE);
		File destination1=new File("C:\\Users\\Manimegalai\\Desktop\\Selenium\\Selenium_MiniProjects\\Screenshot\\fb2.png");
		FileUtils.copyFile(source1, destination1);
		
		WebElement close = driver.findElement(By.xpath("//img[@height='24']"));
		close.click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		if (title2.equalsIgnoreCase(title1)) {
			
		System.out.println("get title "+title2);
		}else {
			
			driver.quit();
		}
		
		driver.quit();
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
		
	}


