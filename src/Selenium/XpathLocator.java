package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathLocator 
{
  public static void main(String[] args) throws InterruptedException
  {
	  WebDriver obj=AccessBrowser.openB();
	  Thread.sleep(3000);
	  
	  //obj.findElement(By.xpath("//input[@type='text']")).sendKeys("xyz");
	  //Thread.sleep(3000);
	  
	  //obj.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
	  //Thread.sleep(3000);
	  
	  //obj.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0 _52e0 _4jy6 ')]")).click();
	  //Thread.sleep(3000);
	  
	  WebElement a=obj.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[3]/button"));
	  a.click();
	  Thread.sleep(3000);
	  
  }
}
