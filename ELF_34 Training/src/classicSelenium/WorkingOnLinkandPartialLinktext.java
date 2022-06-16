package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnLinkandPartialLinktext {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" ,"./Drivers/ChromeDriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("http://demowebshop.tricentis.com/");
			//WebElement link=driver.findElement(By.linkText("Register"));
			WebElement link=driver.findElement(By.partialLinkText("Reg"));
			link.click();
			}

}
