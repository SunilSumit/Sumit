package CSS_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2_Get_Text_And_Clear_Method {
	
public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("sumitpal66@ymail.com");
		
		// To clear the populated text in text box we use clear method
		username.clear();
		
		WebElement text = driver.findElement(By.tagName("h1"));
		
		// To fetch the value of particular elements we can use get text method
		String value = text.getText();
		System.out.println(value);
 
}
}