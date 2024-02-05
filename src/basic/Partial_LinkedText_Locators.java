package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partial_LinkedText_Locators 
{
 public static void main(String[] args) {
	 
	WebDriver driver = new ChromeDriver();
	
	String s = "https://demowebshop.tricentis.com/";
			
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	String s1 = driver.getCurrentUrl();
	
	if(s.equals(s1))
	{
		System.out.println("Enter into URL");
		
		driver.findElement(By.partialLinkText("Shopping")).click();
	}
	else
	{
		System.out.println("Not same url");
	}
	
	driver.close();
}
}
