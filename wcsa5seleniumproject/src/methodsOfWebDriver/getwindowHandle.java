package methodsOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowHandle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		
		Thread.sleep(2000);
		String parenthandle = driver.getWindowHandle();
		System.out.println(parenthandle);
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		System.out.println(parenthandle);
		
	}

}
