package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class KeyBoardPractice 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=AccessBrowser.openA("https://www.facebook.com/login/");
    
	WebElement SignIn=driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
    SignIn.click();
	Thread.sleep(3000);
    
	WebElement FirstName=driver.findElement(By.xpath("//input[@name='firstname']"));
    FirstName.sendKeys("Rani");
    
    Actions Act=new Actions(driver);
    Act.sendKeys(Keys.TAB);
    Act.sendKeys("Mukharjee");//last name
    Act.sendKeys(Keys.TAB);
    Act.sendKeys("1234567890");//mobile
    Act.sendKeys(Keys.TAB);
    Act.sendKeys("Abc123@!");//password
    Act.sendKeys(Keys.TAB);//?
    Act.sendKeys(Keys.TAB);//dob
    
    /*Act.keyDown(Keys.ALT);
    Act.keyDown(Keys.ARROW_DOWN);
    Act.keyUp(Keys.ARROW_DOWN);
    Act.keyUp(Keys.ALT);
    Act.sendKeys(Keys.TAB);*/
    
    Act.sendKeys("8");
    Act.sendKeys(Keys.TAB);
    Act.sendKeys("December");
    Act.sendKeys(Keys.TAB);
    Act.sendKeys("2021");
    Act.sendKeys(Keys.TAB);
    Act.sendKeys(Keys.TAB);
    //Act.sendKeys("male");
    Act.keyDown(Keys.ARROW_RIGHT);
    Act.keyUp(Keys.ARROW_RIGHT);
    Act.sendKeys(Keys.ENTER);
    Act.build().perform();


}
}
