package assertion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hardAssert {
@Test
public void dws()
{
    WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
    driver.get("https://demowebshop.tricentis.com/");
    
    String given_Url = "https://demowebshop.tricentis.com/";
    
    String current_Url = driver.getCurrentUrl();
    
    Assert. assertEquals(given_Url, current_Url);
    
  //  Assert.assertNotEquals(given_Url, current_Url);
    
    
	
	
}
}
