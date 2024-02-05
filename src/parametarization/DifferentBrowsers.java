package parametarization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DifferentBrowsers {
	
	WebDriver driver;
	
@Parameters("Driver")
@Test
public void browsers(String div)
{
	if(div.equalsIgnoreCase("chrome"))
	{
		driver = new ChromeDriver();
		System.out.println("Hi I am Chrome driver");
		
		Reporter.log("ChromeDriver");
	}
	else if (div.equalsIgnoreCase("edge")) {
		
		driver = new EdgeDriver();
		
       System.out.println("Hi I am Edge driver");
		
		Reporter.log("EdgeDriver");
	}
	else 
	{
		driver = new FirefoxDriver();
		
		System.out.println("Hi I am Firefox Driver");
		
		Reporter.log("FireFox Driver");
	}
		
	
	
}

}
