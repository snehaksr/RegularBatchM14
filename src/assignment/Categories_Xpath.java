package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Categories_Xpath 
{
 public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	List<WebElement> fetch_text = driver.findElements(By.xpath("html/body/div[4]/div/div[4]/div/div/div[2]/ul/li"));
	
	for (WebElement web : fetch_text) 
	{
		System.out.println(web.getText());
	}
}
}
