package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithIDRegistersuccsful {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		String dtitle=driver.getTitle();
		if(dtitle.contains("Demo")) {
			System.out.println("PASS");
		}
		
		driver.findElement(By.className("ico-register")).click();
		String rgst=driver.getTitle();
		if(rgst.contains("Register")) {
			System.out.println("Pass:User succesfully registtered");
		}
	    driver.findElement(By.id("gender-male")).click();
	    String fn="Sartj";
	    driver.findElement(By.id("FirstName")).sendKeys(fn);
	    String ln="Azeez";
	    driver.findElement(By.id("LastName")).sendKeys(ln);
	    String ml="ssas2a@gmail.com";
	    driver.findElement(By.id("Email")).sendKeys(ml);
	    String pwd="sartaj@898";
	    driver.findElement(By.id("Password")).sendKeys(pwd);
	    String cpwd="sartaj@898";
	    driver.findElement(By.id("ConfirmPassword")).sendKeys(cpwd);
	    driver.findElement(By.id("register-button")).click();
	    if(driver.findElement(By.className("ico-logout")).isDisplayed())
	    {
	    	System.out.println("Passss");
	    	driver.close();
	    }
	}

}
