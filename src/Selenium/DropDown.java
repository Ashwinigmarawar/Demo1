package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{
  public static void main(String[] args) throws InterruptedException 
 {
	WebDriver obj=AccessBrowser.openA("https://vctcpune.com/selenium/practice.html");
	Thread.sleep(2000);
	
	WebElement drop=obj.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	//drop.click();
	//Thread.sleep(3000);
	//drop.clear();
	Thread.sleep(3000);
	Select a=new Select(drop);
	//a.selectByValue("option1");//by value
	//a.selectByIndex(2);//by index
	a.selectByVisibleText("Option3");//by visible text
	
 }
}
