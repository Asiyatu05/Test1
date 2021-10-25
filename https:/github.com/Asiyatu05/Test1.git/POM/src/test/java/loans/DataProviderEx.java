package loans;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {

	@Test(dataProvider = "getData")
	public void dataProviderExercise(String username, String lastname, String name, String nameOne, String nameTwo) {

		System.out.println("dataprovider");
		System.out.println(username + " " + lastname + " " + name + " " + nameOne + " " + nameTwo);
	}

	@DataProvider
	public Object[][] getData() {

		Object[][] data = new Object[10][5];

		// Iterations:
		//

		data[0][0] = "firstsetusername";
		data[0][1] = "firstsetusername";
		data[0][2] = "firstsetusername";
		data[0][3] = "firstsetusername";
		data[0][4] = "firstsetusername";

		data[1][0] = "secondsetusername";
		data[1][1] = "secondsetusername";
		data[1][2] = "secondsetusername";
		data[1][3] = "secondsetusername";
		data[1][4] = "secondsetusername";

		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdsetusername";
		data[2][2] = "thirdsetusername";
		data[2][3] = "thirdsetusername";
		data[2][4] = "thirdsetusername";

		data[3][0] = "fourthsetusername";
		data[3][1] = "fourthsetusername";
		data[3][2] = "fourthsetusername";
		data[3][3] = "fourthsetusername";
		data[3][4] = "fourthsetusername";

		data[4][0] = "fifthsetusername";
		data[4][1] = "fifthsetusername";
		data[4][2] = "fifthsetusername";
		data[4][3] = "fifthsetusername";
		data[4][4] = "fifthsetusername";

		data[5][0] = "sixthsetusername";
		data[5][1] = "sixthsetusername";
		data[5][2] = "sixthsetusername";
		data[5][3] = "sixthsetusername";
		data[5][4] = "sixthsetusername";

		data[6][0] = "seventhsetusername";
		data[6][1] = "seventhsetusername";
		data[6][2] = "seventhsetusername";
		data[6][3] = "seventhsetusername";
		data[6][4] = "seventhsetusername";

		data[7][0] = "eigthsetusername";
		data[7][1] = "eigthsetusername";
		data[7][2] = "eigthsetusername";
		data[7][3] = "eigthsetusername";
		data[7][4] = "eigthsetusername";

		data[8][0] = "ninethsetusername";
		data[8][1] = "ninethsetusername";
		data[8][2] = "ninethsetusername";
		data[8][3] = "ninethsetusername";
		data[8][4] = "ninethsetusername";

		data[9][0] = "tenthsetusername";
		data[9][1] = "tenthsetusername";
		data[9][2] = "tenthsetusername";
		data[9][3] = "tenthsetusername";
		data[9][4] = "tenthsetusername";

		return data;

	}

}
