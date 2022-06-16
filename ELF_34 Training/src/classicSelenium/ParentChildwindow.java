package classicSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildwindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		 String windowhandle=driver.getWindowHandle();
		 driver.findElement(By.xpath("//button[@id='windowButton']"));
		 Set<String> windowhandles=driver.getWindowHandles();
		 for(String s:windowhandles) {
			 if(s.contains(windowhandle)==false) {
				 driver.switchTo().window(s);
				 driver.close();
				 
				 
				 
				
			 }
		 }
		 
		 
		 
		
		
	}

}
