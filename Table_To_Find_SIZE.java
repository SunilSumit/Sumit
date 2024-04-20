package Table_Example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_To_Find_SIZE {
	
public static void main(String[] args) {
	
	
	
								// TO FIND ROW SIZE
	
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();

			List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
			int size1 = rows.size();
			System.out.println("Total number of rows are :- "+size1);

			for(int j=0; j<size1; j++)
			{
				String rowName = rows.get(j).getText();
				System.out.println(rowName);
}
}
}