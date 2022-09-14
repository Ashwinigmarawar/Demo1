package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopUpPractice 
{
 public static void main(String[] args) throws InterruptedException 
 {
	WebDriver obj=AccessBrowser.openA("https://nxtgenaiacademy.com/alertandpopup/");
	Thread.sleep(3000);
	
	WebElement Promt=obj.findElement(By.xpath("//button[@name='promptalertbox1234']"));
	Promt.click();
	Thread.sleep(3000);
	
	Alert a=obj.switchTo().alert();
	//a.accept();
	//a.dismiss();
	//a.sendKeys("Yes/No");
	String Text=a.getText();
	System.out.println(Text);
	
 }
}

