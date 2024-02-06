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

public class DataDriven1 {
	WebDriver driver;
@BeforeClass

public void dws()
{
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}

@Test(dataProvider = "login")
public void exceldata(String user,String pass,String res)
{
	driver.get("https://admin-demo.nopcommerce.com/");
	
	WebElement email = driver.findElement(By.id("Email"));
	
	email.clear();
	
	email.sendKeys(user);
	
	WebElement password = driver.findElement(By.id("Password"));
	
	password.clear();
	
	password.sendKeys(pass);
	
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	
	String given_Title ="Dashboard / nopCommerce administration";
	
	String current_title = driver.getTitle();
	
	
	if(pass.equals("Valid"))
	{
		if(given_Title.equals(current_title))
		{
			driver.findElement(By.linkText("Logout")).click();
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	else if(pass.equals("Invalid"))
	{
		if(given_Title.equals(current_title))
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

public String [][] data()
{
	String a [][] = {
			{"admin@yourstore.com","admin","Valid"},
			{"admin@yourstore.com","adm","Invalid" },
			{"adm@yourstore.com","admin","Invalid"},
			{"adm@yourstore.com","adm","Invalid"}	
	};
	
	
	return a;
	
}
@AfterClass
public void close()
{
	driver.close();
}
}
