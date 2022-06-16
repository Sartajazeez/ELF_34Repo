package classicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class Launchbrowsergecko{
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", " ./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		
	}


	}
	


