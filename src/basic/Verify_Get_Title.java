package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Get_Title 
{
 public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	String given_title = "Demo Web Shop";
	
	String Current_title = driver.getTitle();
	
	if(given_title.equals(Current_title))
	{
		System.out.println("same");
	}
	else
	{
		System.out.println("not same");
	}
}
}
