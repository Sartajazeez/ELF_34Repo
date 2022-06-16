package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingFBvalidation {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	String URL="https://www.facebook.com/";
	driver.get(URL);
	driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
	Thread.sleep(2000);
	String name="Hajira";
	driver.findElement(By.cssSelector("input[aria-label='First name']")).sendKeys(name);
	String surname="Afshan";
	driver.findElement(By.cssSelector("input[aria-label='Sur name']")).sendKeys(surname);
	String email="Hajira@gmail.com";
	driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys(email);
	String passwrd="Axex@123";
	driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys(passwrd);
	driver.findElement(By.cssSelector("button[name='websubmit']")).click();
	
	
}
}
