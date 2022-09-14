package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFacebook 
{
    public static void main(String[] args) throws InterruptedException
    {
     WebDriver obj=AccessBrowser.openA("https://www.facebook.com/");
     Thread.sleep(4000);
     
     WebElement create=obj.findElement(By.xpath("(//a[@role='button'])[2]"));
     create.click();
     Thread.sleep(6000);
     
     WebElement firstname=obj.findElement(By.xpath("(//input[@type='text'])[2]"));
     firstname.sendKeys("ashwini");
     Thread.sleep(4000);
     
     WebElement sign=obj.findElement(By.xpath("(//button[@type='submit'])[2]"));
     sign.click();
   }
    
	
 
}
