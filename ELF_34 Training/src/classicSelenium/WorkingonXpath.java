package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingonXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String URL="http://demowebshop.tricentis.com/";
		driver.get(URL);
		if(driver.getTitle().contains("Demo"))
			System.out.println("Pass: The website opened");
		else
			System.out.println("Fail:The website didnt opened");
			
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		
		String email="azeezsartaj@gmail.com";
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys(email);
		
		String pswd="Azeez@123";
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys(pswd);
		
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	try {
		if(driver.findElement(By.xpath("//a[@class='ico-logout']")).isDisplayed())
			System.out.println("Pass login succesfully");
	}catch(NoSuchElementException e) {
		System.out.println("Fail user is unable to login");
	}
	
	}

}

