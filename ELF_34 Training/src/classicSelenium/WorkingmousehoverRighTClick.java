package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingmousehoverRighTClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe ");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"))).contextClick();
		//Thread.sleep(2000);
		//act.click(driver.findElement(By.xpath("//a[@data-reactid='31']"))).build().perform();
		//Thread.sleep(2000);
		//driver.close();

}
}