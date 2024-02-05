package assertion;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

@Test
public class SoftAssert {
	public void dws()
	{
	    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	    driver.get("https://demowebshop.tricentis.com/");
	    
	    String given_Url = "https://demowebshop.tricentis.com/";
	    
	    String current_Url = driver.getCurrentUrl();
	    
	    SoftAssert soft_assert = new SoftAssert();
	    
	  //  soft_assert. assertEquals(given_Url, current_Url);
	    
}
}
