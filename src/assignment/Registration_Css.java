package assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Registration_Css
{
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	String givenUrl = "https://demowebshop.tricentis.com/";	
	String currentUrl = driver.getCurrentUrl();
	String givenTitle = "Demo Web Shop";
	String currentTitle = driver.getTitle();
	if(givenUrl.contains(currentUrl)) {
		System.out.println("The given URL is same");
		driver.findElement(By.className("ico-register")).click();
		if(givenTitle.equals(currentTitle)) {
			System.out.println("The given title is same");
			driver.findElement(By.cssSelector("input[id='gender-female']")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[name='FirstName']")).sendKeys("Yazhisai");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("Selva");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("sneha123408291@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Abcd@1234");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).sendKeys("Abcd@1234");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[value='Register']")).click();}
		else {
			System.out.println("The given title is not same");}}
	else {
		System.out.println("The given URL is not same");}
	      driver.close();}}


