package classicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingtoWebpage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
		//open url
		//driver.get("http://demowebshop.tricentis.com/");
		driver.navigate().to("http://demowebshop.tricentis.com/");
		//refresh page
		driver.navigate().refresh();
		//wait for 2seconds
		Thread.sleep(2000);
		//move back
		driver.navigate().back();
		//forward
		Thread.sleep(2000);
		driver.navigate().forward();
	}

}
