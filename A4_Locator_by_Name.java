package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4_Locator_by_Name {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement username =  driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("pass"));
		
		
		username.sendKeys("Spal17405@gmail.com");
		password.sendKeys("Sumit@6662");
		
	}
	}
