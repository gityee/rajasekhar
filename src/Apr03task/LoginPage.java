package Apr03task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends commonfunction  
{

@FindBy(how = How.XPATH,using = "//input[@name='uname']" )
public static WebElement username;

@FindBy(how = How.XPATH,using = "//input[@name='pwd']" )
public static WebElement password;
	
	
@FindBy(how = How.XPATH,using = "//input[@name='submitBtn']" )
public static WebElement Login;

	
@FindBy(how=How.NAME,using="uname")
	
public static WebElement Username1;
	
	
@FindBy(how=How.NAME,using="pwd")
	
public static WebElement Password1;

public static void sumbit()
{
	Username1.sendKeys("admin");
	Password1.sendKeys("admin");
	Login.click();
}



public static void validate_Login_Fields()
{
	
	boolean status = true ;
	status = waitforelement(username);
	
	
	if (status)
	{
		ss.assertEquals(true, username.isDisplayed());
		
		
	}
	
	
}




}
