package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class takesScreenshot3way {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver cwd=new ChromeDriver();
		 cwd.manage().window().maximize();
		 cwd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 cwd.get("https://www.selenium.dev");
		 
		File src = cwd.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/selenium.png");
		Files.copy(src, dest);
		
		
	}
}
