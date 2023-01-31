package properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties p;
	
	 public ConfigurationReader() throws IOException {
		
	
		
		File f=new File("C:\\Users\\Manimegalai\\Desktop\\Selenium\\Facebook\\src\\main\\java\\properties\\FB.properties");
		
		FileInputStream fis= new FileInputStream(f);
		
		p=new Properties();
		
		p.load(fis);
	 }
		
		
		
		
	
	
	public static String getbrowser() {
		
		String browserlaunch = p.getProperty("browser");
		return browserlaunch;
		

	}
	
	public static String getUrl() {
		String url = p.getProperty("url");
		return url;
		

		
	}
	public static String getSheet() {
		
		String sheet = p.getProperty("sheet");
		return sheet;

	}
	
	public static String getSheetpath() {
		String path = p.getProperty("sheetpath");
		return path;

	}
	
	

	}


