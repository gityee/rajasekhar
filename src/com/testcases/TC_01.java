package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.screenfunctions.Register;

public class TC_01 {
	
	
	
	public static WebDriver driver; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new FirefoxDriver();
		driver.get("https://www.nopcommerce.com/demo.aspx");
		driver.manage().window().maximize();
		
		Register reg = PageFactory.initElements(driver, Register.class)	;
		reg.clickregister();
		

	}

}

