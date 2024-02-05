package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecuteDwsHomePage {
@Test
public void receiver()
{
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	DwsHomePage execute = new DwsHomePage(driver);
	//execute.searchField("Sneha");
	//execute.searchbutton();
	
	execute.searchField.sendKeys("sneha");
	execute.searchButton.click();
	
}
}
