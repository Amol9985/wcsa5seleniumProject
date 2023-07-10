package PopupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Akash/OneDrive/Desktop/wcsa5workspace/WebEelement/newAlert.html");
	driver.findElement(By.xpath("//button[text()='Click me!']")).click();
	Thread.sleep(2000);
	
	// handle Popup by switch()
	Alert al = driver.switchTo().alert();
	Thread.sleep(2000);
	al.accept();
	
	
	
	
}
}
