package com.Cucumber.Stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.CucumberRunner.CucumberRunner;
import com.facebook.FBSdpRunner;

import FaceBook.com.Facebook.Baseclass;
import FaceBook.com.Facebook.FacebookSDP;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import properties.Configurationhelper;

public class Stepdefinition extends Baseclass  {
	
	public  static WebDriver driver=CucumberRunner.driver;
	public static FacebookSDP sdp;
	
	
	
	@Given("user Launch the Url")
	public void user_launch_the_url() throws IOException {
		String url = Configurationhelper.getInstanceCR().getUrl();
		launchUrl(url);
	   
	}
	@When("user Enter the {string} in User Field")
	public void user_enter_the_in_user_field(String username) throws InterruptedException {
		sdp=new FacebookSDP(driver);
		sdp.getFbhp().getName().sendKeys(username);
		
		
	  
	}
	@When("user Enter the {string} in Password Field")
	public void user_enter_the_in_password_field(String password) {
		sdp.getFbhp().getPass().sendKeys(password);
	  
	}
	@Then("user Click the Login button")
	public void user_click_the_login_button() throws InterruptedException {
		sdp.getFbhp().getLogin().click();
		sleep();
		navigateBack();
	
	   
	}
	@Then("user Dont Have Account and Click to Create New Account")
	public void user_dont_have_account_and_click_to_create_new_account() throws InterruptedException {
		sdp.getFbap().getCreate().click();
		sleep();
	  
	}
	@When("user Enter the {string} in FirstName Field")
	public void user_enter_the_in_first_name_field(String firstname) {
		sdp.getFbap().getFirstname().sendKeys(firstname);
	    
	}
	@When("user Enter the {string} in LastName Field")
	public void user_enter_the_in_last_name_field(String lastname) {
		sdp.getFbap().getLastname().sendKeys(lastname);
	   
	}
	@When("user Enter the {string} in Mobile Field")
	public void user_enter_the_in_mobile_field(String mobile) {
		sdp.getFbap().getMobile().sendKeys(mobile);
	    
	}
	@When("user Enter the {string} in newPassword Field")
	public void user_enter_the_in_new_password_field(String newpassword) {
		sdp.getFbap().getNewpassword().sendKeys(newpassword);

	}
	@When("user Select the dropdown for Date Field")
	public void user_select_the_dropdown_for_date_field() {

		Select sday=new Select(sdp.getFbap().getDay());
		sday.selectByValue("9");
		
		
	  
	}
	@When("user Select the dropdown for Month Field")
	public void user_select_the_dropdown_for_month_field() {
		Select smonth=new Select(sdp.getFbap().getMonth());
		smonth.selectByValue("10");
	   
	}
	@When("user Select the dropdown for Year Field")
	public void user_select_the_dropdown_for_year_field() {
		Select syear=new Select(sdp.getFbap().getYear());
		syear.selectByVisibleText("1996");
	   
	}
	@When("user Click the Gender button")
	public void user_click_the_gender_button() {
		sdp.getFbap().getGender().click();
	   
	}
	@Then("user Click the SignUp button for Create Account")
	public void user_click_the_sign_up_button_for_create_account() {
		sdp.getFbap().getCreated().click();
	 
	}



}