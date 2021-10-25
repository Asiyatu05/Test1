package loans;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frameWorkClasses.ReadExcel;

public class ExcelDataProvider {
	
	ReadExcel rExcel = new ReadExcel();
	
	
	@Test(dataProvider = "examData")
	public void personalData(String Username, String Lastname) {

		System.out.println("personaData");
		System.out.println(Username + " " + Lastname);
	}
	
	
	@DataProvider(name = "examData")
	
	public Object[][]  getDataFromExcel() throws IOException {

		String excelDirectory = rExcel.getDataConfigProperties("excelDataDir");
        Object [][] arrObj = rExcel.getExcelData(excelDirectory+"ExcelData.xlxs", "Sheet1");
        
        return arrObj;
}
	
	
}