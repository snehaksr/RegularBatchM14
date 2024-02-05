package assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class preCondition
{
	public static WebDriver driver;
	
	public static void ChromeBrowser()
	{
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	} 
	public static void openDWS()
	{
    driver.get("https://demowebshop.tricentis.com/");
    }
	}
public class Task1 
{
    public static void main(String[] args)    
    {
    	preCondition.ChromeBrowser();
    	
    	preCondition.openDWS();
    	
	   	preCondition.driver.findElement(By.cssSelector("a[class='ico-register']")).click();
	   	
	   	WebElement registration = preCondition.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
	   	
	   	if(registration.isDisplayed())
	   	{
	   		System.out.println("You are in same page");
	   		
	   		preCondition.driver.findElement(By.id("gender-female")).click();
	   		
	   		preCondition.driver.findElement(By.cssSelector("input[class=\"text-box single-line\"]")).sendKeys("Sneha");
	   		
	   		preCondition.driver.findElement(By.cssSelector("input[id=\"LastName\"]")).sendKeys("M");
	   		
	   		preCondition.driver.findElement(By.cssSelector("input[data-val-required=\"Email is required.\"]")).sendKeys("cat1234@gmail.com");
	   		
            preCondition.driver.findElement(By.id("Password")).sendKeys("Welcome@1234");
            
            preCondition.driver.findElement(By.name("ConfirmPassword")).sendKeys("Welcome@1234");
            
	   		preCondition.driver.findElement(By.id("register-button")).click();
	   		
	   		postCondition.closeBrowser(); 
	   		}
	   	else   	
	   	{
	   		System.out.println("You are in different page");	  
	   		}
	   	}
    }
class postCondition
{
	public static void closeBrowser()
	{
	preCondition.driver.close();
	}
}
