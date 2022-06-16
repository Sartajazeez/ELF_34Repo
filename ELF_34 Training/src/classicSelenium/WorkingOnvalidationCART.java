package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnvalidationCART {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	String url="http://demowebshop.tricentis.com/";
	driver.get(url);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	driver.findElement(By.xpath("//span[@class='close']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='cart-label']")).click();
	driver.findElement(By.xpath("//table[1][@class='cart']//tr[1]//td[3]//a")).click();
}
}
