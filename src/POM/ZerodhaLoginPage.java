package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage

{
   ZerodhaLoginPage(WebDriver driver)
   {
	  PageFactory.initElements(driver, this); 
   }

   @FindBy(xpath="//input[@id='userid']")private WebElement UserId;
   @FindBy(xpath="//input[@id='password']")private WebElement Password; 
   @FindBy(xpath="//button[@type='submit']")private WebElement LogIn;
   @FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement Forgot;
   @FindBy(xpath="//input[@id='pin']")private WebElement Pin;
   @FindBy(xpath="//button[@type='submit']")private WebElement continueButton;
   @FindBy(xpath="//span[text()='Orders']")private WebElement orders;
  
   public void EnterUserId(String Userid)
   {
	   UserId.sendKeys(Userid);  
   }
   public void EnterPassword(String password)
   {
	   Password.sendKeys(password);
   }
   public void ClickOnLogIn()
   {
	   LogIn.click();
   }
   public void ClickOnForgotDetails()
   {
	   Forgot.click();
   }
   public void Enterpin(String pin)
   {
	   Pin.sendKeys(pin);
   }
   public void ClickOnContinue()
   {
	   continueButton.click();
   }
   public void ClickOnorders()
   {
	   orders.click();
   }
}
