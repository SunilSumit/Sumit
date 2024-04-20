package CSS_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_CSS_Locator_Types {

public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");

		//1: By using TAG and Class Name 
		//WebElement un = driver.findElement(By.cssSelector("input.inputtext"));
		
		//2: By using TAG and ID in Css Selector
		//WebElement pass = driver.findElement(By.cssSelector("input#pass"));
		
//		un.sendKeys("sumitpal66@ymail.com");
//		pass.sendKeys("Aryan@662");
//		
//		//3: By using Tag and Attributes
//		WebElement un = driver.findElement(By.cssSelector("input[type='text'][name='email']"));
//		
//		//4: By using Tag, Class and attribute
//		WebElement pass = driver.findElement(By.cssSelector("input.inputtext[type='password'][tabindex='2']"));
//		
//		un.sendKeys("sumitpal66@ymail.com");
//		pass.sendKeys("Aryan@6662");
//
//		//5: By using Tag ID and Attributes
//		WebElement login = driver.findElement(By.cssSelector("input#u_0_b[type='submit'][value='Log In']"));
//		login.click();
		
		//6: By using start with 
		
		WebElement  username = driver.findElement(By.cssSelector("input[name^='ema']"));
		username.sendKeys("Sumitpal66@ymail.com");
		
		//7: By using Ends with it will find using end with character
		WebElement password = driver.findElement(By.cssSelector("input[type$='word']"));
		password.sendKeys("Aryan@6662");

		//8: By using the contain it will find the locator based on character which is present or not
		WebElement login = driver.findElement(By.cssSelector("input#u_0_b[type*='bm']"));
		login.click();

}
}
