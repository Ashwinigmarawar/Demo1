package Selenium;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseClick1 
{
public static void main(String[] args) throws InterruptedException 
{
  WebDriver driver=AccessBrowser.openA("https://demo.guru99.com/test/simple_context_menu.html");
  
  WebElement DClick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
  
  Actions DoubleClick=new Actions(driver);
  DoubleClick.doubleClick(DClick);
  DoubleClick.perform();
  Thread.sleep(3000);
  
  Alert A=driver.switchTo().alert();
  //A.accept();
  String B=A.getText();
  System.out.println(B);
	
	
	
	
	
	
	
	
	
	
	
}
}
