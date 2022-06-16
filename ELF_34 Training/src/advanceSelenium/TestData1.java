package advanceSelenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestData1 {

@Test(dataProvider = "Test Data")
public void LoginTestCase(String NAME, int AGE,String Dob) {
	System.out.println(NAME+"  "+AGE);
	//System.out.println(AGE);
}
	
	
	@DataProvider(name="Test Data") 
	public Object[][] dataP() {
		Object[][] data=new Object[3][3];
		data[0][0]="Sartaj";
		data[0][1]=23;
		data[0][2]="11/03/1999";
		data[1][0]="surjith";
		data[1][1]=22;
		data[1][2]="11/09/2000";
		data[2][0]="santhosh";
		data[2][1]=20;
		data[2][2]="11/2/2002";
		
		
		
		return data;
	}
}

