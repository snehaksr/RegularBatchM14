package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains_Method 
{
 public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
   driver.navigate().to("https://www.honda2wheelersindia.com/");
	
	String current_title= driver.getTitle(); 
	System.out.println(current_title);
}
}
