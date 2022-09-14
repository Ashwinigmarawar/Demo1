package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Table 
{
  public static void main(String[] args) 
 {
	WebDriver driver=AccessBrowser.openA("https://demo.guru99.com/test/web-table-element.php");
    
    List<WebElement> element=driver.findElements(By.xpath("//table[1]//tbody[1]//tr//td[3]"));
    double max=1000;
    for(int i=1;i<element.size();i++)
    {
    	WebElement a=element.get(i);
    	String result=a.getText();
    	
    	double newvalue=Double.parseDouble(result);
    	
    	if(newvalue < max)
    	{
    		max= newvalue;
    	}
    
    }
 
    System.out.println("Minimum price is " + max);
 }
}
