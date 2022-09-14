package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Selenium.AccessBrowser;
import Selenium.Parameterization;

public class ZerodhaHomeTest 
{
	WebDriver driver;
	
	public void practice() throws InterruptedException, EncryptedDocumentException, IOException
	{
	    driver=AccessBrowser.openA("https://kite.zerodha.com/dashboard");
		ZerodhaLoginPage zerodhaloginpage=new ZerodhaLoginPage(driver);
		zerodhaloginpage.EnterUserId("OKP335");
		zerodhaloginpage.EnterPassword("ZAQ1234567");
		zerodhaloginpage.ClickOnLogIn();
		Thread.sleep(2000);
		zerodhaloginpage.Enterpin("234567");
		zerodhaloginpage.ClickOnContinue();
		Thread.sleep(2000);
		ZerodhaHomePage zerodhahomepage=new ZerodhaHomePage(driver);
	    zerodhahomepage.tosearchshare();
	    zerodhahomepage.MoveToShare(driver);
	    //zerodhahomepage.ClickOnsharebuy();
	    //Thread.sleep(2000);
	    zerodhahomepage.Addtowatchlist();
	    Thread.sleep(2000);
	    //zerodhahomepage.ClickOnpopupBuy();
	   // Thread.sleep(2000);
	    //zerodhahomepage.ClickOnLimit();
	    zerodhahomepage.MoveToShare(driver);
	    Thread.sleep(2000);
	    zerodhahomepage.deleteFromWatchList();
	    //zerodhahomepage.ClickOnpopupBuy();
	    //zerodhahomepage.ClickOnpopupcancel();
	    //zerodhahomepage.ClickOnsharesell();
	    //zerodhahomepage.Addtowatchlist();
	    //Thread.sleep(2000);
	    //zerodhahomepage.deleteFromWatchList();
	}
	@Test
	public void TobuyShare() throws InterruptedException, EncryptedDocumentException, IOException
	{
		ZerodhaHomeTest z=new ZerodhaHomeTest();
		z.practice();
	}
}
