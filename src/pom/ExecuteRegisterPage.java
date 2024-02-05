package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecuteRegisterPage {
@Test
public void recever()
{
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	
	
	DwsRegisterPage execute = new DwsRegisterPage(driver);
	execute.register.click();
	execute.gender.click();
	execute.namebutton("Sneha");
	execute.lastnamebu("M");
	execute.emailbut("snehaksr1998@gmail.com");
	execute.passbutt("Welcome@12345");
	execute.conpassbut("Welcome@12345");
	execute.submit.click();
}
}
