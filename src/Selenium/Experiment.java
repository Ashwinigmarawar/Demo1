package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Experiment 
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
	public static WebDriver openC()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ASHWINI\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
					WebDriver obj=new ChromeDriver();
					//obj.get
					//("https://www.amazon.in/");
				     obj.navigate().to("https://www.amazon.in");
				     obj.manage().window().maximize();
					return obj;
	}
public static void main(String[] args) throws InterruptedException 
{
	
	  //AccessBrowser.openC();
  Thread.sleep(4000);
  AccessBrowser.openB();
  //obj.navigate().back();
  //Thread.sleep(4000);
  //obj.navigate().forward();
  //Thread.sleep(4000);
  //obj.navigate().refresh();
  //Thread.sleep(4000);
  
  //obj.manage().window().maximize();
  //Thread.sleep(4000);
  //obj.manage().window().minimize();
  //Thread.sleep(4000);
  
  //String T1=obj.getTitle();
 // System.out.println(T1);
  
  //String U1=obj.getCurrentUrl();
 // System.out.println(U1);
  
  
 
  
  






}

}
