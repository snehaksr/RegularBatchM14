package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tvs {
 public static void main(String[] args) {
	 String s = "https://www.tvsmotor.com/";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.tvsmotor.com/");
	String s1 = driver.getCurrentUrl();
	if(s.equals(s1))
	{
		System.out.println("Same URL");
	}
	else
	{
		System.out.println("Not same");
	}
	driver.close();
}
}
