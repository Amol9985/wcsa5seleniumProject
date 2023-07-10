package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		//Write the data in excel sheet.
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet= wb.getSheet("IPL");
//		Row row = sheet.getRow(2);
//		Row row = sheet.createRow(12);
//		Row row = sheet.createRow(14);
		Row row = sheet.createRow(15);
		
		//creat the cell by using row(I)
		Cell cell = row.createCell(0);
		
		
		//write the data into the cell
		cell.setCellValue("Ravi");
		
		FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
		wb.write(fos);
		
		
		
		
	}

}
