package pageObjectDemo;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import frameWorkClasses.BasePage;

public class TableScraping extends BasePage{
	
	public void gotToTablesDemo() {
		driver.get("http://demo.guru99.com/test/table.html");
	}
	
	public void tablesDemo() {
		gotToTablesDemo();
		
		//To locate table
		WebElement mytable = getElement(By.xpath("//tbody"));
		
		//To locate rows of table
		List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
		
		//To calculate no. of rows in table
		int rows_count = rows_table.size();
		
		//Loop will execute till the last row of table
		for(int row = 0; row < rows_count; row++) {
			
			//To locate columns(cells) of that specific row
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName("td"));
			
			//To calculate no. of columns (cells). In that specific row
			int columns_count  = Columns_row.size();
			System.out.println("Number of cells in a Row " +  row + " are " +  columns_count);
			
			//Loop will execute till the last cell of that specific row
			for(int column = 0; column < columns_count; column++) {
				
				//To retrieve text from that specific cell
				String celText = Columns_row.get(column).getText();
				System.out.println("Cell value of row number " +  row + " and column number " + column +  " is " + celText);
			}
		}
		
		
	}

	
	
	
}
