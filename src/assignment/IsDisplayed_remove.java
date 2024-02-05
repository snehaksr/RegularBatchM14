package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_remove
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	String givenUrl = "https://demowebshop.tricentis.com/";
	
	if(givenUrl.equals(driver.getCurrentUrl()))
	{
	System.out.println("The given url is same");
	
	WebElement home_page = driver.findElement(By.cssSelector("div[class='topic-html-content-title']"));
	
	if(home_page.isDisplayed())
	{
	System.out.println("Your in home page");
	
	driver.findElement(By.linkText("Digital downloads")).click();
	
	WebElement digital_download = driver.findElement(By.cssSelector("div[class='page-title']"));
	
	if(digital_download.isDisplayed())
	{
		
	List<WebElement> add_cart = driver.findElements(By.cssSelector("input[value='Add to cart']"));
	
	for(WebElement web : add_cart)
	{
	Thread.sleep(2000);	
	
	web.click();
	
	Thread.sleep(2000);
	}	
	driver.findElement(By.linkText("Shopping cart")).click();
	
	WebElement shopping_page = driver.findElement(By.cssSelector("div[class='page-title']"));	
	
	if(shopping_page.isDisplayed())	
	{
		
	System.out.println("You are in Shopping cart page");	
	
	List<WebElement> remove_checkbox = driver.findElements(By.cssSelector("input[type='checkbox']"));
	
	remove_checkbox.remove(remove_checkbox.size()-1);
	
	for(WebElement checkbox : remove_checkbox)
	{
		
	Thread.sleep(2000);	
	
	checkbox.click();
	
	Thread.sleep(2000);	
	}
	driver.findElement(By.cssSelector("input[value='Update shopping cart']")).click();
	
	Thread.sleep(2000);
	
	driver.close();
	}
	else
	{
	System.out.println("You are not in shopping cart page");
	}}}
	else
	{
	System.out.println("you are not in home page");
	}}
	else
	{
	System.out.println("The given Url is not same");
	}}
}
