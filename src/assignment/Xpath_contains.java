package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_contains
{
 public static WebDriver driver;
 static String givenURL = "https://demowebshop.tricentis.com/";
 public static void ChromeBrowser()
 {
	 driver= new ChromeDriver();
	 
	 driver.manage().window().maximize();
	
 }
 public static void CloseBrowser()
 {
	 driver.close();
 }
 public static void OpenDWS() throws InterruptedException
 {
	 driver.get("https://demowebshop.tricentis.com/");
	 if(givenURL.contains(driver.getCurrentUrl()))
	 {
		 System.out.println("We are in Demo webShop page");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]")).click();
		 Thread.sleep(2000);
	 }
	 else
	 {
		 System.out.println("We are not in demo webshop page");
	 }
 }
 public static void main(String[] args) throws InterruptedException {
	 ChromeBrowser();
	 OpenDWS();
	 CloseBrowser();
}
}
