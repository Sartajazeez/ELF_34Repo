package advanceSelenium;

import org.testng.annotations.Test;

public class FireFoxTestCase extends FireFoxTest{
	@Test
	public void Tc() {
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
	}

}
