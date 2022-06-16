package advanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropdownTask {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]")).click();
	driver.findElement(By.xpath("(//a[@title='Show products in category Notebooks'])[1]")).click();
	driver.findElement(By.id("products-orderby")).click();
	
	Actions act=new Actions(driver);
	
	WebElement sortby = driver.findElement(By.id("products-orderby"));
	act.sendKeys((sortby), Keys.ARROW_DOWN).build().perform();
	
	
//	 String text=driver.findElement(By.id("products-orderby")).getText();
	// System.out.println(text);
	 
	
	
}
}
