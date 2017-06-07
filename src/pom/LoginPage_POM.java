package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage_POM {
	public static WebDriver driver;
	public static WebElement element;

	public LoginPage_POM() {
		System.setProperty("webdriver.gecko.driver",
				"D:\\amit\\testing_git\\soft\\selenium_accessories\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://baumbet.ro/Admin");
	}

	public void getUserName(String userName) {
		element = driver.findElement(By.id("Email"));
		element.sendKeys(userName);
	}

	public void getPassword(String password) {
		element = driver.findElement(By.id("Password"));
		element.sendKeys(password);
	}

	public void clickLoginButton() {
		element = driver.findElement(By.xpath("//input[@value='Login']"));
		element.click();

		for (int i = 0; i <= 8000000;) {
			System.out.println("i " + i);
			i++;
		}
	}

	public void closeBrowser() {
		 driver.close();
	}

}
