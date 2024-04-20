package Table_Example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Nested_Table {
	
public static void main(String[] args) {
	
	
	System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/accessing-nested-table.html");
	driver.manage().window().maximize();
	
	List<WebElement> nestedTableRow = driver.findElements(By.xpath("/html/body/center/table/tbody/tr[2]/td[2]/table/tbody/tr"));
	int size = nestedTableRow.size();
	
	for(int i=0; i<size; i++)
	{
		String value = nestedTableRow.get(i).getText();
		System.out.println(value);
	}
}

}