package POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import Selenium.AccessBrowser;

public class ZerodhaTest 
{
 public void LoginWithCorrectCredentials() throws InterruptedException
 {
	 WebDriver driver=AccessBrowser.openA("https://kite.zerodha.com/");
	 ZerodhaLoginPage zerodhaloginpage=new ZerodhaLoginPage(driver);
	 
	 zerodhaloginpage.EnterUserId("OKP335");
	 zerodhaloginpage.EnterPassword("ZAQ1234567");
	 zerodhaloginpage.ClickOnLogIn();
	 Thread.sleep(2000);
	 zerodhaloginpage.Enterpin("234567");
	 zerodhaloginpage.ClickOnContinue();
	 
	 //zerodhaloginpage.ClickOnorders();
	 //Alert Popup=driver.switchTo().alert();
	 //Popup.accept();
 }
public static void main(String[] args) throws InterruptedException 
{
	
	ZerodhaTest zerodhatest=new ZerodhaTest();
	zerodhatest.LoginWithCorrectCredentials();
	//ZerodhaHomePage zerodhahomepage=new ZerodhaHomePage(driver);
	
	
}
}
