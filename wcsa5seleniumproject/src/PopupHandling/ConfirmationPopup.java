package PopupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {
public static void main(String[] args) throws InterruptedException {
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("file:///C:/Users/Akash/OneDrive/Desktop/wcsa5workspace/WebEelement/confirm.html");

driver.findElement(By.tagName("input")).click();
Thread.sleep(2000);

    Alert al = driver.switchTo().alert();
    Thread.sleep(3000);
   al.accept();
   driver.quit();
}
}
