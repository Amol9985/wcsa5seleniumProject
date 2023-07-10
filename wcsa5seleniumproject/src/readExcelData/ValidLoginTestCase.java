package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-o9hva4dl/login.do");
		
		//read the data from excel file and test the login page
	 FileInputStream fis = new FileInputStream("./data/ActiTimeTestdata.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sheet = wb.getSheet("validcreds");
	 Row row = sheet.getRow(1);
	 Cell cell = row.getCell(0);
	 String validUsername = cell.getStringCellValue();
	 
	Thread.sleep(2000);
	
	 
	 FileInputStream fis1 = new FileInputStream("./data/ActiTimeTestdata.xlsx");
	 Workbook wb1 = WorkbookFactory.create(fis1);
	 Sheet sheet1 = wb1.getSheet("validcreds");
	 Row row1 = sheet1.getRow(1);
	 Cell cell1 = row1.getCell(1);
	 String validPassword = cell1.getStringCellValue();
	 
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys(validUsername);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(validPassword); 
		driver.findElement(By.id("loginButton")).click();
	
		
		
	 
	 
	 

	}

}
