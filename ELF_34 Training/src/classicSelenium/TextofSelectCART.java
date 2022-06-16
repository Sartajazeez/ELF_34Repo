package classicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TextofSelectCART {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sartaj%20Azeez/Downloads/demo.html");
		WebElement dropdown=driver.findElement(By.id("standard_cars"));
		
		Select drop=new Select(dropdown);
		List<WebElement> optionElements=drop.getOptions();
		for(int i=0;i<optionElements.size();i++) {
			Select a1=new Select(driver.findElement(By.id("standard_cars")));
			a1.selectByIndex(i);
			System.out.println(optionElements.get(i).getText());
		}
	
}
}
