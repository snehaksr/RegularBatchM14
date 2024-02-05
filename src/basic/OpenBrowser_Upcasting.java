package basic;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class OpenBrowser_Upcasting 
{
 public static void main(String[] args) {
	String s = ("https://www.qspiders.com/");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.qspiders.com/");
	String s2=driver.getCurrentUrl();
	driver.close();
	if(s.equals(s2))
	{
		System.out.println("Same URL");
	}
	else
		System.out.println("Not same");
}
}
