package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigte_Refresh {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.redbus.in/");
	Thread.sleep(1000);//
	driver.navigate().refresh();
	Thread.sleep(1000);
	driver.close();
}
}
