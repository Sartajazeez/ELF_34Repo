package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingon_iFrame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.switchTo().frame(0);
	//	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='FR1']")));
	// driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//a[@title='Entertainment News']")).click();
	
}
}
