package poMRepositorycreate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class RegisterPage {
	RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='gender-male']")
	private WebElement maleGender;
	public void maleGenderButton() {
		maleGender.click();
	}
	
	@FindBy(xpath = "//input[@id='gender-female']")
	private	WebElement femaleGender;
	public void femaleGenderButton() {
		femaleGender.click();
	}
	
	@FindBy(xpath = "//input[@name='FirstName']")
	private WebElement firstName;
	public void firstNameSendKeys(String firstname) {
		firstName.sendKeys(firstname);
	}
	
	@FindBy(xpath = "//input[@name='LastName']")
	private WebElement lastName;
	public void lastNameSendKeys(String lastname) {
		lastName.sendKeys(lastname);
	}
	
	@FindBy(xpath = "//input[@name='Email']")
	private WebElement email;
	public void emailSendKeys(String value) {
		email.sendKeys(value);
	}
	
	@FindBy(xpath = "//input[@name='Password']")
	private WebElement password;
	public void passwordSendKeys(String value) {
		password.sendKeys(value);
	}
	
	@FindBy(xpath = "//input[@name='ConfirmPassword']")
	WebElement confirmPassword;
	public void confirmPasswordSendKeys(String value) {
		confirmPassword.sendKeys(value);
	}
	
	@FindBy(xpath = "//input[@name='register-button']")
	private WebElement registerButton;
	public void registerButtonClick() {
		registerButton.click();
	}
	public WebElement getMaleGender() {
		return maleGender;
	}
	public WebElement getFemaleGender() {
		return femaleGender;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getConfirmPassword() {
		return confirmPassword;
	}
	public WebElement getRegisterButton() {
		return registerButton;
	}
	public void setMaleGender(WebElement maleGender) {
		this.maleGender = maleGender;
	}
	public void setFemaleGender(WebElement femaleGender) {
		this.femaleGender = femaleGender;
	}
	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}
	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public void setConfirmPassword(WebElement confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public void setRegisterButton(WebElement registerButton) {
		this.registerButton = registerButton;
	}
}