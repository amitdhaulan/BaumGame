package reports;

import java.awt.AWTException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import pom.HomePage_POM;
import pom.LoginPage_POM;

public class DownloadReports {
	ATUTestRecorder recorder;

	LoginPage_POM login_Page_POM;

	Screen screen;
	Pattern image, image1, image2, image3, image4;

	@BeforeClass
	public void setUp() throws ATUTestRecorderException {
		login_Page_POM = new LoginPage_POM();
		DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		// Created object of ATUTestRecorder
		// Provide path to store videos and file name format.
		recorder = new ATUTestRecorder("D:\\amit\\Java_programs\\BaumGame\\test-output\\Videos\\",
				"DownloadReports-" + dateFormat.format(date), false);
		// To start video recording.
		recorder.start();
	}

	@AfterClass
	public void tearDown() {
		login_Page_POM.closeBrowser();
		try {
			recorder.stop();
		} catch (ATUTestRecorderException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 0)
	public void login() {
		login_Page_POM.getUserName("admin@mail.ro");
		login_Page_POM.getPassword("123456");
		login_Page_POM.clickLoginButton();
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 1, enabled = true)
	public void download_Reports_Finance_GameRevenueReport() throws AWTException, FindFailed {
		ScreenPatternObjects();
		HomePage_POM.clickReports();
		HomePage_POM.clickFinance();
		HomePage_POM.clickGameRevenueReport();
		sleep();
		screen.click(image1);
		sleep();
		screen.click(image2);
		sleep();
		screen.click(image3);
		sleep();
		screen.click(image4);
		sleep();
	}

	@Test(priority = 2, enabled = false)
	public void download_Reports_Finance_PlayerDeposit() throws AWTException, FindFailed {
		ScreenPatternObjects();
		HomePage_POM.clickPlayerDeposit();
		sleep();
		screen.click(image1);
		sleep();
		screen.click(image2);
		sleep();
		screen.click(image3);
		sleep();
		screen.click(image4);
		sleep();
	}

	@Test(priority = 3, enabled = false)
	public void download_Reports_Finance_PlayerWithdrawl() throws AWTException, FindFailed {
		ScreenPatternObjects();
		HomePage_POM.clickPlayerWithdrawl();
		sleep();
		screen.click(image1);
		sleep();
		screen.click(image2);
		sleep();
		screen.click(image3);
		sleep();
		screen.click(image4);
		sleep();
	}

	@Test(priority = 4, enabled = false)
	public void download_Reports_Finance_InternalGrossProfitCasino() throws AWTException, FindFailed {
		ScreenPatternObjects();
		HomePage_POM.clickInternalGrossProfitCasino();
		sleep();
		screen.click(image1);
		sleep();
		screen.click(image2);
		sleep();
		screen.click(image3);
		sleep();
		screen.click(image4);
		sleep();
	}

	@Test(priority = 5, enabled = false)
	public void download_Reports_Finance_GrossProfitReport() throws AWTException, FindFailed {
		ScreenPatternObjects();
		sleep();
		screen.click(image1);
		sleep();
		screen.click(image2);
		sleep();
		screen.click(image3);
		sleep();
		screen.click(image4);
		sleep();
	}

	@Test(priority = 6, enabled = false)
	public void download_Reports_Finance_GrossProfitSportBetting() throws AWTException, FindFailed {
		ScreenPatternObjects();
		HomePage_POM.clickGrossProfitSportBetting();
		sleep();
		screen.click(image1);
		sleep();
		screen.click(image2);
		sleep();
		screen.click(image3);
		sleep();
		screen.click(image4);
		sleep();
	}

	@Test(priority = 7, enabled = false)
	public void download_Reports_Finance_GrossProfitPlayers() throws AWTException, FindFailed {
		ScreenPatternObjects();
		HomePage_POM.clickGrossProfitPlayers();
		sleep();
		screen.click(image1);
		sleep();
		screen.click(image2);
		sleep();
		screen.click(image3);
		sleep();
		screen.click(image4);
		sleep();
	}

	@Test(priority = 8, enabled = false)
	public void download_Reports_Finance_JackpotContribution() throws AWTException, FindFailed {
		ScreenPatternObjects();
		HomePage_POM.clickJackpotContribution();
		sleep();
		screen.click(image1);
		sleep();
		screen.click(image2);
		sleep();
		screen.click(image3);
		sleep();
		screen.click(image4);
		sleep();
	}

	@Test(priority = 9, enabled = false)
	public void download_Reports_Finance_InternalNetProfit() throws AWTException, FindFailed {
		ScreenPatternObjects();
		HomePage_POM.clickInternalNetProfit();
		sleep();
		screen.click(image1);
		sleep();
		screen.click(image2);
		sleep();
		screen.click(image3);
		sleep();
		screen.click(image4);
		sleep();
	}

	@Test(priority = 10, enabled = false)
	public void download_Reports_Finance_NetProfitCasino() throws AWTException, FindFailed {
		ScreenPatternObjects();
		HomePage_POM.clickNetProfitCasino();
		sleep();
		screen.click(image1);
		sleep();
		screen.click(image2);
		sleep();
		screen.click(image3);
		sleep();
		screen.click(image4);
		sleep();
	}

	@Test(priority = 11, enabled = false)
	public void download_Reports_Finance_PaymentMethods() throws AWTException, FindFailed {
		ScreenPatternObjects();
		HomePage_POM.clickPaymentMethods();
		sleep();
		screen.click(image1);
		sleep();
		screen.click(image2);
		sleep();
		screen.click(image3);
		sleep();
		screen.click(image4);
		sleep();
	}

	@Test(priority = 12, enabled = false)
	public void download_Reports_Finance_AccountAdjustment() throws AWTException, FindFailed {
		ScreenPatternObjects();
		HomePage_POM.clickAccountAdjustment();
		sleep();
		screen.click(image1);
		sleep();
		screen.click(image2);
		sleep();
		screen.click(image3);
		sleep();
		screen.click(image4);
		sleep();
	}

	@Test(priority = 13, enabled = false)
	public void download_Reports_Finance_MirroringServer() throws AWTException, FindFailed {
		ScreenPatternObjects();
		HomePage_POM.clickMirroringServer();
		sleep();
		screen.click(image1);
		sleep();
		screen.click(image2);
		sleep();
		screen.click(image3);
		sleep();
		screen.click(image4);
		sleep();
	}

	@Test(priority = 14, enabled = false)
	public void download_Reports_Finance_SafetyServer() throws AWTException, FindFailed {
		ScreenPatternObjects();
		HomePage_POM.clickSafetyServer();
		sleep();
		screen.click(image1);
		sleep();
		screen.click(image2);
		sleep();
		screen.click(image3);
		sleep();
		screen.click(image4);
		sleep();
	}

	public void sleep() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}

	public void ScreenPatternObjects() {
		screen = new Screen();
		image2 = new Pattern(
				"D:\\amit\\Java_programs\\BaumGame\\libs\\Reports_Finance_GameRevenueReport\\excelicon.PNG");
		image4 = new Pattern(
				"D:\\amit\\Java_programs\\BaumGame\\libs\\Reports_Finance_GameRevenueReport\\okbutton.PNG");
		image3 = new Pattern(
				"D:\\amit\\Java_programs\\BaumGame\\libs\\Reports_Finance_GameRevenueReport\\savefile.PNG");
		image1 = new Pattern(
				"D:\\amit\\Java_programs\\BaumGame\\libs\\Reports_Finance_GameRevenueReport\\searchbutton.PNG");

	}

}
