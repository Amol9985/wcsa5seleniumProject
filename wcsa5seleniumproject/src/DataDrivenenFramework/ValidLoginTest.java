package DataDrivenenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTest {

	public static void main(String[] args)  throws InterruptedException, EncryptedDocumentException, IOException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-o9hva4dl/login.do");
		
		Flib flib = new Flib();
		driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/ActiTimeTestdata.xlsx","validcreds", 1, 0));
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActiTimeTestdata.xlsx","validcreds", 1, 1));
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000);
		driver.close();

	}
}
