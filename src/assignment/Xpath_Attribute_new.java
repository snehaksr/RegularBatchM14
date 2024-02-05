package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Attribute_new 
{
  public static WebDriver driver;
  static String givenUrl = "https://demowebshop.tricentis.com/";
  public static void ChromeBrowser()
  {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
  public static void CloseBrowser()
  {
	  driver.close();
  }
  public static void OpenDws() throws InterruptedException{
	  driver.get("https://demowebshop.tricentis.com/");
	  String currentUrl = driver.getCurrentUrl();
	  String [] name = {"sneha","sneha1234@gmail.com","sneha","sneha1234@gmail.com"};
 	  if(givenUrl.contains(currentUrl)){
	  System.out.println("we are in same page");
	  driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).click();
	  Thread.sleep(2000);	
	  List<WebElement> gift_field = driver.findElements(By.xpath("//div[@class='giftcard']/div/input"));
	  int i=0;
	  for (WebElement web : gift_field){
	  web.sendKeys(name[i++]);
      Thread.sleep(2000);	}
	  driver.findElement(By.xpath("//textarea[@id='giftcard_2_Message']")).sendKeys("Hi all");
      Thread.sleep(2000);		  
	  WebElement qty = driver.findElement(By.xpath("//input[@id='addtocart_2_EnteredQuantity']"));
	  Thread.sleep(2000);		 
	  qty.clear();
	  Thread.sleep(2000);
	  qty.sendKeys("3");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='add-to-cart-button-2']")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("(//span[@class='cart-label'])[2]")).click();	
	  Thread.sleep(5000);
	  driver.navigate().back();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	  Thread.sleep(5000);
	  WebElement checkbox = driver.findElement(By.xpath("//input[@name='removefromcart']"));
	  checkbox.click();
	  
	  if(checkbox.isSelected())
	  {
	  Thread.sleep(2000);
	  System.out.println("Able to click");
	  Thread.sleep(2000);
	  WebElement updatecart = driver.findElement(By.xpath("//input[@name='updatecart']"));
	  if(updatecart.isEnabled())
	  {
	  System.out.println("Update cart is enabled");
	  Thread.sleep(2000);
	  updatecart.click();
	  Thread.sleep(2000);}
	  else
	  {
	  System.out.println("Update cart is not enabled");}}
	  else
	  {
	  System.out.println("unable to click");}}
	  else{
	  System.out.println("We are not in virtual gift cart page");
	  driver.close();} }
      public static void main(String[] args) throws InterruptedException
      {
	  ChromeBrowser();
	  OpenDws();
	  CloseBrowser();
}
}


