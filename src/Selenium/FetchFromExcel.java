package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FetchFromExcel 
{
  public static void main(String[] args) throws EncryptedDocumentException, IOException
  {
	  FileInputStream F=new FileInputStream("C:\\Users\\ASHWINI\\Desktop\\PracticeSelenium.xlsx");
	  String A=WorkbookFactory.create(F).getSheet("Facebook").getRow(0).getCell(0).getStringCellValue();
	  
	  FileInputStream P=new FileInputStream("C:\\Users\\ASHWINI\\Desktop\\PracticeSelenium.xlsx");
	  String B=WorkbookFactory.create(P).getSheet("Facebook").getRow(1).getCell(0).getStringCellValue();
	 
	  WebDriver driver=AccessBrowser.openA("https://www.facebook.com/login/");
	  
	  WebElement Email=driver.findElement(By.xpath("//input[@name='email']"));
	  Email.sendKeys(A);
	  
	  WebElement Pass=driver.findElement(By.xpath("//input[@name='pass']"));
	  Pass.sendKeys(B);
	  
	  
	  
	  
	  
  }
}
