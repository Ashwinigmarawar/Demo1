package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DisplayedMethod 
{
  public static void main(String[] args) throws InterruptedException 
 {
	WebDriver obj=AccessBrowser.openA("https://vctcpune.com/selenium/practice.html#serviceid");
	Thread.sleep(4000);
	
	//WebElement home=obj.findElement(By.xpath("(//a[@class='nav-link'])[1]"));
	Thread.sleep(4000);
	//home.click();
	//Boolean h=home.isDisplayed();
	//Thread.sleep(4000);
	//System.out.println(h);
	
 }
}
