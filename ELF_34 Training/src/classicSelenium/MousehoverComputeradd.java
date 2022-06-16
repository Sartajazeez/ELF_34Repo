package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousehoverComputeradd {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//a[@href='/computers'])[1]"))).build().perform();
		act.click(driver.findElement(By.xpath("(//a[@href='/notebooks'])[1]"))).build().perform();
		act.click(driver.findElement(By.xpath("//input[@value='Add to cart']"))).build().perform();
	}

}
