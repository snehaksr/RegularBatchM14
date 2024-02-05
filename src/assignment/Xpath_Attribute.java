package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Attribute 
{
 public static void main(String[] args) {
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.navigate().to("https://demowebshop.tricentis.com/");
	 
	 String givenUrl = "https://demowebshop.tricentis.com/";
	 
	 if(givenUrl.equals(driver.getCurrentUrl()))
	 {
		 System.out.println("You are in same page");
		 
		 driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).click();
		 
		 driver.findElement(By.cssSelector("input[class='recipient-name']")).sendKeys("Priya");
		 
		 driver.findElement(By.xpath("//input[@id='giftcard_2_RecipientName']")).sendKeys("Priya");
		 
		 driver.findElement(By.xpath("//input[@name='giftcard_2.RecipientEmail']")).sendKeys("yazhisai123@gmail.com");
		 
		 driver.findElement(By.xpath("//input[@class='sender-name']")).sendKeys("Sneha");
		 
		 driver.findElement(By.xpath("//input[@name='giftcard_2.SenderEmail']")).sendKeys("cat1234@gmail.com");
		 
		 driver.findElement(By.xpath("//textarea[@class='message']")).sendKeys("Hi all welcome");
		 
		 driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		 
		 driver.findElement(By.xpath("//span[@class='cart-label']")).click();
		 
		 driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
		 
		 driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
	 }
	 else
	 {
		 System.out.println("You are not in same page");
	 }
}
}
