package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HiddenDivisionPopUp 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver obj=AccessBrowser.openA("https://vctcpune.com/selenium/practice.html");
	
	//WebElement Start=obj.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
	//Start.click();
	//Thread.sleep(3000);
	
	WebElement Alert=obj.findElement(By.xpath("(//input[@class='btn-style'])[1]"));
	Alert.click();
	Thread.sleep(3000);
	
	Alert a=obj.switchTo().alert();
	//a.accept();
	a.getText();

}
}
