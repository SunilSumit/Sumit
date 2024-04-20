package Table_Example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_To_Find_Column {
public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		// To fetch all columns from the table we use below method
		
		
				
											// TO FIND COLUMN SIZE
		
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		int size = columns.size();
		System.out.println("Total no of column is:-"+size);
		
		for(int i=0; i<size; i++)
		{
		String columnName = columns.get(i).getText();
		System.out.println(columnName);
		if(columnName.equalsIgnoreCase("Company"))
		{
			System.out.println(" We have column name as per requirement");
		}
		}
		}
		}
		
