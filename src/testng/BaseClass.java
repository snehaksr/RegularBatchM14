package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
public WebDriver driver;

@BeforeClass
public void precondition()
{
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://demowebshop.tricentis.com/");
}
@BeforeMethod
public void login()

{
	System.out.println("Login is successful");
}

@AfterMethod

public void logout()
{
	System.out.println("Logout successful");
}
@AfterClass
public void postcondition()
{
	driver.quit();
}
}
