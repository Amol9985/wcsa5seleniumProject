package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com/");
		driver.findElement(By.id("email")).sendKeys("amolmane");
		
		driver.findElement(By.id("pass")).sendKeys("12345");
		
	}

}
