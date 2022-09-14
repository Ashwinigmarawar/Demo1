package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Selenium.AccessBrowser;

public class CalenderSelect 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=AccessBrowser.openA("https://www.akbartravels.com/in/flight");
	Thread.sleep(4000);
	
	WebElement calender=driver.findElement(By.xpath("//li[@class='depart']"));
	calender.click();

	
	WebElement month=driver.findElement(By.xpath("(//div[@class='month-head'])[1]"));
	String a=month.getText();
	System.out.println(a);
	String Month="SEPTEMBER 2023";
	String date="15";
	while(true)
		{
		  if(month.equals(Month))
		  {
			break;  
		  }
		  else
		  {
			  driver.findElement(By.xpath("//mat-icon[text()='arrow_forward']")).click();
		     
		  }
		}
	    List<WebElement> alldate=driver.findElements(By.xpath("//div[@fxlayoutalign='center center']"));
	    for(WebElement c:alldate)
	    {
	       System.out.println(c.getText());
	    }
	}
}
