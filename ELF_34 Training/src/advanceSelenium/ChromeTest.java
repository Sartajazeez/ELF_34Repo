package advanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ChromeTest {
	WebDriver driver;
	@BeforeClass
	public void openChrome() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}
	@AfterClass
	public void closeChrom() {
		driver.close();
	}

}
