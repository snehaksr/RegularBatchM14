package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ktm {
public static void main(String[] args) 
{
	String s = "https://www.ktm.com/en-in.html";
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.ktm.com/en-in.html");
	
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
