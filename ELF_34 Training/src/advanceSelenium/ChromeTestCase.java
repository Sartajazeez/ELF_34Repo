package advanceSelenium;

import org.testng.annotations.Test;

public class ChromeTestCase extends  ChromeTest{
	@Test
	public void TC() {
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
	}
}
