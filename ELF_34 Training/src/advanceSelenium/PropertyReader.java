package advanceSelenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader { 
	public static String reader(String filename, String key ) throws IOException {
		FileInputStream fis=new FileInputStream(filename);
		Properties propertry=new Properties();
		propertry.load(fis);
		return propertry.getProperty(key);	
	}
	
public static void main(String[] args) throws IOException {
	PropertyReader.reader("./testData/config.properties","URL");
	
}
  }
