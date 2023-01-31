package FaceBook.com.Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBHomePage {
	public static WebDriver driver;
	@FindBy(id="email")
	private WebElement name;
	@FindBy(id="pass")
	private WebElement pass;
	@FindBy(name="login")
	private WebElement login;
	
	
	
	
	public FBHomePage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);;
	}
	public static WebDriver getDriver() {
		return driver;
	}
	
	public WebElement getName() {
		return name;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}
	
		
	}


