package advanceSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.reporters.jq.Main;

public class ReadExcel {

		static File file=new File("./testData/ELF.xlsx");
		static FileInputStream fis;
	    static Workbook workbook;
		static Sheet sheet;
		
		public static String readStringvalue(String SheetName, int RowNum, int ColNum) throws EncryptedDocumentException, IOException {
		
			fis=new FileInputStream(file);
			workbook=WorkbookFactory.create(fis);
			sheet=workbook.getSheet(SheetName);
			return sheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
		}
		public static double readNumericValue(String SheetName, int RowNum, int ColNum) throws EncryptedDocumentException, IOException {
			fis=new FileInputStream(file);
			workbook=WorkbookFactory.create(fis);
			sheet=workbook.getSheet(SheetName);
			return sheet.getRow(RowNum).getCell(ColNum).getNumericCellValue();
			
		}
		public static Date readDateValue(String SheetName, int RowNum, int ColNum) throws EncryptedDocumentException, IOException {
			fis=new FileInputStream(file);
			workbook=WorkbookFactory.create(fis);
			sheet=workbook.getSheet(SheetName);
			return sheet.getRow(RowNum).getCell(ColNum).getDateCellValue();
		
		}
			public static void main(String[] args) {
				
				
			}
		}
	




