package assignment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStack {
	public static WebDriver driver;
	static String givenUrl = "https://www.shoppersstack.com/";

	public static void ChromeBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void CloseBrowser() {
		driver.close();
	}

	public static void OpenShopperStack() throws InterruptedException {
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(5000);
		if (givenUrl.equals(driver.getCurrentUrl())) {
			System.out.println("We are in ShopperStack page");
			Thread.sleep(10000);
			WebElement loginbutton = driver.findElement(By.xpath("//button[@class='navbar_Loginbutton__8r9bE']"));
			Thread.sleep(10000);
			if (loginbutton.isEnabled()) {
				System.out.println("Login button enabled");
				Thread.sleep(10000);
				loginbutton.click();
				WebElement createaccount = driver.findElement(By.xpath("//span[text()='Create Account']"));
				if (createaccount.isDisplayed()) {
					System.out.println("We are going to create account");
					Thread.sleep(1000);
					createaccount.click();
					String giventitle = "ShoppersStack | Shopper | Signup";
					String fields[] = { "Yazhisai", "selva", "9827601273", "sneha123@gmail.com", "Welcome@1234",
							"Welcome@1234" };
					if (giventitle.contains(driver.getTitle())) {
						System.out.println("We are in Create your profile page");
						Thread.sleep(1000);
						List<WebElement> profilefields = driver
								.findElements(By.xpath("//form[@class='signup_signupForm__BDlN5']/div/div/div/input"));
						int i = 0;
						for (WebElement web : profilefields) {
							web.sendKeys(fields[i++]);
							Thread.sleep(1000);
						}
						driver.findElement(By.xpath("//input[@id='Female']")).click();
						driver.findElement(By.xpath("//input[@type='checkbox']")).click();
						WebElement register = driver.findElement(By.xpath("//button[@id='Register']"));
						if (register.isEnabled()) {
							System.out.println("Register button enabled");
							register.click();
						} else {
							System.out.println("Register button not enabled");
						}
					} else {
						System.out.println("We are not in Create your profile page");
					}
				} else {
					System.out.println("We are not going to create account");
				}
			} else {
				System.out.println("Login button not enabled");
			}
		} else {
			System.out.println("We are not in ShopperStack page");
			CloseBrowser();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeBrowser();
		OpenShopperStack();
		CloseBrowser();
	}
}
