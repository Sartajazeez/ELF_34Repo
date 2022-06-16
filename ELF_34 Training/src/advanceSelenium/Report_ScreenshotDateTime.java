package advanceSelenium;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Report_ScreenshotDateTime {
	static WebDriver driver;
	public static void main(String[] args) {
		LocalDateTime sysetmdate=LocalDateTime.now();
		String   ReportName=sysetmdate.toString().replaceAll(":","-");
		ExtentReports report=new ExtentReports("./Reports/"+ReportName+"ExtentReports.html",false);
		ExtentTest test=report.startTest("ExtendDemo");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		test.log(LogStatus.INFO, "Browser is open");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		
		driver.get("https://www.zomato.com/");
		test.log(LogStatus.INFO, "page is displayed");
		WebElement scrollEle=driver.findElement(By.xpath("//h5[text()='Sarjapur Road']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scrollEle);
		test.log(LogStatus.PASS,"Page is scrolled");
		test.log(LogStatus.INFO, test.addScreenCapture(screenCapture()));
		test.log(LogStatus.FATAL,"Header is not displayed");
		report.endTest(test);
		report.flush();

	}
	public static String screenCapture() {
		LocalDateTime sysDate=LocalDateTime.now();
		String ScreenShotName=sysDate.toString().replaceAll(":","-");
		String imPath="./Screenshots/"+ScreenShotName+".png";
		TakesScreenshot ts=(TakesScreenshot)driver;
	File temp=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(imPath);
	
try {
	FileHandler.copy(temp, dest);
	
}catch (IOException e){
	System.out.println("Exception Handled");
	}
return "."+imPath;
	}

}
