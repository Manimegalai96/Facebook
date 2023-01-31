package FaceBook.com.Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FacebookSDP {
	
	public static WebDriver driver;
	
	
	private FBHomePage fbhp;
	private FBAccountCreatePage fbap;
	
	
	public FacebookSDP(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public static WebDriver getDriver() {
		
		return driver;
	}
	public FBHomePage getFbhp() {
		if(fbhp==null) {
			fbhp=new FBHomePage(driver);
		}
		return fbhp;
		
		
	}
	public FBAccountCreatePage getFbap() {
		if(fbap==null) {
			fbap=new FBAccountCreatePage(driver);}
		return fbap;
	}

}
