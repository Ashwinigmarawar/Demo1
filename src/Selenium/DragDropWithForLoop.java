package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDropWithForLoop 
{
	public static void main(String[] args) throws InterruptedException 
	{
	  WebDriver driver=AccessBrowser.openA("https://www.globalsqa.com/demo-site/draganddrop/");
		 
	  WebElement Frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	  driver.switchTo().frame(Frame); 

	  List<WebElement> Drag=driver.findElements(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])"));
	  int ToDrag=Drag.size();
	  Thread.sleep(2000);
	  
	  
	  WebElement Drop=driver.findElement(By.xpath("//div[@id='trash']"));
	  Thread.sleep(2000);
	  Actions A=new Actions(driver);
	  
	  /*for(int i=0;i<ToDrag;i++)
	  {
	  WebElement Save=Drag.get(i);
	  A.dragAndDrop(Save, Drop);
	  A.perform();
	  Thread.sleep(2000);
	  }
	  
	  List<WebElement> Restore=driver.findElements(By.xpath("//a[@title='Recycle this image']"));
	  int ToRestore=Restore.size();
	  
	  for(int j=0;j<ToRestore;j++)
	  {
		WebElement BackToPlace= Restore.get(j);
		BackToPlace.click();
		Thread.sleep(2000);
	  }*/
	  for(WebElement Abc:Drag)//for each loop
	  {
		  A.dragAndDrop(Abc, Drop).perform();
		  Thread.sleep(2000);
	  }
	  List<WebElement> Restore=driver.findElements(By.xpath("//a[@title='Recycle this image']"));
	  for(WebElement Abd:Restore)
	  {
		  A.click(Abd).perform();
		  Thread.sleep(2000);
	  }
	}
}
