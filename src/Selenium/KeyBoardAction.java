package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction 
{
 public static void main(String[] args) 
{
	 WebDriver driver=AccessBrowser.openA("https://demoqa.com/text-box");
     
	 WebElement FirstName=driver.findElement(By.xpath("//input[@id='userName']"));
     FirstName.sendKeys("Rani");
     
     Actions Act=new Actions(driver);
     
     Act.sendKeys(Keys.TAB);
     Act.sendKeys("abc12@gmail.com");
     Act.sendKeys(Keys.TAB);
     Act.sendKeys("New nagar,nagpur");
     Act.keyDown(Keys.CONTROL);
     Act.sendKeys("a");
     Act.keyUp(Keys.CONTROL);
     Act.keyDown(Keys.CONTROL);
     Act.sendKeys("c");
     Act.keyUp(Keys.CONTROL);
     Act.sendKeys(Keys.TAB);
     Act.keyDown(Keys.CONTROL);
     Act.sendKeys("v");
     Act.keyUp(Keys.CONTROL);
     Act.sendKeys(Keys.TAB);
     Act.sendKeys(Keys.ENTER);
     Act.build().perform();
     

}
}
