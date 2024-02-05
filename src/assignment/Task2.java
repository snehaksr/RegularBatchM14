package assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task2 {
  public static WebDriver driver;
  public static void ChromeBrowser()
  {
	  driver= new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  }
  public static void OpenDws()
  {
	  driver.get("https://demowebshop.tricentis.com/"); 
	  }
  public static void CloseBrowser() 
  {
	  driver.close(); 
	  }
   public static void main(String[] args)  
   {
	ChromeBrowser();
	
	OpenDws();
	
	String givenUrl = "https://demowebshop.tricentis.com/";
	
	if(givenUrl.contains(driver.getCurrentUrl()))
	{
		System.out.println("The given and current URL same");	
		
		driver.findElement(By.cssSelector("a[class='ico-login']")).click();
		
		WebElement login = driver.findElement(By.cssSelector("div[class='page-title']"));
		
    if(login.isDisplayed())
    {
			System.out.println("We are in same page");
			driver.findElement(By.cssSelector("input[class='email']")).sendKeys("cat1234@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("Welcome@1234");
			driver.findElement(By.cssSelector("input[name='RememberMe']")).click();
			driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
			}
    else	
    {
		System.out.println("The given and current URL not same");
		} 
    }
	else
	{
		System.out.println("we are not in same page");
		}
	}
   }
