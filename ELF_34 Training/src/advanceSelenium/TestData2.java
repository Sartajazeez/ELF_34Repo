package advanceSelenium;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestData2 {
	@Test(dataProvider="TestData")
	public void LoginTestCase(String name, String degree, String stream,String yearofpass ) {
		System.out.println(name+degree+stream+yearofpass);
	}
	@DataProvider(name="TestData")
	public Object[][] test() throws EncryptedDocumentException, IOException {
		return WorkingwithMultipleReadData.datata();
	}


}
