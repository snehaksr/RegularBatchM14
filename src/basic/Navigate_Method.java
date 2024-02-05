package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Method {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.honda2wheelersindia.com/");
	
	driver.get("https://www.royalenfield.com/");
	
	driver.navigate().back();
	
	driver.navigate().forward();
	
	
}
}
