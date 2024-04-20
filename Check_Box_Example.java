package Check_Box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Box_Example {

	
	public static void main(String[] args) {
		
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//: To click on the single checkbox we need to find out the element we need to click on it
		
//		WebElement checkbox1 = driver.findElement(By.id("checkbox1"));
//		checkbox1.click();
//		
//		// to check if the check-box is already selected or not we need to implement a logic
//		
//		if(checkbox1.isSelected())
//		{
//			System.out.println("Check-box is selected by default");
//		}
//		else
//		{
//			checkbox1.click();
//		}
	
	//2: To select multiple check-box in single code we will use below method
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
		
		int size = checkboxes.size();
		System.out.println(size);
		// checkboxes.get(0).click();        // To select the single check-box
	
//		for(int i = 0; i<size;	i++)
//		{
//		checkboxes.get(i).click();
//		}
		
		for(int i = 0; i<size;	i++)
			// Get attribute is use to fetch the value of element attribute as per given 
			{
				String value = checkboxes.get(i).getAttribute("value");
				if(value.equalsIgnoreCase("Hockey"))
				{
					checkboxes.get(i).click();
			}
			}
}
}