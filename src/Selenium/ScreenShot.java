package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot 
{
  public static void main(String[] args) throws IOException, InterruptedException 
  {
	WebDriver obj=AccessBrowser.openC();
	Thread.sleep(3000);
	
	File name=((TakesScreenshot)obj).getScreenshotAs(OutputType.FILE);
	
	File destination=new File("E:\\Screenshot Practice","AmazonHomepage.jpg");
	
	FileHandler.copy(name, destination);
  }
}
