package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartChronologicalOrder {
	public WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://demowebshop.tricentis.com/");
	}

	@BeforeMethod
	public void login() {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();

		driver.findElement(By.id("Email")).sendKeys("snehakrishnachitra@gmail.com");

		driver.findElement(By.id("Password")).sendKeys("Welcome@12345");

		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();

	}

	@Test
	public void addToCart() {
		System.out.println("Script is successful");
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
	}

	@AfterMethod
	public void logout() {
		driver.findElement(By.linkText("Log out")).click();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
