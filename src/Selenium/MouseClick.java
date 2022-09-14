package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseClick 
{
 public static void main(String[] args) throws InterruptedException
 {
	 WebDriver driver=AccessBrowser.openA("https://demo.guru99.com/test/simple_context_menu.html");
     
	 WebElement Rclick=driver.findElement(By.xpath("//span[text()='right click me']"));
	 
	 Actions RightClick=new Actions(driver);
	 RightClick.contextClick(Rclick);
	 RightClick.perform();
	 Thread.sleep(3000);
	 
	 WebElement drop=driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']"));
     drop.click();
     Thread.sleep(2000);
     
     Alert A=driver.switchTo().alert();
     A.accept();
     //String B=A.getText();
     //System.out.println(B);
 } 
}
