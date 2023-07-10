
package DataDrivenenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	//to store generic reusable methods
	//all the method are non static

	//this method is used to read a data from excel sheet
	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws  EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;

	}

	//it is use to get last count of row where we store data
	public int getLastRowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		return rc;

	}

	//it is use to write the data in excel sheet
	public void writeExcelData(String exelpath,String sheetName,int rowCount,int cellCount,String data) throws IOException,InterruptedException
		{
		FileInputStream fis = new FileInputStream(exelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(12);
		Cell cell = row.createCell(0);
		cell.setCellValue(data);

		FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
		wb.write(fos);

	}
	
	public String readPropertyData(String propPath, String key) throws IOException
	{
		//read the data from config.properties.
				FileInputStream fis = new FileInputStream("./data/config.properties");
				
				//create a object for properties file
				Properties prop = new Properties();
				
				//To make the file ready to read.
				prop.load(fis);  //load method is parameterized method accept FileInputStream variable 
				
				
				//read the property from file
				String data= prop.getProperty("Password");//getProperty method is parameterized method accept string argument
			
		        return data;
	}
  
}


