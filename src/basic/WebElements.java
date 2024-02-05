package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements 
{
 public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://demowebshop.tricentis.com/");
	 
	List<WebElement> community_pool = driver.findElements(By.cssSelector("input[type='radio']"));
	 
	System.out.println(community_pool);
	
	 for(WebElement web : community_pool)
	 { 
		 Thread.sleep(2000);
		 
		 web.click();
		 
		 Thread.sleep(2000);
	 }
	 
	 driver.close();
}
}
