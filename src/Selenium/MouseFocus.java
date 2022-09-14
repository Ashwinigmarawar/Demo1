package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseFocus 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=AccessBrowser.openA("https://www.amazon.in/");
    
	WebElement AutoFocus=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));

    Actions A=new Actions(driver);
    A.moveToElement(AutoFocus);
    A.perform();
    Thread.sleep(2000);
    
    WebElement WishList=driver.findElement(By.xpath("//span[text()='Your Wish List']"));
    WishList.click();
}
}
