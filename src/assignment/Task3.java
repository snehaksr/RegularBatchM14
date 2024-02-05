package assignment;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task3{
 public static WebDriver driver;
 public static void ChromeBrowser() {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demowebshop.tricentis.com/");}
 public static void CloseBrowser(){
	 driver.close(); }
 public static void main(String[] args) throws InterruptedException {
	ChromeBrowser();
	WebElement home = driver.findElement(By.cssSelector("div[id='nivo-slider']"));
	if(home.isDisplayed()){
		System.out.println("We are in home page");		
		driver.findElement(By.linkText("Digital downloads")).click();		
		WebElement digital_page = driver.findElement(By.cssSelector("div[class='page-title']"));		
		if(digital_page.isDisplayed())		{
			System.out.println("We are in Digital page");
			List<WebElement> add_to_cart = driver.findElements(By.cssSelector("input[value='Add to cart']"));
			for(WebElement web:add_to_cart){
				Thread.sleep(2000);
				web.click();
				Thread.sleep(2000);}	
			driver.findElement(By.cssSelector("span[class=\"cart-label\"]")).click();	
			WebElement shopping = driver.findElement(By.cssSelector("div[class='page-title']"));
			if(shopping.isDisplayed())	{
				System.out.println("We are in Shopping cart page");			
				List<WebElement> checkBox = driver.findElements(By.cssSelector("input[name='removefromcart']"));
				for(WebElement web1 : checkBox)				{
					Thread.sleep(2000);
					web1.click();
					Thread.sleep(2000);				}				
				driver.findElement(By.name("updatecart")).click();	
				driver.close();}
			else			{
				System.out.println("We are not in Shopping cart page");	}		}
		else	{
			System.out.println("we are in not digital page");	}}
	else{
		System.out.println("Not in home page");}}}
