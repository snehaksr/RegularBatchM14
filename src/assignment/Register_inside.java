package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_inside
{
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.className("ico-register")).click();
    driver.findElement(By.id("gender-female")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("FirstName")).sendKeys("Sneha");
	Thread.sleep(2000);
	driver.findElement(By.id("LastName")).sendKeys("Murugesan");
	Thread.sleep(2000);
	driver.findElement(By.name("Email")).sendKeys("snehaksr1998@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.name("Password")).sendKeys("Selva@150392");
	Thread.sleep(2000);
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Selva@150392");
	Thread.sleep(2000);
	driver.findElement(By.name("register-button")).click();
	Thread.sleep(2000);
	driver.close();
}
}
