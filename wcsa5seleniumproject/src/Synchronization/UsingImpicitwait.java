package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UsingImpicitwait{
public static void main(String[] args) {
	 WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  WebDriverWait explicitWait=new WebDriverWait(driver,Duration.ofSeconds(15));
	 
	driver.get("https://shoppersstack.com/");
	driver.findElement(By.id("electronics")).click();
	driver.switchTo().activeElement().sendKeys(null);
	driver.findElement(By.linkText("Mobiles")).click();
	driver.findElement(By.xpath("//span[text()='MOBILE PHONE']")).click();
	driver.findElement(By.xpath("//input[@id='Check Delivery']")).click();
	explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='Check']"))).click();
}
}
	 


