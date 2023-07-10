package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandFindElementsMethod {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 driver.switchTo().activeElement().sendKeys("bikes");
		 Thread.sleep(2000);
		 List<WebElement>  bikes =driver.findElements(By.xpath("//div[@class='CcAdNb']"));
		 
		 for(int i=0;i<bikes.size();i++) {
			 String bikesOption= bikes.get(i).getText();
			System.out.print(bikesOption);
			 Thread.sleep(1000);
		 }
	}

}
