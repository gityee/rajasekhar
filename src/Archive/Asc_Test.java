package Archive;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Listeners(testnglist.Testng_listners.class) 
public class Asc_Test 

{
	
public static  SoftAssert a=new SoftAssert(); 
	@Test
	public static void test ()
	{
	a.assertEquals("A", "A");
	System.out.println(" Execution finish");
	a.assertAll();
	
	}
	
	
	
	
}
