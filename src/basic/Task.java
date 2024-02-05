package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task 
{
 public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	String s = "https://demowebshop.tricentis.com/";
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://demowebshop.tricentis.com/");
	
	driver.get("https://www.redbus.in/");
	
	driver.navigate().back();
	
	String s1 = driver.getCurrentUrl();
	
	System.out.println(driver.getCurrentUrl());
	
	if(s.equals(s1))
	{
		System.out.println("Same URL");
	}
	else
	{
		System.out.println("Different URL");
	}
	driver.navigate().refresh();
    
	driver.close();
}
}
