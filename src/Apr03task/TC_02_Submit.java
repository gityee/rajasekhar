package Apr03task;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC_02_Submit extends commonfunction
{
@Test

public void verifyloginfields1()
{
	
	driver.get("http://server/bank/adminlogin.php");
	driver.manage().window().maximize();
	LoginPage sub1 = PageFactory.initElements(driver,LoginPage.class ) ;
	sub1.sumbit();
	
}

}

