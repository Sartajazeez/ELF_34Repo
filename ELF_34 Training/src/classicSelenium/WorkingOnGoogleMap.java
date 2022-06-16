package classicSelenium;
import java.util.concurrent.TimeUnit;

    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	
	public class WorkingOnGoogleMap {

		
		public static void main(String[] args) throws InterruptedException  {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/maps/");
			driver.findElement(By.xpath("//img[@class='eYqqWd']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@aria-label='Choose starting point, or click on the map...']")).sendKeys("Bangleore");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='directions-searchbox-0']//button[@data-tooltip='Search']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("Mysore");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='directions-searchbox-1']//button[@data-tooltip='Search']")).click();
}
	}
