package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login_Css {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	String givenUrl = "https://demowebshop.tricentis.com/";
	
	String currentUrl = driver.getCurrentUrl();
	
	String givenTitle = "Demo Web Shop";
	
	String currentTitle = driver.getTitle();
	
	if(givenUrl.equals(currentUrl)) 
	{
		System.out.println("The given Url is same");
		
		driver.findElement(By.className("ico-login")).click();
		
		if(givenTitle.equals(currentTitle))
		{
			System.out.println("The Given Title is same");
			
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("input[autofocus='autofocus']"))
			.sendKeys("sneha123408291@gmail.com");
			
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#Password")).sendKeys("Abcd@1234");
			
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("input[type='checkbox']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("input[value='Log in']")).click();
			
		}
		else {
			System.out.println("The given title not same");
		}
	}
	else{
		System.out.println("The given Url is not same");}
	
	driver.close();
}
}
