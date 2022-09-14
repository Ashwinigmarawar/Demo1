package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Iframe 
{
  public static void main(String[] args) throws InterruptedException
  {
	  WebDriver driver=AccessBrowser.openA("https://vctcpune.com/selenium/practice.html");
	  
	  driver.switchTo().frame(0);
	  
	  Thread.sleep(3000);
	  
	  WebElement Courses=driver.findElement(By.xpath("(//a[text()='Courses'])[1]"));
	  Courses.click();
  }
}
