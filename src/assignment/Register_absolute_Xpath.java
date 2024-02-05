package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_absolute_Xpath
{
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.xpath("/html[1]/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
	
	WebElement register_page = driver.findElement(By.xpath("/html[1]/body/div[4]/div/div[4]/div[2]/form/div/div[1]"));
	
	if(register_page.isDisplayed())
	{
		System.out.println("we are in registration page");
		driver.findElement(By.xpath("/html[1]/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div/div[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[2]/input")).sendKeys("Yazhisai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[3]/input")).sendKeys("S");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/input")).sendKeys("cat321@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div/input")).sendKeys("Welcome@12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/input")).sendKeys("Welcome@12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[4]/input")).click();
	}
	else
	{
		System.out.println("We are not in registration page");
	}
}
}
