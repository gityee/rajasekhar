package Apr03task;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC_01_VerifyLoginFields extends commonfunction
{
@Test

public void verifyloginfields()
{
	driver.get("http://server/bank/adminlogin.php");
	driver.manage().window().maximize();
	LoginPage lp = PageFactory.initElements(driver,LoginPage.class ) ;
	lp.validate_Login_Fields();
	lp.sumbit();
}



}

