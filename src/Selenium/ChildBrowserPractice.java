package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowserPractice 
{
 public static void main(String[] args) throws InterruptedException 
 {
	WebDriver obj=AccessBrowser.openA("https://vctcpune.com/");
	Thread.sleep(3000);
	
	WebElement S=obj.findElement(By.xpath("(//a[@target='_blank'])[1]"));
	S.click();
	//S.click();
	//S.click();
	
	Set<String> b=obj.getWindowHandles();
	Iterator<String> c=b.iterator();
	
	while(c.hasNext())
	{
		String d=c.next();
		obj.switchTo().window(d);
		String Title=obj.getTitle();
		
		if(Title.equals("Practice page"))
		{
			WebElement home=obj.findElement(By.xpath("(//a[@class='nav-link'])[1]"));
			home.click();
			Thread.sleep(5000);
		}
		else
		{
			obj.close();
		}
	}
	
 }
}
