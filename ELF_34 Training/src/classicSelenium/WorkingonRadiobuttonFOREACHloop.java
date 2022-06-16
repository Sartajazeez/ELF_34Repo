package classicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingonRadiobuttonFOREACHloop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
	List<WebElement> list=driver.findElements(By.xpath("//input[@type='radio']"));
	for(WebElement web: list)
	{
		Thread.sleep(3000);
		web.click();
	}
				
	}

}
