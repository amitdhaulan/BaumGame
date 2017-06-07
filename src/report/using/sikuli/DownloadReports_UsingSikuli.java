package report.using.sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DownloadReports_UsingSikuli {
	WebDriver driver;
	WebElement element;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.gecko.driver",
				"D:\\amit\\testing_git\\soft\\selenium_accessories\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://baumbet.ro/Admin");
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	
	@Test
	public void Calendar_DateTime_Picker() throws FindFailed {
		Screen screen = new Screen();

		Pattern image = new Pattern(
				"D:\\amit\\Java_programs\\BaumGame\\libs\\reports.PNG");
		Pattern image1 = new Pattern(
				"D:\\amit\\Java_programs\\BaumGame\\libs\\finance.PNG");
		Pattern image2 = new Pattern(
				"D:\\amit\\Java_programs\\BaumGame\\libs\\gamerevenuereport.PNG");
		Pattern image3 = new Pattern(
				"D:\\amit\\Java_programs\\BaumGame\\libs\\startdatetextbox.PNG");
		Pattern image4 = new Pattern(
				"D:\\amit\\Java_programs\\BaumGame\\libs\\calendardate.PNG");
		Pattern image5 = new Pattern(
				"D:\\amit\\Java_programs\\BaumGame\\libs\\searchbutton.PNG");
		Pattern image6 = new Pattern(
				"D:\\amit\\Java_programs\\BaumGame\\libs\\excelicon.PNG");
		Pattern image7 = new Pattern(
				"D:\\amit\\Java_programs\\BaumGame\\libs\\savebutton.PNG");
		Pattern image8 = new Pattern(
				"D:\\amit\\Java_programs\\BaumGame\\libs\\exportedsheet.PNG");

		element = driver.findElement(By.id("Email"));
		element.sendKeys("admin@mail.ro");
		
		element = driver.findElement(By.id("Password"));
		element.sendKeys("123456");
		
		element = driver.findElement(By.xpath("//input[@value='Login']"));
		element.click();
		
		screen.click(image);
		screen.click(image1);
		screen.click(image2);
		screen.click(image3);
		screen.click(image4);
		screen.click(image5);
		screen.click(image6);
		screen.click(image7);
		screen.click(image8);
		
	}

}
