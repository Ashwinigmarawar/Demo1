package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowserPopUp 
{
	public static void main(String[] args) 
	{
		
	
   WebDriver obj=AccessBrowser.openA("https://vctcpune.com/");
   
   WebElement Start=obj.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
   Start.click();
   
   String a=obj.getWindowHandle();//main page
   System.out.println(a);
   
   Set<String> b=obj.getWindowHandles();
   Iterator <String> c=b.iterator();
   String d=c.next();
   String e=c.next();
   System.out.println(d);
   System.out.println(e);
  
} }
