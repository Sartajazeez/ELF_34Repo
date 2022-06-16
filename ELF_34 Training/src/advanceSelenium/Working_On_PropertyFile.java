package advanceSelenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Working_On_PropertyFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./testData/config.properties");
		Properties property=new Properties();
		property.load(fis);
		System.out.println(property.getProperty("URL"));
		
	}

}
