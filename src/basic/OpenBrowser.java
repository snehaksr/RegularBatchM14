package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser 
{
 public static void main(String[] args) 
 {
	 //open Browser
	ChromeDriver driver = new ChromeDriver();
	//to maximize the browser 
	driver.manage().window().maximize();
	
	//enter into a particular web page
	driver.get("https://demowebshop.tricentis.com/");
}
}


