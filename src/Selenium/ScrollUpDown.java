package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollUpDown 
{
 public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=AccessBrowser.openA("https://www.facebook.com/login/");
    Thread.sleep(2000);
	
	WebElement LogIn=driver.findElement(By.xpath("//button[@id='loginbutton']"));
    
	
	//((JavascriptExecutor)driver).executeScript("window.scrollBy(100,200)");
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",LogIn);
     Thread.sleep(3000);
     WebElement Facebook=driver.findElement(By.xpath("//img[@alt='Facebook']"));
     ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",Facebook);
}
}
