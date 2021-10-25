package loans;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class beforeAfterSuite {
	
	@BeforeSuite
	public void GlobalVariables () 
	{
		
		System.out.println("Set global vars before we start");
	}
	
	@AfterSuite
	public void GlobalVariablesReset () 
	{
		
		System.out.println("Reset global vars");
	}

}
