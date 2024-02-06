package dataDrivenPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	WebDriver driver;
@BeforeClass

public void openBrowser()
{
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://admin-demo.nopcommerce.com/login");
}

@Test(dataProvider = "login")
public void page(String user,String pass,String res)
{
	
	
	WebElement email = driver.findElement(By.id("Email"));
	
	email.clear();
	email.sendKeys(user);
	
	WebElement password = driver.findElement(By.id("Password"));
	
	password.clear();
	
	password.sendKeys(pass);
	
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	
	String current_title = driver.getTitle();
	String given_title = "Dashboard / nopCommerce administration";
	
	if(res.equals("Valid"))
	{
		if(current_title.equals(given_title))
		{
			driver.findElement(By.linkText("Logout")).click();
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	else if(res.equals("Invalid"))
	{
		if(current_title.equals(given_title))
		{
			driver.findElement(By.linkText("Logout")).click();
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
		}
	}
}

@DataProvider(name="login")

public String [][] getdata()
{
	
	String logindata [] []  = {
			
			{"admin@yourstore.com",	"admin",	"Valid"},
			{"admin@yourstore.com",	"adm",	"Invalid"},
			{"adm@yourstore.com	","admin",	"Invalid"},
			 {"adm@yourstore.com",	"adm",	"Invalid"},
	};
	
	return logindata;
	
}
@AfterClass

public void close()
{
	driver.quit();
}
}
