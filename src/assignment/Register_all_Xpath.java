package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_all_Xpath 
{
 public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	String givenUrl = "https://demowebshop.tricentis.com/";
	
	if(givenUrl.contains(driver.getCurrentUrl()))
	{
		System.out.println("We are in DWS page");
		
		List<WebElement> fetch_text = driver.findElements(By.xpath("html/body/div[4]/div/div/div[2]/div/ul/li"));
		
		for (WebElement web : fetch_text) 
		{
			System.out.println(web.getText());
		}
	}
	else
	{
		System.out.println("We are not in DWS page");
	}
}
}
