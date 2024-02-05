package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	String givenUrl = "https://demowebshop.tricentis.com/";
	
	String currentUrl = driver.getCurrentUrl();
	
	String givenTitle = "Demo Web Shop";
	
	String currentTitle = driver.getTitle();
	
	if(givenUrl.contains(currentUrl))
	{
		
	System.out.println("The given Url is same");
	
	driver.findElement(By.linkText("Digital downloads")).click();
	
	if(givenTitle.contains(currentTitle))
	{
	System.out.println("The given Title is same");
	
	 List<WebElement> add_to_cart = driver.findElements(By.cssSelector("input[value='Add to cart']"));
	
	for(WebElement web : add_to_cart)
	{
	Thread.sleep(2000);
	
	web.click();
	
	Thread.sleep(2000);
	}
	driver.findElement(By.cssSelector("span[class='cart-label']")).click();
	
	WebElement shopping = driver.findElement(By.cssSelector("div[class='page-title']"));
	
	if(shopping.isDisplayed())
	{
	System.out.println("The given title for Shopping cart is same");
	
	List<WebElement> shopping_cart = driver.findElements(By.cssSelector("input[name='removefromcart']"));
	
	for(WebElement web1 : shopping_cart)
	{
	Thread.sleep(2000);	
	
	web1.click();	
	
	Thread.sleep(2000);		
	}
	driver.findElement(By.cssSelector("input[class='button-2 update-cart-button']")).click();
	
	Thread.sleep(2000);	
	
	driver.close();
	}
	else
	{
	System.out.println("The given title for Shopping cart is not same");  }}
	else 	
	{
	System.out.println("The given Title is not same");	}}
	else 
	{
	System.out.println("The given Url is not same");	
	}
}
}
