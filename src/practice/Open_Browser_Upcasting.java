package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser_Upcasting 
{
 public static void main(String[] args) {
	String s = ("https://chat.qspiders.com/student-dashboard");//given URL
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chat.qspiders.com/student-dashboard");
	String s1 = driver.getCurrentUrl();//Current URL
	driver.close();
	if(s.equals(s1))
	{
		System.out.println("URL is same");
	}
	else
	{
		System.out.println("URL not same");
	}
}
}