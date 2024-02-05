package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_Locator 
{
 public static void main(String[] args) throws InterruptedException 
 {
   WebDriver driver = new ChromeDriver();
   
   driver.manage().window().maximize();
   
   driver.navigate().to("https://demowebshop.tricentis.com/");
   
   Thread.sleep(2000);
   
   driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("Mobile");
   
   Thread.sleep(2000);
   
   driver.findElement(By.cssSelector("input[value='Search']")).click();
   
   
}
}
