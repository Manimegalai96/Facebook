package FaceBook.com.Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBAccountCreatePage {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "(//a[@role='button'])[2]")
	private WebElement create;
	@FindBy(name="firstname")
	private WebElement firstname;
	@FindBy(name = "lastname")
	private WebElement lastname;
	@FindBy(xpath = "(//input[@data-type='text'])[3]")
	private WebElement mobile;
	@FindBy(id="password_step_input")
	private WebElement newpassword;
	@FindBy(id="day")
	private WebElement day;
	@FindBy(id="month")
	private WebElement month;
	@FindBy (id="year")
	private WebElement year;
	@FindBy(name="sex")
	private WebElement gender;
	@FindBy(name="websubmit")
	private WebElement created;
	
	
	
	public FBAccountCreatePage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getCreate() {
		return create;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getMobile() {
		return mobile;
	}
	public WebElement getNewpassword() {
		return newpassword;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getGender() {
		return gender;
	}
	public WebElement getCreated() {
		return created;
	
	
	

}}

