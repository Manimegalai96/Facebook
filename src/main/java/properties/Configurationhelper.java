package properties;

import java.io.IOException;

public class Configurationhelper {
	
	
	private Configurationhelper() {
		
		}
	
	
	public static ConfigurationReader getInstanceCR() throws IOException {
		
		ConfigurationReader reader=new ConfigurationReader();
		return reader;

	}
	 

}
