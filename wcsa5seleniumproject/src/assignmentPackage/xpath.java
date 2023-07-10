package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=3fh5os8d8djpj");
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("maneamol290@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Amol@9985");
		driver.findElement(By.xpath("//a[contains(@id,'loginButton')] l")).click();
	}

}
