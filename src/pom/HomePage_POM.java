package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage_POM {

	public static void clickReports() {
		LoginPage_POM.element = (new WebDriverWait(LoginPage_POM.driver, 500))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='aReport']")));
		LoginPage_POM.element.click();
	}

	public static void clickFinance() {
		LoginPage_POM.element = (new WebDriverWait(LoginPage_POM.driver, 400))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(.,'Finances')]")));
		LoginPage_POM.element.click();
	}

	public static void clickGameRevenueReport() {
		LoginPage_POM.element = (new WebDriverWait(LoginPage_POM.driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href*='GameRevenue']")));
		LoginPage_POM.element.click();
	}
	
	public static void clickPlayerDeposit() {
		LoginPage_POM.element = (new WebDriverWait(LoginPage_POM.driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href*='PlayerDeposit']")));
		LoginPage_POM.element.click();
	}
	
	public static void clickPlayerWithdrawl() {
		LoginPage_POM.element = (new WebDriverWait(LoginPage_POM.driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href*='PlayerWithdrawal']")));
		LoginPage_POM.element.click();
	}
	public static void clickInternalGrossProfitCasino() {
		LoginPage_POM.element = (new WebDriverWait(LoginPage_POM.driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href*='GrossProfit']")));
		LoginPage_POM.element.click();
	}
	
	public static void clickGrossProfitReport() {
		LoginPage_POM.element = (new WebDriverWait(LoginPage_POM.driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href*='GrossProfitCasino']")));
		LoginPage_POM.element.click();
	}
	
	public static void clickGrossProfitSportBetting() {
		LoginPage_POM.element = (new WebDriverWait(LoginPage_POM.driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href*='GrossProfitSportBetting']")));
		LoginPage_POM.element.click();
	}
	
	public static void clickGrossProfitPlayers() {
		LoginPage_POM.element = (new WebDriverWait(LoginPage_POM.driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href*='GrossProfitPlayers']")));
		LoginPage_POM.element.click();
	}
	
	public static void clickJackpotContribution() {
		LoginPage_POM.element = (new WebDriverWait(LoginPage_POM.driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href*='JackpotContribution']")));
		LoginPage_POM.element.click();
	}
	
	public static void clickInternalNetProfit() {
		LoginPage_POM.element = (new WebDriverWait(LoginPage_POM.driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href*='NetProfit']")));
		LoginPage_POM.element.click();
	}
	
	public static void clickNetProfitCasino() {
		LoginPage_POM.element = (new WebDriverWait(LoginPage_POM.driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href*='NetProfitCasino']")));
		LoginPage_POM.element.click();
	}
	
	public static void clickPaymentMethods() {
		LoginPage_POM.element = (new WebDriverWait(LoginPage_POM.driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href*='PaymentProvider']")));
		LoginPage_POM.element.click();
	}
	
	public static void clickAccountAdjustment() {
		LoginPage_POM.element = (new WebDriverWait(LoginPage_POM.driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href*='AccountBalanceAdjustment']")));
		LoginPage_POM.element.click();
	}
	
	public static void clickMirroringServer() {
		LoginPage_POM.element = (new WebDriverWait(LoginPage_POM.driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href*='MirroringServer']")));
		LoginPage_POM.element.click();
	}
	
	public static void clickSafetyServer() {
		LoginPage_POM.element = (new WebDriverWait(LoginPage_POM.driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href*='SafetyServer']")));
		LoginPage_POM.element.click();
	}
	
	public static void clickCalendar() {
		LoginPage_POM.element = (new WebDriverWait(LoginPage_POM.driver, 100)).until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//input[@class='validate[required] hasDatepicker']")));
		if (LoginPage_POM.element.isEnabled()) {
			LoginPage_POM.element.sendKeys("05/22/2017");
			LoginPage_POM.element.click();

		} else {
			System.out.println("Element ias not enabled, to perform any action");
			System.exit(0);
		}
	}

	public static void clickExcelIcon() {
		LoginPage_POM.element = (new WebDriverWait(LoginPage_POM.driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='btnExcel']")));
		LoginPage_POM.element.click();
	}

	public static void enterStartDate() {
		LoginPage_POM.element = (new WebDriverWait(LoginPage_POM.driver, 200))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(.,'2')]")));
		LoginPage_POM.element.click();
	}

	public static void clickSearchButton() {
		LoginPage_POM.element = (new WebDriverWait(LoginPage_POM.driver, 200))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='btnSearch']")));
		LoginPage_POM.element.click();
	}
}
