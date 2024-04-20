package X_Path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_X_Path {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//1: Using Simple X_Path Method by using tag and attributes
		
//		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
//		
//		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
//		
//		WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));
		
		//2: Using and condition
		
//		WebElement username = driver.findElement(By.xpath("//input[@id='email' and @class='inputtext']"));
//				
//		WebElement password = driver.findElement(By.xpath("//input[@id='pass' and @tabindex='2']"));
//						
//		WebElement login = driver.findElement(By.xpath("//input[@id='u_0_b' and @type='submit']"));
		
		//3: using OR condition
		
//		WebElement username = driver.findElement(By.xpath("//input[@id='email' or @class='inputtext']"));
//		
//		WebElement password = driver.findElement(By.xpath("//input[@id='pass' or @tabindex='2']"));
//				
//		WebElement login = driver.findElement(By.xpath("//input[@id='u_0_b' or @type='submit']"));
//		
		//4: Using with contains
		
//		WebElement username = driver.findElement(By.xpath("//input[contains(@name,'il')]"));
//		
//		WebElement password = driver.findElement(By.xpath("//input[contains(@name,'as')]"));
//				
//		WebElement login = driver.findElement(By.xpath("//input[contains(@type,'bm')]"));
		
		//5: Using Starts with
		
//		WebElement username = driver.findElement(By.xpath("//input[starts-with(@name,'em')]"));
//		
//		WebElement password = driver.findElement(By.xpath("//input[starts-with(@id,'pa')]"));
//				
//		WebElement login = driver.findElement(By.xpath("//input[starts-with(@type,'su')]"));
//		
//		username.sendKeys("Sumitpal66@ymail.com");
//		password.sendKeys("Aryan@6662");
//		login.click();
	
		
		//6: Using Text method
		
		WebElement link = driver.findElement(By.xpath("//*[text()='Agile Project']"));
		link.click();
	
}
}
