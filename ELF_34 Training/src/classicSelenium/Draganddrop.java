package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		 Actions action=new Actions(driver);
		
		WebElement source=driver.findElement(By.xpath("//div[@id='box4']"));
		 WebElement  target=driver.findElement(By.xpath("//div[@id='box104']"));
		 action.dragAndDrop(source,target).perform();
		
		 WebElement source1=driver.findElement(By.xpath("//div[@id='box7']"));
		 WebElement  target1=driver.findElement(By.xpath("//div[@id='box107']"));
		action.dragAndDrop(source1, target1).perform();
		
		WebElement source2=driver.findElement(By.xpath("//div[@id='box2']"));
		 WebElement  target2=driver.findElement(By.xpath("//div[@id='box102']"));
		action.dragAndDrop(source2, target2).perform();
		
		WebElement source3=driver.findElement(By.xpath("//div[@id='box6']"));
		 WebElement  target3=driver.findElement(By.xpath("//div[@id='box106']"));
		action.dragAndDrop(source3, target3).perform();
		
		WebElement source4=driver.findElement(By.xpath("//div[@id='box5']"));
		 WebElement  target4=driver.findElement(By.xpath("//div[@id='box105']"));
		action.dragAndDrop(source4, target4).perform();
		
		WebElement source5=driver.findElement(By.xpath("//div[@id='box1']"));
		 WebElement  target5=driver.findElement(By.xpath("//div[@id='box101']"));
		action.dragAndDrop(source5, target5).perform();
		
		WebElement source6=driver.findElement(By.xpath("//div[@id='box3']"));
		 WebElement  target6=driver.findElement(By.xpath("//div[@id='box103']"));
		action.dragAndDrop(source6, target6).perform();
		
		
	}

}
