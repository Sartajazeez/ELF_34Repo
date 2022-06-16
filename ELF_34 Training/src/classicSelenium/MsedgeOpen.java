package classicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MsedgeOpen {
	public static void main(String[] args)  {
		System.setProperty("webdriver.edge.driver" ,"./Drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		
				
	}

}
