package advanceSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenTestAssighnmnt {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f1=new File("./testData/Book.xlsx");
		FileInputStream fis=new FileInputStream(f1);
		Workbook wk=WorkbookFactory.create(fis);
		Sheet st=wk.getSheet("Sheet1");
		int rowcount=st.getPhysicalNumberOfRows();
		System.out.println(rowcount);
		int colcount=st.getRow(1).getPhysicalNumberOfCells();
		System.out.println(colcount);
	}
}
