package Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization 
{
   public static String GetData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
   {
	   FileInputStream F=new FileInputStream("C:\\Users\\ASHWINI\\Desktop\\PracticeSelenium.xlsx");
	   String A=WorkbookFactory.create(F).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	   return A;
   }
}
