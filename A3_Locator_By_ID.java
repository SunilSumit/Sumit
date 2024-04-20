package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3_Locator_By_ID {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// To Find the element by using id locator firstly we need to create reference variable 
		driver.get("https://demo.guru99.com/test/facebook.html");
		WebElement username 	=  driver.findElement(By.id("email"));   
		WebElement password 	= driver.findElement(By.id("pass"));
		WebElement login 		= driver.findElement(By.id("u_0_b"));
	
		// SendKeys are used to send the values or enter the values
		username.sendKeys("spal17405@gmail.com");
		password.sendKeys("Sumit@6662");
	
		// used to click on any button or check box	
		login.click();  								
	
		driver.close();
	}
	}
