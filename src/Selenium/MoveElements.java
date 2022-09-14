package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MoveElements 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=AccessBrowser.openA("https://www.amazon.in/");
    
	WebElement Mouse=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
    Actions Act=new Actions(driver);
    Thread.sleep(2000);
    
    Act.moveToElement(Mouse).perform();
    
    WebElement WishList=driver.findElement(By.xpath("(//a[@class='nav-link nav-item'])[2]"));
    WishList.click();
}
}
