package poMRepositorycreate;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
	LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement emailTextField;
	public void emailSendKeys(String value) {
		emailTextField.sendKeys(value);
	}
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement passwordTextField;
	public void passwordSendKeys(String value) {
		passwordTextField.sendKeys(value);
	}
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;
	public void loginButtonClick() {
		loginButton.click();
	}
	@FindBy(className =  "ico-logout")
	private WebElement logoutLink;
	
	public void logoutLinkClick() {
		logoutLink.click();
		
	}
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	public void setLogoutLink(WebElement logoutLink) {
		this.logoutLink = logoutLink;
	}
	@FindBy(xpath = "//input[@id='small-searchterms']")
	private WebElement searchTextField;
	public void search(String value) {
		searchTextField.sendKeys(value);
	}
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement searchButton;
	public void searchButtonClick() {
		searchButton.click();
	}
	public void searchAndClick(String value) {
		searchTextField.sendKeys(value);
		searchButton.click();
	}
	public WebElement getEmailTextField() {
		return emailTextField;
	}
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getSearchTextField() {
		return searchTextField;
	}
	public WebElement getSearchButton() {
		return searchButton;
	}
	public void setEmailTextField(WebElement emailTextField) {
		this.emailTextField = emailTextField;
	}
	public void setPasswordTextField(WebElement passwordTextField) {
		this.passwordTextField = passwordTextField;
	}
	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
	public void setSearchTextField(WebElement searchTextField) {
		this.searchTextField = searchTextField;
	}
	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}

}

