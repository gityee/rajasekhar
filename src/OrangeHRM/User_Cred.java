package OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class User_Cred extends OrangeHRM_login 

{
	@Test (priority=1) 
	public void tc01()
	{
		
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.id("btnLogin")).click();
		
				
		String a= driver.findElement(By.id("welcome")).getText();

		if (a.contains("Welcome"))
			{
				System.out.println("User successfully loggedin ");
				
			}
			
				else

				{
					System.out.println("User successfully loggedin ");
				}
				
				
					
			}
		}




	