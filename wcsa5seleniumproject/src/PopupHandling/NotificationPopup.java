package PopupHandling;

import org.openqa.selenium.WebDriver;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
public class NotificationPopup {
	
	public static void main(String[] args) {
		
    WebDriver driver;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the browserValue!!!");
	String browserValue = sc.next();
	
	if(browserValue.equalsIgnoreCase("Chrome"))
	{
	// handle notification popup
	 ChromeOptions co = new ChromeOptions();
	 co.addArguments("--disable-notifications");
	 driver = new ChromeDriver(co);
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.get("https://www.easemytrip.com/");
	// driver.quit();
	
	}
	else if (browserValue.equalsIgnoreCase("firefox"))
	{
		// handle notification popup
		FirefoxOptions fo = new FirefoxOptions();
		 fo.addArguments("--disable-notifications");
		 driver = new FirefoxDriver(fo);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.easemytrip.com/");
		// driver.quit();
	}

	else if (browserValue.equalsIgnoreCase("Edge"))
	{
		// handle notification popup
		EdgeOptions eo = new EdgeOptions();
		 eo.addArguments("--disable-notifications");
		 driver = new EdgeDriver(eo);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.easemytrip.com/");
		// driver.quit();
	}
	else
	{
		System.out.println("Enter valid browserValue!!!");
	}
	}
}



