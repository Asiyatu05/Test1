package pageObjectsDstv;




import org.openqa.selenium.By;

import frameWorkClasses.BasePage;

public class LandingPage extends BasePage{
	
	
	
    public void hiworld() {
		System.out.println("This works");
	}
    
    public void clickSignIn() {
		clickElement(By.xpath("//img[@alt='Sign in']"));
	}

}
