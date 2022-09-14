package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators 
{
  public static void main(String[] args) throws InterruptedException
  {
	  WebDriver obj=AccessBrowser.openB();
	  Thread.sleep(3000);
	  
	  //WebElement idloc=obj.findElement(By.id("email"));//Email id field
	  //idloc.sendKeys("xyz");
	  //obj.findElement(By.id("email")).sendKeys("xyz");
	  //WebElement Nameloc=obj.findElement(By.name("pass"));//password 
	  //Nameloc.sendKeys("12345");
	  
	 // WebElement Tagloc=obj.findElement(By.tagName("button"));//sign up
	  //Tagloc.click();
	  
	  WebElement Classloc=obj.findElement(By.className("_xkt"));//email id
	  Classloc.click();
	  
	  //WebElement Textloc=obj.findElement(By.linkText("Forgotten account?"));
	  //Textloc.click();
	  
	  //WebElement Textloc=obj.findElement(By.partialLinkText("Forgotten account?"));
	  //Textloc.click();
	  
	  
  }
}
