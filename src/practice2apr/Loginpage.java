package practice2apr;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testnglist.Testng_listners.class) 

public class Loginpage {
	WebDriver driver = new FirefoxDriver();

	@Test
	public void login() {
		driver.get("http://server/bank/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement abc = driver.findElement(By.xpath("//input[@type='submit']"));
		String str = abc.getText();
		abc.assertEquals ("Admin" , str, "Login successful");
		System.out.println("Complated");
		assert.assertall();
		
	}

	private boolean assertall() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
