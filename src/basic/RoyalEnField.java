package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoyalEnField 
{
 public static void main(String[] args) {
	String s = "https://www.royalenfield.com/";
	
	WebDriver driver = new ChromeDriver ();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.royalenfield.com/");
	
	String s1 = driver.getCurrentUrl();
	
	if(s.equals(s1))
	{
		System.out.println("Same");
	}
	else
	{
		System.out.println("Not same");
	}
	driver.close();
}
}
