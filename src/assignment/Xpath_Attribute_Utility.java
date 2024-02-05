package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Attribute_Utility 
{
   static WebDriver driver;
   static String givenURL = "https://demowebshop.tricentis.com/";
   static String givenTitle = "Demo Web Shop";
   public static void ChromeBrowser()
   {
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
   }
   public static void CloseBrowser()
   {
	   driver.close();
   }
   
   public static void giftcard() throws InterruptedException
   {
	driver.get("https://demowebshop.tricentis.com/");
	String currentUrl = driver.getCurrentUrl();
	String [] name = {"sneha","sneha123@gmail.com","sneha","sneha123@gmail.com"};
  if(givenURL.equals(currentUrl))
   {
   System.out.println("We are given page");
		   
   driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
   
   Thread.sleep(2000);
	
   String currentTitle = driver.getTitle();
   
   Thread.sleep(2000);
   
   if(givenTitle.contains(currentTitle))
   {
    System.out.println("We are in $25 gift cart page");
    Thread.sleep(2000);		   
	List<WebElement> gift_field = driver.findElements(By.xpath("//div[@class='giftcard']/div/input"));
	Thread.sleep(2000);		  
	int i=0;	  
    for (WebElement web : gift_field) 
	{
   	web.sendKeys(name[i++]);
   	Thread.sleep(2000);
   	}
	driver.findElement(By.xpath("//textarea[@id='giftcard_2_Message']")).sendKeys("hi all Welcome");
	Thread.sleep(2000);		  
	WebElement qty = driver.findElement(By.xpath("//input[@id='addtocart_2_EnteredQuantity']"));
	Thread.sleep(2000);		 
	driver.findElement(By.xpath("//input[@id='add-to-cart-button-2']")).click();
	Thread.sleep(2000);		 
	qty.clear();
	Thread.sleep(2000);
    qty.sendKeys("3");
   }
	else
   {
	System.out.println("we are not in $25 gift to cart page");
    driver.close();
	}
	  }
	 else
	   {
	System.out.println("We are not in given page");
	driver.close();
	   }
   }
   
   public static void main(String[] args) throws InterruptedException {
	ChromeBrowser();
	giftcard();
	CloseBrowser();
}
   
  
}
