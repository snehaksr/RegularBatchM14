package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsRegisterPage {

	public DwsRegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//a[text()='Register']")
	WebElement register;
	
	@FindBy(xpath = "//input[@id='gender-female']")
	WebElement gender;
	
	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement name;
	
	@FindBy(xpath = "//input[@id='LastName']")
	WebElement lname;
	
	@FindBy(id = "Email")
	WebElement emailid;
	
	@FindBy(id = "Password")
	WebElement password;
	
	@FindBy(id = "ConfirmPassword")
	WebElement confirmPass;
	
	@FindBy(id = "register-button")
	WebElement submit;
	
	public void registerbutt()
	{
		register.click();
	}
	public void genderbutton()
	{
		gender.click();
	}
	public void namebutton(String value)
	{
		name.sendKeys("Sneha");
	}
	public void lastnamebu(String value)
	{
		lname.sendKeys("M");
	}
	public void emailbut(String value)
	{
		emailid.sendKeys("Snehaksr1998@gmail.com");
	}
	public void passbutt(String value)
	{
		password.sendKeys("Welcome@12345");
	}
	public void conpassbut(String value)
	{
		confirmPass.sendKeys("Welcome@12345");
	}
	public void submitbut()
	{
		submit.click();
	}
	
}

