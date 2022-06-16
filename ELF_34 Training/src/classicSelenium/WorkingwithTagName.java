package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithTagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Sartaj%20Azeez/Downloads/SampleHTMLPage.html");
		
WebElement link=driver.findElement(By.tagName("radio"));
link.click();
driver.close();
	}

}
