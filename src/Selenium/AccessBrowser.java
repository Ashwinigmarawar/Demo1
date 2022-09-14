package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessBrowser 
{
	
	public static WebDriver openA(String url)
	   {
		   System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\ASHWINI\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
	       WebDriver obj=new ChromeDriver();
		   obj.navigate().to(url);		   	
		   obj.manage().window().maximize();
		   return obj;
		   
	   }
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
		   obj.navigate().to("https://www.amazon.in");		   	
		   obj.manage().window().maximize();
		   return obj;
		   
	   }
	public static WebDriver openD()
	   {
		   System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\ASHWINI\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
	       WebDriver obj=new ChromeDriver();
		   obj.navigate().to("https://demo.guru99.com/");		   	
		   obj.manage().window().maximize();
		   return obj;
		   
	   }
	public static WebDriver openE()
	   {
		   System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\ASHWINI\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
	       WebDriver obj=new ChromeDriver();
		   obj.navigate().to("https://vctcpune.com/");		   	
		   obj.manage().window().maximize();
		   return obj;
		   
	   }	
	public static void main(String[] args) 
	{
		AccessBrowser.openA("https://vctcpune.com/");
	}
  
  
}
