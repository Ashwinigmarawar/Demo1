package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MethodsOfWebElement 
{
 public static void main(String[] args) throws InterruptedException 
 {
	WebDriver obj=AccessBrowser.openA("https://vctcpune.com/selenium/practice.html");
	Thread.sleep(8000);
	
	//Dimension d=new Dimension(200,800);
	//obj.manage().window().setSize(d);
	//Thread.sleep(4000);
	
	//WebElement radioButton=obj.findElement(By.xpath("//input[@name='radio'][1]"));
	//Thread.sleep(4000);
	
	//Boolean s=radioButton.isSelected();
	//System.out.println(s);
	
	//radioButton.click();
	
	//Boolean newS=radioButton.isSelected();
	//System.out.println(newS);
	
	//WebElement showBox=obj.findElement(By.xpath("//input[@id='show-textbox']"));
	//showBox.click();
	//Thread.sleep(4000);
	
	WebElement type=obj.findElement(By.xpath("//input[@id='displayed-text']"));
	type.sendKeys("Velocity");
	Thread.sleep(4000);
	
	type.clear();
	Thread.sleep(4000);
	
	//Boolean Box=type.isDisplayed();
	//System.out.println(Box);
	//Thread.sleep(4000);
	
	WebElement HideBox=obj.findElement(By.xpath("//input[@id='hide-textbox']"));
	HideBox.click();
	Thread.sleep(4000);
	
	WebElement showBox=obj.findElement(By.xpath("//input[@id='show-textbox']"));
	showBox.click();
	Thread.sleep(4000);
	
	
	//Boolean Hide=HideBox.isEnabled();
	//System.out.println(Hide);
	//Thread.sleep(4000);
	
	WebElement text=obj.findElement(By.xpath("//h1[@class=' header1 font-weight-bold text-white text-center']"));
	String t=text.getText();
	System.out.println(t);
	
	
	
	
 }
}
