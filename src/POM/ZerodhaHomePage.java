package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Selenium.AccessBrowser;

public class ZerodhaHomePage 
{
	public ZerodhaHomePage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  @FindBy(xpath="//input[@icon='search']")private WebElement Search;
  @FindBy(xpath="//span[text()='ADANIPORTS']")private WebElement adanishare;
  @FindBy(xpath="//button[@data-balloon='Buy']")private WebElement sharebuy;
  @FindBy(xpath="(//span[text()='TATAINVEST'])[1]")private WebElement tata;
  @FindBy(xpath="//button[@class='button-outline cancel']")private WebElement cancel;
  @FindBy(xpath="//button[@data-balloon='Sell']")private WebElement sharesell;
  @FindBy(xpath="//span[@class='icon icon-plus']")private WebElement watchlist;
  @FindBy(xpath="//span[@class='icon icon-trash']")private WebElement delete;
  @FindBy(xpath="(//label[@class='su-radio-label'])[7]")private WebElement popupintraday;
  @FindBy(xpath="(//label[@class='su-radio-label'])[10]")private WebElement limit;
  public void tosearchshare()
  {
	  Search.sendKeys("TATAINVEST");
  }
  public void MoveToShare(WebDriver driver)
  {
	  Actions a=new Actions(driver);
	  a.moveToElement(tata).perform();
  }
  public void ClickOnsharebuy()
  {
	  sharebuy.click();
  }
  public void ClickOnsharesell()
  {
     sharesell.click();
  }
 public void Addtowatchlist()
 {
	 watchlist.click();
 }
 public void deleteFromWatchList()
 {
	 delete.click();
 }
 public void ClickOnpopupcancel()
 {
	 cancel.click();
 }
 public void ClickOnpopupBuy()
 {
	 popupintraday.click();
 }
public void ClickOnLimit()
{
	limit.click();
}
}
