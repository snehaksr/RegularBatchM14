package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Honda
{
  public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	String s = "https://www.honda2wheelersindia.com/";
	
	driver.manage().window().maximize();
	driver.get("https://www.honda2wheelersindia.com/");
	
	String s2 = driver.getCurrentUrl();
	if(s.equals(s2))
	{
		System.out.println("Same URL");
	}
	else
	{
		System.out.println("Not same URL");
	}
	driver.close();
}
}
