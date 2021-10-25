package loans;

import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class HomeLoans1 {
	
	@Test
	public void firstTest() {
		
		System.out.println("firstTest");
	}
	@Test
    public void secondTest() {
    	
	    System.out.println("secondTest");
	    
	    String actual = "Pass";
	    String expected = "Pass";
	    
	    Reporter.log(actual);
	    Reporter.log(expected);
	}
	
	
	@Test
    public void homeLoanFraudTest() {
    	
	    System.out.println("homeLoanFraud");
	}
	
	@BeforeTest
	public void cleanDB () 
	{
		
		System.out.println("Then the database before we start");
	}

}
