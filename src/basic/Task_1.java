package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_1 {
 public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	String s1 = "https://demowebshop.tricentis.com/";
	
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.getTitle();
	
	System.out.println(driver.getTitle());
	
	String s2 = driver.getCurrentUrl();
	
	if(s1.equals(s2))
	{
		System.out.println("same");
	}
	else
	{
		System.out.println("Not same");
	}
}
}
