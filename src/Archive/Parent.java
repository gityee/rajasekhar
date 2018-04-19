package Archive;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Parent {
	
	@BeforeSuite
	public void login()
	{
	
	System.out.println("this is BeforeSuite");	
	}
	  
	@BeforeTest
		public void login1()
		{
		System.out.println("this is Beforetest");
		
		}
			
	@BeforeClass
		public void login2()
		{
		
		System.out.println("this is Beforeclass");
		}
	  
	@BeforeMethod
	public void login3()
	{
		
		System.out.println("this is BeforeMethod");
	}
	
	@AfterSuite
	public void login4()
	{
		System.out.println("this is AfterSuite");
		
	}
	  
	@AfterTest
		public void login5()
		{
			
		System.out.println("this is Aftertest");
		}
			
	@AfterClass
		public void login6()
		{
		
		System.out.println("this is Afterclass");
		}
	  
	@AfterMethod
	public void login7()
	{
		System.out.println("this is Aftermethod ");
		
	}
	
	
	
	
	
}
