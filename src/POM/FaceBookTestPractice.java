package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Selenium.AccessBrowser;
import Selenium.Parameterization;
import Selenium.ScreenShotPractice;

public class FaceBookTestPractice 
{ 
	WebDriver driver;
	@BeforeMethod
	public void ForBrowserOpen()
	{
	  driver=AccessBrowser.openA("https://www.facebook.com/");
	}
	
	@Test
	public void LoginWithValidCredentials() throws EncryptedDocumentException, IOException, InterruptedException
	   {
	   
	   FaceBookPage facebookpage=new FaceBookPage(driver);
	   facebookpage.EnterEmail(Parameterization.GetData("Facebook", 0, 0));
	   facebookpage.EnterPassword("123ab@");
	   Thread.sleep(4000);
	   ScreenShotPractice.TakeScreeShot(driver,"LoginPageFacebook");
	   facebookpage.ClickOnLogIn();
	   Thread.sleep(2000);
	   ScreenShotPractice.TakeScreeShot(driver,"AfterLogiIn");
	   }
	
}
