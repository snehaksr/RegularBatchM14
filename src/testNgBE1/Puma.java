package testNgBE1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Puma {
	@Test
	public void puna()
	{
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		 driver.get("https://in.puma.com/");
		 
		 driver.quit();
	}
}
