package pageObjectExercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import frameWorkClasses.BasePage;

public class TableScrapingExercise extends BasePage{
	
	//row //*[@id="leftcontainer"]/table/tbody/tr
	//column //*[@id="leftcontainer"]/table/tbody/tr[1]/td
	
	public void gotToTablesDemo() {
		driver.get("http://demo.guru99.com/test/web-table-element.php");
	}
	
	public void tablesExerciseDemo() {
		gotToTablesDemo();
		
		//To locate table
		WebElement mytable = getElement(By.xpath("//tbody"));
		
		//To locate rows of table
		List<WebElement> rows_table = mytable.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("The number of rows are : " + rows_table.size());
		
		//To locate columns of table
		List<WebElement> columns_table = mytable.findElements(By.xpath("//table/tbody/tr[1]/td"));
		System.out.println("The number of columns are : " + columns_table.size());
		
		
		System.out.println("The value of the fourth row and fourth column is : " + driver.findElement(By.xpath("//table/tbody/tr[4]/td[4]")).getText());
	}
	
}
