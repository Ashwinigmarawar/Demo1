package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Selenium.AccessBrowser;

public class Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
    WebDriver driver=AccessBrowser.openA("https://demoqa.com/automation-practice-form");
    
    WebElement CalenderDRop=driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
    CalenderDRop.click();
    Thread.sleep(2000);
    
   // WebElement Calender=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
    //Select S=new Select(Calender);
    //S.selectByVisibleText("December");

}}
