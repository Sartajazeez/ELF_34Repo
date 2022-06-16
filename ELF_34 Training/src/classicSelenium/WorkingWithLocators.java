package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLocators {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver" , "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Sartaj%20Azeez/Downloads/LocatorsPractice.html");
	WebElement link=driver.findElement(By.className("Input"));
	link.sendKeys("abcd");
	WebElement Rd=driver.findElement(By.className("username"));
	Rd.click();
	WebElement Bt=driver.findElement(By.className("button"));
	Bt.click();
	WebElement Cd=driver.findElement(By.className("checkbox"));
	Cd.click();
	}
}
