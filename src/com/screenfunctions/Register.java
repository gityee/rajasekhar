package com.screenfunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Register

{

	@FindBy(how=How.XPATH,using="// a[text()='Register']")
	
	public static WebElement lnk_register;

public static void clickregister()
{
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	lnk_register.click();
	
}
	

}
