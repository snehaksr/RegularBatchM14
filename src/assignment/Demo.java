package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
 public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com");
	
	driver.findElement(By.cssSelector("input[value='Add to cart']")).click();
	
	driver.findElement(By.cssSelector("input[id='giftcard_2_RecipientName']")).sendKeys("sneha");
}
}
