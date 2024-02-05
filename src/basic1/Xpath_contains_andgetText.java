package basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_contains_andgetText
{
   public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.xpath("(//a[contains(text (),'Books')])[1]")).click();
	
	driver.navigate().back();
	
	driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]")).click();
	
	driver.navigate().back();
	
	driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]")).click();
	
	driver.navigate().back();
	
	driver.findElement(By.xpath("(//a[contains(text(),'Apparel & Shoes')])[1]")).click();
		
    driver.navigate().back();
    
    driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]")).click();
    
    driver.navigate().back();
    
    WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
    
    System.out.println(register.getText());
    
    register.click();
    
    driver.findElement(By.xpath("(//a[contains(text(),'Jewelry')])[1]")).click();
    
    driver.navigate().back();
    
    driver.findElement(By.xpath("(//a[contains(text(),'Gift Cards')])[1]")).click();
    
    driver.navigate().back();
		
	
}
}
