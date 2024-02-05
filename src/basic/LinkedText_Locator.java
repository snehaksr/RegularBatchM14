package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedText_Locator 
{
 public static void main(String[] args) {
	
	 WebDriver driver = new ChromeDriver();
	 
	 String given_url = "https://demowebshop.tricentis.com/";
	 
	 String given_title = "Demo Web Shop. Login";
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://demowebshop.tricentis.com/");
	 
	String current_url =  driver.getCurrentUrl();

	 if(given_url.contains(current_url))
	   {
		System.out.println("Successfuly entered");
		
		driver.findElement(By.linkText("Log in")).click();
		
		String current_title = driver.getTitle();
		
		if(given_title.contains(current_title))
		{
			System.out.println("You are in login page");
			
			driver.close();
		}
		else
		{
			System.out.println("You are not in login page");
		}
	}
	else
	{
		System.out.println("Unsuccessful");
	}
	
		
}
 
}
