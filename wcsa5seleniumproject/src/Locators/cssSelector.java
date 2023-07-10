package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com/");
	//	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("amolmane");
		
	//	driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("amolmane");
		
	//	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("amolmane");
		
	//	driver.findElement(By.cssSelector("input[id$='l']")).sendKeys("amolmane");
		
	//	driver.findElement(By.cssSelector("input[id*='e']")).sendKeys("amolmane");
		
		driver.findElement(By.cssSelector("input[id^='e']")).sendKeys("amolmane");
		
		
	}
		
		

}
