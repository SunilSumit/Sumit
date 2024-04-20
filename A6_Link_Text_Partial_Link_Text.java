package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A6_Link_Text_Partial_Link_Text {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
// 		Linktext is used to identify the word by exact spelling.
		
//		WebElement forgot = driver.findElement(By.linkText("Forgot your password?"));
//		forgot.click();
		
		
		
// 		Partial link text is used when half part of a word is known.
		
		WebElement forgot = driver.findElement(By.partialLinkText("password"));
		forgot.click();
	}
}
