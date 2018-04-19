package com.TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Data1Excel 
{
public static void main (String[] args) throws IOException
{
	 FirefoxDriver driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("http://server/bank/");
	 driver.findElementByXPath("//a[text()='Staff ']" ).click();
	 driver.findElementByXPath("//input[@type='submit']" ).click();
	
	 
	
	 List<WebElement> list=driver.findElements(By.xpath("//div[@class='customer_nav']/ul/li"));

	 File f1 = new File("C:\\Users\\s8\\Desktop\\raj","abc.txt");
	 FileInputStream inputStream = new FileInputStream(f1);
	 
	FileWriter fw  = new FileWriter(f1); 
	fw.write(list);
	fw.flush();
	fw.close();
		 
	 
	 		
}

}
