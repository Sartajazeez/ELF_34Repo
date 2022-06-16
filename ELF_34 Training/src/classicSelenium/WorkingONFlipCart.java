package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingONFlipCart {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	String url="https://www.flipkart.com/";
	driver.get(url);
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("sartajazeez1103@gmail.com");
	driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("880809876");
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	driver.findElement(By.xpath("(//input[@class='_2IX_2- _2LYh3d VJZDxU'])")).click();
	//driver.findElement(By.xpath("(//span[text()='CONTINUE'])")).click();
}
}
