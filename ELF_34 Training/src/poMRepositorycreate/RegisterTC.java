package poMRepositorycreate;

	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.testng.Reporter;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import advanceSelenium.WorkingwithmultipledataDEMO;


	public class RegisterTC extends BaseClass {
	
		@Test(dataProvider="TestData")
		public void TC_02(String firstname, String password) throws IOException{
		driver.get(PropertyReader.readProp("URL"));
		WelcomePage welcome=new WelcomePage(driver);
		welcome.registerClick();
		RegisterPage register=new RegisterPage(driver);
		register.registerButtonClick();
		register.maleGenderButton();
		register.firstNameSendKeys(firstname);
		register.lastNameSendKeys(lastname);
		register.emailSendKeys(email);
		
	
		HomePage home=new HomePage(driver);
		try {
			if(home.getLogoutLink().isDisplayed()) {
				Reporter.log("PASS: User is logged in", true);
				}
			
		} catch (Exception e) {
			
		}
		login.getLogoutLink().click();
		
	}
		@DataProvider(name="TestData")
		public Object[][] data() throws EncryptedDocumentException, IOException{
			return WorkingwithmultipledataDEMO.datata();
		}
		}

	
	

