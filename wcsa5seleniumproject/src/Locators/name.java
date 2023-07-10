package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class name {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
//		driver.findElement(By.name("pass")).sendKeys("manager");
		
		WebElement usn=driver.findElement(By.name("pass"));
		usn.sendKeys("manager");
	}

}
