package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WorkingwithCSSelector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sartaj%20Azeez/Downloads/LocatorsPractice.html");
		driver.findElement(By.cssSelector("input[class='username']")).sendKeys("Nameabc");
		driver.findElement(By.cssSelector("input[class='password']")).sendKeys("Password123");
		driver.findElement(By.cssSelector("input[class='checkbox']")).click();
		driver.findElement(By.cssSelector("input[name='a']")).click();
		driver.findElement(By.cssSelector("input[value='submit']")).click();
		
	}

}
