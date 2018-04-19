package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;



	public class OrangeHRM_login {
		WebDriver driver;
		
		@BeforeMethod()
		
		public void login()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
	
		
	}

		@AfterMethod()
		public void quit()
		{
			driver.quit();
	
		
			
		}

		private void getTitle() {
			// TODO Auto-generated method stub
			
		}
		
		
}
