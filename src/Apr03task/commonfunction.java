package Apr03task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class commonfunction {
public static WebDriver driver = new FirefoxDriver();
public static SoftAssert ss = new SoftAssert();
public static boolean waitforelement (WebElement element)
{
	boolean status= true;
	
	
	for (int i=1;i<=10;i++)
	{
		try
		{
			System.out.println("Wait is  executing");
			status = true ;
			Actions acc = new Actions(driver);
			acc.moveToElement(element).build().perform();
			System.out.println("Element is found");
			break;
		}
		catch (Exception e)
		{
			status = false;
			
			try
			{
				Thread.sleep(1000);
				
			}
			
			catch (Exception e1)
			{
				
			}
		}
	
	}
		 
		
		System.out.println("Wait is completed");
	
	return status;
	
	
}



	
	
	
}
