package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Method_Get_Tittle
{
 public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.honda2wheelersindia.com/");
	
	String current_title = driver.getTitle();
	
	System.out.println(current_title);
	
	driver.get("https://www.royalenfield.com/");
	
	driver.navigate().back();
	
	String given_tittle ="Honda | Honda";
	
	if(current_title.contains(given_tittle))
	{
		System.out.println("Same");
	}
	else
	{
		System.out.println("Not same");
	}
	
}
}
