package Radio_Button;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button_Example {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
//		WebElement radiobutton1 = driver.findElement(By.xpath("//*[@value='Male']"));
//		radiobutton1.click();	
//		
//		if(radiobutton1.isSelected())
//		{
//			System.out.println(" Radio button is aleady selected");
//		}
//		else
//		{
//			radiobutton1.click();
//		}
//		
			// Dynamic check-box
		
		List<WebElement> allradio = driver.findElements(By.xpath("//*[@type='radio']"));
		for(int i=0; i<allradio.size(); i++)
		{
			String value =allradio.get(i).getAttribute("value");
			if(value.equalsIgnoreCase("Male"))
		{
			allradio.get(i).click();
		}
			else
			{
				System.out.println(" Please select appropriate gender");
			}
		}
	
	}
}
