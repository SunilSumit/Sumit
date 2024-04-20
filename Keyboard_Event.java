package Keyboard_Event;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Event {
	
public static void main(String[] args) {
	
	System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME");
	WebDriver driver = new ChromeDriver();
	driver.get("  https://demo.guru99.com/test/facebook.html  ");
	driver.manage().window().maximize();
	
	WebElement username = driver.findElement(By.id("email"));
	WebElement password = driver.findElement(By.id("pass"));
	
	Actions action = new Actions(driver);
	action.keyDown(username, Keys.SHIFT).sendKeys("sumit").perform();
	action.keyDown(password, Keys.SHIFT).sendKeys("Sumit").perform();
	
	action.keyDown(Keys.ENTER).perform();
	
	
}

}
