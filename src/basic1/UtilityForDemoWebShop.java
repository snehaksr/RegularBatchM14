package basic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UtilityForDemoWebShop 
{
   public static WebDriver driver;//Global Variable we can access through out the class
   
   public static void ChromeBrowser()
   {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
   }
   public static void EdgeBrowser()
   {
	   driver = new EdgeDriver();
   }
   public static void FireFoxBrower()
   {
	   driver = new FirefoxDriver();
   }
   public static void CloseBrowser()
   {
	   driver.close();
   }
   public static void openDWS()
   {
	   driver.get("https://demowebshop.tricentis.com/");
   }
   public static void main(String[] args) throws InterruptedException {
	  ChromeBrowser();// precondition
	  Thread.sleep(2000);
	  openDWS(); // test script
	  Thread.sleep(2000);
	  CloseBrowser();// post condition
}
}
