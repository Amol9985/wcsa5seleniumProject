package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bluestone {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.bluestone.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("denyBtn")).click(); 
	//handle the frame by switch method
	driver.switchTo().frame(3);
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	//wait.until(ExpectedCondition.elementtobeclickebal).(By.id("chat-icon")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath(""))
	}

}
