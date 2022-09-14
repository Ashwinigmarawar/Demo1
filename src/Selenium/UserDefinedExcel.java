package Selenium;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserDefinedExcel 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	WebDriver driver=AccessBrowser.openA("https://www.facebook.com/");
	
	WebElement Email=driver.findElement(By.xpath("//input[@name='email']"));
	Email.sendKeys(Parameterization.GetData("Facebook", 0, 0));
}
}
