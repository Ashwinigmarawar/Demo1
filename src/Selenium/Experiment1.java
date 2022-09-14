package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Experiment1 
{
	public static WebDriver openB()
	   {
		   System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\ASHWINI\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
	       WebDriver obj=new ChromeDriver();
		   obj.navigate().to("https://www.facebook.com/login/?");		   	
		   obj.manage().window().maximize();
		   return obj;
		   
	   }
	public static WebDriver openC() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\ASHWINI\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
	     WebDriver obj=new ChromeDriver();
		  obj.navigate().to("https://www.facebook.com/login/?");
		  Thread.sleep(4000);
	      
		  obj.navigate().back();
	      Thread.sleep(4000);
	      
	      obj.navigate().forward();
	      Thread.sleep(4000);
	      
	      obj.navigate().refresh();
	      Thread.sleep(4000);
	     
	      obj.manage().window().maximize();
	      Thread.sleep(4000);
	      
	      obj.manage().window().minimize();
	      Thread.sleep(4000);
	      
	      return obj;
	}
}
