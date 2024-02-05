package basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment_1 
{
  public static void main(String[] args) throws InterruptedException {
    //Open Browser
	WebDriver driver = new ChromeDriver();
	// Maximize Window
	driver.manage().window().maximize();
	// navigate to DemoWebShop web page
	driver.navigate().to("https://demowebshop.tricentis.com/");
	// navigate to abhi bus web page
	driver.get("https://www.abhibus.com/");
	// back to Demo web shop web page
	driver.navigate().back();
	//store given title  in String s1
	String s1 = "Demo Web Shop";
	//get current title
	String s2 = driver.getTitle();
	//compare given title and current title using if else statement
	if(s1.equals(s2)) 
	{
		System.out.println("Given title is same");
	}
	else 
	{
		System.out.println("Given title not same");
    }
	Thread.sleep(2000);
	//Enter data in search element using id locator
	driver.findElement(By.id("small-searchterms")).sendKeys("Phone");
	Thread.sleep(2000);
	//refresh
	driver.navigate().refresh();
	Thread.sleep(2000);
	//Forward to abhi bus web page
	driver.navigate().forward();
	Thread.sleep(2000);
	//Close the browser
	driver.close();
}
}
