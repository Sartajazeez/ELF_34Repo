package advanceSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingOnDEMORegisterAssighnment {
	public static Object[][] datata() throws EncryptedDocumentException, IOException {
		File file=new File("./testData/Thanos.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("Sheet1");
		int rowCount=sheet.getPhysicalNumberOfRows();
		int colCount=sheet.getRow(1).getPhysicalNumberOfCells();
		Object [][] data=new Object[rowCount-1][colCount];
		
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return data;
}
 }
