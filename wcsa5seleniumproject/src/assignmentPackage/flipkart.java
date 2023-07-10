package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
public static void main(String[] args) throws InterruptedException {
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.flipkart.com/");
   Thread.sleep(2000);
   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
   driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Lenevo laptop");
   driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//button[@class='L0Z3Pu']\")).click();]")).click();
   Thread.sleep(3000);
   driver.findElement(By.xpath("//div[text()='Core i5']")).click();
   Thread.sleep(5000);
   driver.findElement(By.xpath("//div[text()='Brand']")).click();
   Thread.sleep(3000);
   driver.findElement(By.xpath("//div[text()='Lenovo']")).click();
   Thread.sleep(2000);
   driver.quit();
   
   
   
   
   
   
   
   



	   
}
}
