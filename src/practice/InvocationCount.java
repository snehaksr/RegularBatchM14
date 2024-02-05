package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class InvocationCount {
	
	WebDriver driver;
@Test(invocationCount = 10)
public void precondition()
{
	 driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://demowebshop.tricentis.com/login");
	
	driver.findElement(By.id("Email")).sendKeys("selvakumarewit@gmail.com");
	
	driver.findElement(By.id("Password")).sendKeys("Welcome@12345");
	
//	driver.quit();
	
	//driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
}

@AfterClass
public void closeBrowser()
{
	driver.quit();
}
}



