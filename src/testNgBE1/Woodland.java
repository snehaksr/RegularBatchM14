package testNgBE1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Woodland {
	@Test()
	public void woodland()
	{
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		 driver.get("https://www.woodlandworldwide.com/");
		 
		 driver.quit();
	}
}
