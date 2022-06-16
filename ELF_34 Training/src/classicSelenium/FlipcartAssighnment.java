package classicSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartAssighnment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String pw=driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
	    driver.findElement(By.xpath("(//div[@class='_HYyiu'])[1]")).click();
	    driver.findElement(By.xpath("//div[text()='realme C20 (Cool Blue, 32 GB)']")).click();	
	Set<String> allwin=driver.getWindowHandles();
	for(String s:allwin) {
		if(!s.equals(pw)) {
			driver.switchTo().window(s);
		}
	}
		
	
	driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']")).sendKeys("577101");
	driver.findElement(By.xpath("(//span[contains(text(),'Ch')])[1]")).click();
	driver.findElement(By.xpath("ADD TO CART")).click();
		
		
		
    

		
		
		
		
		

	}

}