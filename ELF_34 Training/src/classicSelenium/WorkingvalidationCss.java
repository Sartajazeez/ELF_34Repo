package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingvalidationCss {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("books ");
	driver.findElement(By.cssSelector("input[class='button-1 search-box-button']")).click();
	try {
	if(driver.findElement(By.cssSelector("input[value='computer']")).isDisplayed()) {
		System.out.println("pass:search is succesful");
	}
	}
	catch(NoSuchElementException e) {
		System.out.println("Fail: serch is unsuccessful");
	}
}
}
