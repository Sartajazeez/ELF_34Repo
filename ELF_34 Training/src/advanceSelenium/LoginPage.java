package advanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Email")
	WebElement emailTF;
	public void email_value(String email) {
		emailTF.sendKeys(email);
	}
	@FindBy(id="Password")
	WebElement passwordTF;
	@FindBy(xpath = "//input[@value='Log in']")
	WebElement loginButton;
	

}
