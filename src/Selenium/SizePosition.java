package Selenium;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class SizePosition 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver obj=AccessBrowser.openA("https://vctcpune.com/");
	Thread.sleep(4000);
	
	Dimension d=new Dimension(400,700);
	obj.manage().window().setSize(d);
	Thread.sleep(4000);
	
	Point p=new Point(500,600);
	obj.manage().window().setPosition(p);
	Thread.sleep(4000);
}
}
