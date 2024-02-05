package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsLoginPage {
public  void DwsRegisterPage (WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

	@FindBy(xpath = "//a[text()='Log in']")
	WebElement login;
	
	@FindBy(id = "Email")
	WebElement email;
	
	@FindBy(id = "Password")
	WebElement password;
	
	@FindBy(id = "RememberMe")
	WebElement checkbox;
	
	@FindBy(xpath = "//input[@value='Log in']")
	WebElement loginbutton;

public void loginlink()
{
	login.click();
}
public void emailbox(String value)
{
	email.sendKeys("snehaksr1998@gmail.com");
}
public void passwordbutton(String value)
{
	password.sendKeys("Welcome@12345");
}
public void remembermecheck()
{
	checkbox.click();
}
public void submit()
{
loginbutton.click();
}

}