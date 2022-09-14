package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import Selenium.AccessBrowser;
import Selenium.Parameterization;

public class TestFacebookPage 
{
   public void LoginWithValidCredentials() throws EncryptedDocumentException, IOException
   {
   WebDriver driver=AccessBrowser.openA("https://www.facebook.com/");
   
   FaceBookPage facebookpage=new FaceBookPage(driver);
   
   facebookpage.EnterEmail(Parameterization.GetData("Facebook", 0, 0));
   facebookpage.EnterPassword("123ab@");
   facebookpage.ClickOnLogIn();
   }
  
   public void LoginOnlyEmail()
   {
	   WebDriver driver=AccessBrowser.openA("https://www.facebook.com/");
	   
	   FaceBookPage facebookpage=new FaceBookPage(driver);
	   
	   facebookpage.EnterEmail("Nagpur"); 
	   facebookpage.ClickOnLogIn();
   }
   
   public void CheckOtherFunctions() throws InterruptedException
   {
	   WebDriver driver=AccessBrowser.openA("https://www.facebook.com/");
	   
	   FaceBookPage facebookpage=new FaceBookPage(driver);
	   
	   //facebookpage.ClickOnForgotPassword();
	   facebookpage.ClickOnSignUp();
	   Thread.sleep(3000);
	   //facebookpage.ClickOnCreatePage();
	   facebookpage.EnterFirstName("abc");
	   facebookpage.EnterSurname("xyz");
	   facebookpage.EnterNewPassword("123@");
	   facebookpage.EnterEmailOrMobileNo("1234@gmail.com");
	   facebookpage.ClickOnDay("20");
	   Thread.sleep(2000);
	   facebookpage.ClickOnMonth("Dec");
	   Thread.sleep(2000);
	   facebookpage.ClickOnYear("2000");
	   Thread.sleep(2000);
	   //facebookpage.ClickOnRadioButtonFemale();
	   facebookpage.ClickOnRadioButtonMale();
	   //facebookpage.ClickOnRadioButtonCustom();
   }
   public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
   {
	   TestFacebookPage Test=new TestFacebookPage();
	   //Test.LoginWithValidCredentials();
	   //Test.LoginOnlyEmail();
	   Test.CheckOtherFunctions();
   }

}


