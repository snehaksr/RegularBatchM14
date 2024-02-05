package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingCart {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	Thread.sleep(2000);
	
	driver.findElement(By.className("cart-label")).click();
	
	Thread.sleep(2000);
	
	driver.close();
}
}
