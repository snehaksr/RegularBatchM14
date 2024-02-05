package basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relative_xpath 
{
 public static void main(String[] args) {
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.navigate().to("https://demowebshop.tricentis.com/");
	 
	 driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
	 
	 driver.findElement(By.xpath("//input[@class='email']")).sendKeys("catdog12@gmail.com");
	 
	 driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Welcome@1234");
	 
	 driver.findElement(By.xpath("//input[@name='RememberMe']")).click();
}
 
}
