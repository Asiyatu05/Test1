package loans;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class HomeLoans2 {
	
	@Test
	public void thirdTest() {
		
		System.out.println("thirdTest");
		Assert.assertTrue(false);
	}
	@Test
    public void fourthTest() {
    	
	    System.out.println("fourthTest");
	}
	
	@BeforeTest
	@AfterTest
	public void cleanDBTwo () 
	{
		
		System.out.println("Clean the database before we start and end");
	}
}
