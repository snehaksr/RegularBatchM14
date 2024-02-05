package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility 
{
  public static WebDriver driver;
  
  public static void ChromeBrowser()
  {
	  driver = new ChromeDriver();
	  
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
  
  public static void main(String[] args) throws InterruptedException {
	ChromeBrowser();
	
	Thread.sleep(2000);
	
	OpenDws();
	
	Thread.sleep(2000);
	
	CloseBrowser();
}
}
