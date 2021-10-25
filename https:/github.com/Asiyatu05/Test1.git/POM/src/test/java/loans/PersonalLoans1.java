package loans;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class PersonalLoans1 {

	@Test
	public void fifthTest() {

		System.out.println("fifthTest");
	}

	@Test
	public void sixthTest() {

		System.out.println("sixthTest");
	}

	@Test(dataProvider = "getData")
	public void personalLoanFraudTest(String username, String lastname) {

		System.out.println("personalLoanFraud");
		System.out.println(username + " " + lastname);
	}

	@DataProvider
	public Object[][] getData() {

		Object[][] data = new Object[3][2];

		//Iterations:
		//
		
		data[0][0] = "firstsetusername";
		data[0][1] = "firstsetusername";

		data[1][0] = "secondsetusername";
		data[1][1] = "secondsetusername";

		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdsetusername";

		return data;

	}

}
