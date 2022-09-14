package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessBrowserPractice 
{
	public static void main(String[] args) throws InterruptedException 
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
	     
	     //String T1=obj.getTitle();
	    // System.out.println(T1);
	     
	     //String U1=obj.getCurrentUrl();
	    // System.out.println(U1);
	     
	 }
}
