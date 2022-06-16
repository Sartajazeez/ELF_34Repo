package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Workingondropdowns {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
WebElement e=driver.findElement(By.id("products-viewmode"));
Select s1=new Select(e);
s1.selectByVisibleText("Grid");

for(int i=0;i<s1.getSize();i++)
{
	System.out.println(((WebDriver) s1).get(i).getText());
}	

}
}
