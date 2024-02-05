package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Books_all_Xpath {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	 List<WebElement> fetchText = driver.findElements(By.xpath("html/body/div[4]/div/div[2]/ul/li"));
	
	 for (WebElement web : fetchText)
	 {
		System.out.println(web.getText());
	 }
	                                                                       
}
}
