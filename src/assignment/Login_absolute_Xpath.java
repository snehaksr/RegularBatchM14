package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_absolute_Xpath 
{
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.navigate().to("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div/ul/li[2]/a")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div/ul/li[3]/a")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div/ul/li[4]/a")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body/div[4]/div/div[2]/ul/li[1]/a")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body/div[4]/div/div[2]/ul/li[2]/a")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body/div[4]/div/div[2]/ul/li[3]/a")).click();
	Thread.sleep(2000);
    driver.navigate().back();
    Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body/div[4]/div/div[2]/ul/li[4]/a")).click();
	Thread.sleep(2000);
    driver.navigate().back();
    Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body/div[4]/div/div[2]/ul/li[5]/a")).click();
	Thread.sleep(2000);
    driver.navigate().back();
    Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body/div[4]/div/div[2]/ul/li[6]/a")).click();
	Thread.sleep(2000);
    driver.navigate().back();
    Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body/div[4]/div/div[2]/ul/li[7]/a")).click();
}
}
