package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathCase3 {

		public static void main(String[] args) throws InterruptedException {
			   WebDriver driver=new ChromeDriver();
			   driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));;
			   driver.get("https://www.amazon.com/");
			   Thread.sleep(2000);
			   
			   driver.findElement(By.className("//img[@class='_2puWtW _3a3qyb'and @src='https://rukminim1.flixcart.com/flap/80/80/image/ab7e2b022a4587dd.jpg?q=100']")).click();
			   

	}

}
