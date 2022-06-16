package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCutCopyPaste {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement e=driver.findElement(By.xpath("//input[@data-testid='royal_mail']"));
		
		e.sendKeys("sartajazez1104#23");
		e.sendKeys(Keys.CONTROL+"a");
		e.sendKeys(Keys.CONTROL+"x");
		
		Thread.sleep(2000);
		
		WebElement e1=driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
		
		e1.sendKeys(Keys.CONTROL+"v");
      
	     }
   }
