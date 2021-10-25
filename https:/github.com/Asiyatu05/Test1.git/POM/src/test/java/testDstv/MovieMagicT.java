package testDstv;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import pageObjectDemo.TableScraping;
import pageObjectExercise.TableScrapingExercise;
import pageObjectsDstv.LandingPage;
import pageObjectsDstv.SignIn;

public class MovieMagicT {
	//instantiate the page objects
	LandingPage lp = new LandingPage();
	SignIn sn = new SignIn();
	TableScraping ts = new TableScraping();
	TableScrapingExercise tse = new TableScrapingExercise();
	
	@Test
	public void GIVEN_NavigationToLandingPage_WHEN_OnlyPasswordEntered_AND_SignInButtonClicked_THEN_Error() {
		
//		lp.hiworld();
//		System.out.println("This works");
		//GIVEN
		//Click Sign In
		lp.clickSignIn();
		
		//Enter password "dsfgdgfgdg"
		sn.enterPassword("garbage");
		
		//WHEN
		//Click Sign In Button
		sn.clickSignInButton();
		
		
		String actual = sn.checkUserNameError();
		String expected = "Email or Mobile number is required";
		
		
		//THEN
		AssertJUnit.assertEquals(actual, expected);
	}
	
	@Test
	public void DemoTestTable() {
		

		ts.tablesDemo();
		
		
	}
	
@Test	
public void ExerciseTestTable() {
		

		tse.tablesExerciseDemo();
		
		
	}
	
	
	
	
	
	@AfterSuite
	public void cleanUp () {
		lp.cleanUp();
	}

}
