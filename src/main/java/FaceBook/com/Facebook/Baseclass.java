package FaceBook.com.Facebook;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	
	public static void UserInput(WebElement element,String value) throws Exception {
		try {
			if (isdisplayed(element)&&isEnable(element)) {
				element.sendKeys(value);
			} 
			
		} catch (Exception e) {
			
			
			e.printStackTrace();
		}
		
		
			}
			
			
	public static void sleep() throws InterruptedException {
   Thread.sleep(2000);
	}
	
	public static void click(WebElement element) throws Exception {

	try {
		if (isdisplayed(element)) {
			element.click();
			
		
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
		 
	
		

	
		
	

	}
	
	public static String passText(WebElement element) {
		String get_Text = element.getText();
		System.out.println(get_Text);
		return get_Text;
		
			}
	
	
	
	
	
	
	
	
	public static void clear(WebElement element) {
		
		try {
			element.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}
	
	public static boolean isSelected(WebElement element) {
		
		boolean selected = element.isSelected();
		System.out.println(selected);
		return selected;

	}
	
	public static boolean isEnable(WebElement element) {
		
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
		return enabled;
	}
public static boolean isdisplayed(WebElement element) {
		
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
		return displayed;

}





public static void getAttribute(WebElement element,String Value) {
 String attribute=element.getAttribute(Value);
 System.out.println(attribute);
 

}
public static WebDriver browserLaunch(String browser) {

	if (browser.equalsIgnoreCase("chrome")) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver(options);
	} else if (browser.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
	} else if (browser.equalsIgnoreCase("gecko")) {

		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();

	} else {
		System.out.println("invalid browser");
	}
	return driver;
}

public static void maximize() {
	driver.manage().window().maximize();
}
public static void close() {
	driver.close();
}
public static void quit() {
	driver.quit();
}


public static void navigateTo(String url) {
	driver.navigate().to(url);
}

public static void navigateBack() {
	driver.navigate().back();
}
public static void navigateForward() {
	driver.navigate().forward();
}
public static void navigateRefresh() {
	driver.navigate().refresh();
}

public static String getTitle() {
	String title = driver.getTitle();
	System.out.println(title);
	return title;
}

public static String getCurrentUrl() {
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	return currentUrl;
}
public static void launchUrl(String url) {
	driver.get(url);
}


public static String getWindow() {
	String windowHandle = driver.getWindowHandle();
	return windowHandle;
}

public static Set<String> getMultileWindow() {
	Set<String> windowHandles = driver.getWindowHandles();
	return windowHandles;
	
}public static void fullScreen() {
	driver.manage().window().fullscreen();}

public static void keydown() throws AWTException {
Robot r=new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

}
public static void KeyEnter() throws AWTException {
Robot r=new Robot();
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

	
}
public static void alertSendkeys(String Value) {
	driver.switchTo().alert().sendKeys(Value);

}
public static void alert(String option) {
	Alert alert = driver.switchTo().alert();
	try {
		if (option.equalsIgnoreCase("ok")) {
			alert.accept();
			
		}else if(option.equalsIgnoreCase("cancel")) {
			alert.dismiss();
			
		}else {
			throw new Exception();
			
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}

public static void frame(WebElement element ) {
	
	try {
		driver.switchTo().frame(element);
	} catch (Exception e) {
		e.printStackTrace();
	}

}
public static  void defaultcontent() {

	try {
		driver.switchTo().defaultContent();
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public static void parentframe() {
	
	try {
		driver.switchTo().parentFrame();
	} catch (Exception e) {
		e.printStackTrace();
	}
	

}
public static void totalframe(List<WebElement> element) {
	
	int size = element.size();
	System.out.println(size);

}
public static void isMultiple(WebElement element) {
Select s=new Select(element);
try {
	boolean multiple = s.isMultiple();
	System.out.println(multiple);
} catch (Exception e) {
	e.printStackTrace();
}
	
}
public static void mouseActions(String option, WebDriver driver,WebElement element) {
	
	Actions action = new Actions(driver);
	  try {
		if(option.equalsIgnoreCase("move")) {
		   action.moveToElement(element).build().perform();
		  }else if(option.equalsIgnoreCase("click")) {
		   action.click(element).perform();

}
	} catch (Exception e) {
		e.printStackTrace();
	}
	  }

public static void selectdropdown(WebElement element,String option,String Value) {
	Select sel= new Select(element);
	try {
		if (option.equalsIgnoreCase("text")) {
			sel.selectByVisibleText(Value);
			}
		else if (option.equalsIgnoreCase("value")) {
		sel.selectByValue(Value);
			
		}
		else if (option.equalsIgnoreCase("index")) {
			int parse = Integer.parseInt(Value);
			
			sel.selectByIndex(parse);
			
		}
	} catch (NumberFormatException e) {
		e.printStackTrace();
	}
	
	
	

}
public static void screenshot() throws IOException {
	
	Date date=new Date();
	SimpleDateFormat da=new SimpleDateFormat("dd/MM/yyyy HH-mm-ss");
	String dateformat = da.format(date);
	String replace = dateformat.replace("/","-");
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination= new File("C:\\Users\\Manimegalai\\Desktop\\Selenium\\MavenSpt\\Screenshot\\"+replace+".png");
	FileUtils.copyFile(source, destination);
	
	

}



}


	  
	  



















 