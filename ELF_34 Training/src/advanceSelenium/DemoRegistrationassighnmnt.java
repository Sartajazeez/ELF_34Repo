package advanceSelenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoRegistrationassighnmnt {
	@Test(dataProvider = "TestData")
	public void testcaCase(String firstname, String lastname, String email, String password, String confirm) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(firstname);
		driver.findElement(By.xpath("")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(confirm);
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		
		
		if(driver.findElement(By.xpath("//a[@class='ico-logout']")).isDisplayed()) {
			System.out.println("PASS: user is succesfully registered");
		} else {
			System.out.println("FAIL:user is unable to register");}
		
		driver.close();
	}
	@DataProvider(name="TestData",parallel=true)
	public Object [][] dataP() throws EncryptedDocumentException, IOException {
		return WorkingOnDEMORegisterAssighnment.datata();
	}
}