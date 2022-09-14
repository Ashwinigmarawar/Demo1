package Selenium;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotPractice 
{
//   public static WebDriver ScreenShot(String a,String b,String url) throws IOException, InterruptedException
//   {
//	   WebDriver obj=AccessBrowser.openA(url);
//	   Thread.sleep(3000);
//	   
//	   File name=((TakesScreenshot)obj).getScreenshotAs(OutputType.FILE);
//		
//	   File destination=new File(a,b);
//		
//	   FileHandler.copy(name, destination);
//	   
//	   return obj;
//	  
//   }
   public static void TakeScreeShot(WebDriver driver,String Name) throws IOException
   {
	   String date=ScreenShotPractice.getDate();
	   File name=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	   File destination=new File("E:\\Screenshot Practice\\"+Name+""+date+".jpg");
		
	   FileHandler.copy(name, destination);
	      
   }
   public static String getDate()
   {
	   DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss");
	   LocalDateTime currentTime=LocalDateTime.now();
	   String d=dtf.format(currentTime);
	   return d;
	   
   }
   public static void main(String[] args) throws IOException 
{
	WebDriver driver=AccessBrowser.openA("https://www.facebook.com/login/");
    ScreenShotPractice.TakeScreeShot(driver,"LoginFacebook4");

}
   
}
