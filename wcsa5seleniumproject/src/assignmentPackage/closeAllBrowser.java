package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeAllBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

			WebDriver driver = new  ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30) );
			
			// launch the chlid window
			driver.get("http://omayo.blogspot.com/");
			Thread.sleep(2000);
	     
			
			
			WebElement childwindow = driver.findElement(By.partialLinkText("Open a popup window"));
			Point element = childwindow.getLocation();
			
			int xaxis = element.getX();
			int yaxis = element.getY();
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-80)+")");
			
			childwindow.click();
			
			
	}

}
