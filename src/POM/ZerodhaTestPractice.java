package POM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Selenium.AccessBrowser;
import Selenium.ScreenShotPractice;

public class ZerodhaTestPractice 
{
	WebDriver driver;
	@BeforeMethod
	public void ToOpenBrowser()
	{
		driver=AccessBrowser.openA("https://kite.zerodha.com/");
	}
	@Test
	public void LoginWithCorrectCredentials() throws InterruptedException
	 {
		 
		 ZerodhaLoginPage zerodhaloginpage=new ZerodhaLoginPage(driver);
		 
		 zerodhaloginpage.EnterUserId("OKP335");
		 zerodhaloginpage.EnterPassword("ZAQ1234567");
		 zerodhaloginpage.ClickOnLogIn();
		 Thread.sleep(2000);
		 zerodhaloginpage.Enterpin("234567");
		 zerodhaloginpage.ClickOnContinue();
	 }
}
