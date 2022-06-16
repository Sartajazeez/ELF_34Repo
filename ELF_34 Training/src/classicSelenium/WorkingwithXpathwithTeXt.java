package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithXpathwithTeXt {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	String url="http://demowebshop.tricentis.com/";
	driver.get(url);
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	driver.findElement(By.xpath("//a[text()='Shopping cart']")).click();
	driver.findElement(By.xpath("//a[text()='Wishlist']")).click();
}
}
 