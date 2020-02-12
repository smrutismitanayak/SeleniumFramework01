package KRN.ActiTime.Baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {

	public String getExcelData(String sheetName,int rowNo,int cellNo)
	{
		String retVal=""; 
		
		try {
			FileInputStream fs=new FileInputStream("E:\\Maven_Project\\ActiTime\\data.xlsx");
			try {
				Workbook wb=WorkbookFactory.create(fs);
				Sheet sh=wb.getSheet(sheetName);
				Row ro=sh.getRow(rowNo);
				Cell cell=ro.getCell(cellNo);
				retVal=cell.getStringCellValue();
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvalidFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return retVal;
		
	}
	
}
