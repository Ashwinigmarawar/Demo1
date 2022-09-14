package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FaceBookPage 
{
	public FaceBookPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='email']")private WebElement Email;
	@FindBy(xpath="//input[@id='pass']")private WebElement Password;
	@FindBy(xpath="//button[@name='login']")private WebElement LogIn;
	@FindBy(xpath="//a[text()='Forgotten password?']")private WebElement Forgot;
	@FindBy(xpath="(//a[@role='button'])[2]")private WebElement SignUp;
	@FindBy(xpath="//a[text()='Create a Page']")private WebElement CreatePage;
    @FindBy(xpath="//select[@id='day']")private WebElement Day;
    @FindBy(xpath="//input[@name='firstname']")private WebElement FirstName;
    @FindBy(xpath="//input[@name='lastname']")private WebElement Surname;
    @FindBy(xpath="(//input[@type='text'])[4]")private WebElement EmailOrMobileNo;
    @FindBy(xpath="(//input[@type='password'])[2]")private WebElement NewPassword;
    @FindBy(xpath="//select[@name=\"birthday_month\"]")private WebElement Month;
    @FindBy(xpath="//select[@name='birthday_year']")private WebElement Year;
    @FindBy(xpath="(//input[@type='radio'])[1]")private WebElement FemaleRadioButton;
    @FindBy(xpath="(//input[@type='radio'])[2]")private WebElement MaleRadioButton;
    @FindBy(xpath="(//input[@type='radio'])[3]")private WebElement CustomRadioButton;
    
    public void EnterEmail(String GetData)
    {
    	Email.sendKeys(GetData);
    }
    public void EnterPassword(String Pass)
    {
    	Password.sendKeys(Pass);
    }	
    public void ClickOnLogIn()
    {
    	LogIn.click();
    }
    public void ClickOnForgotPassword()
    {
    	Forgot.click();
    }
    public void ClickOnSignUp()
    {
    	SignUp.click();
    }
    public void ClickOnCreatePage()
    {
    	CreatePage.click();
    }
    public void EnterFirstName(String Name)
    {
    	FirstName.sendKeys(Name);
    }
    public void EnterSurname(String SurName)
    {
    	Surname.sendKeys(SurName);
    }
    public void EnterEmailOrMobileNo(String b)
    {
    	EmailOrMobileNo.sendKeys(b);
    }
    public void EnterNewPassword(String c)
    {
    	NewPassword.sendKeys(c);
    }
    public void ClickOnDay(String a)
    {
    	Select s=new Select(Day);
    	s.selectByVisibleText(a);
    }
    public void ClickOnMonth(String a)
    {
    	Select s=new Select(Month);
    	s.selectByVisibleText(a);
    }
    public void ClickOnYear(String a)
    {
    	Select s=new Select(Year);
    	s.selectByVisibleText(a);
    }
    public void ClickOnRadioButtonFemale()
    {
    	FemaleRadioButton.click();
    }
    public void ClickOnRadioButtonMale()
    {
    	MaleRadioButton.click();
    }
    public void ClickOnRadioButtonCustom()
    {
    	CustomRadioButton.click();
    }
 }
