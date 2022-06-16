package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectAllFaceBook {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement w=driver.findElement(By.xpath("//div[@id='email_container']"));
		w.sendKeys("Myname is KHAN");
		w.sendKeys(Keys.CONTROL+"a");
		Thread.sleep
		(3000);
		w.sendKeys(Keys.BACK_SPACE);	
}
}