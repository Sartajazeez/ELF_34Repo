package advanceSelenium;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reoprts_extentreports {
	public static void main(String[] args) {
		LocalDateTime sysetmdate=LocalDateTime.now();
		String   ReportName=sysetmdate.toString().replaceAll(":","-");
		ExtentReports report=new ExtentReports("./Reports/"+ReportName+"ExtentReports.html",false);
		ExtentTest test=report.startTest("ExtendDemo");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		test.log(LogStatus.INFO, "Browser is open");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		
		driver.get("https://www.zomato.com/");
		test.log(LogStatus.INFO, "page is displayed");
		WebElement scrollEle=driver.findElement(By.xpath("//h5[text()='Sarjapur Road']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scrollEle);
		test.log(LogStatus.PASS,"Page is scrolled");
		test.log(LogStatus.FATAL,"Header is not displayed");
		report.endTest(test);
		report.flush();
		 }

}
