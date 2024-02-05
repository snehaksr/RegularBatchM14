package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{
 public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");
	
	driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("Mobile");
	
	driver.findElement(By.cssSelector("input[value='Go']")).click();
	
	driver.findElement(By.cssSelector("span[class='a-size-medium a-color-base a-text-normal']")).click();
	
}
}
