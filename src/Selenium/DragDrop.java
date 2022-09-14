package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDrop 
{
 public static void main(String[] args) throws InterruptedException 
{
  WebDriver driver=AccessBrowser.openA("https://www.globalsqa.com/demo-site/draganddrop/");
	 
  WebElement Frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
  driver.switchTo().frame(Frame); 

  WebElement Drag=driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[1]"));
  Thread.sleep(2000);
  WebElement Drop=driver.findElement(By.xpath("//div[@id='trash']"));
  Thread.sleep(2000);	 
  
  Actions A=new Actions(driver);
  A.dragAndDrop(Drag, Drop);
  A.perform();
  Thread.sleep(2000);
  
  WebElement Restore=driver.findElement(By.xpath("//a[@title='Recycle this image']"));
  Restore.click();	 
}
 
}
