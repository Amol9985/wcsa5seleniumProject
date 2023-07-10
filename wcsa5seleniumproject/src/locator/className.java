package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class className {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com/");
Thread.sleep(2000);
driver.switchTo().activeElement().sendKeys("shoes" ,Keys.ENTER);
driver.findElement(By.className("landscape-image")).click();
	

	
}
}
