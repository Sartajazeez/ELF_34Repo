package advanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class FireFoxTest {
	WebDriver driver;
	@BeforeClass
	public void openFire() {
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
	}
	@AfterClass
	public void closeFire() {
		driver.close();
	}
	

}
