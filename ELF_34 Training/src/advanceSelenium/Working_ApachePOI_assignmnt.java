package advanceSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Working_ApachePOI_assignmnt {

 public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("./testData/ELF.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("Sheet1");
		java.util.Date Date=sheet.getRow(1).getCell(2).getDateCellValue();
		String name=sheet.getRow(2).getCell(3).getStringCellValue();
		Double age=sheet.getRow(2).getCell(2).getNumericCellValue();
		
		
		}

}
