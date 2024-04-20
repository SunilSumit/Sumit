package Ways_To_Refresh_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ways_To_Refresh {
	
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME");
		WebDriver driver = new ChromeDriver();
		
		//1: get() Method
		driver.get("https://adactin.com/HotelApp/index.php");
		
//		//2: Navigate.refresh
//		driver.navigate().refresh();
//		
//		//3: By using get and getCurrent URL method
//		driver.get(driver.getCurrentUrl());
//		
//		//4: By using the get current URL an add that into navigate method
//		driver.navigate().to(driver.getCurrentUrl());
//		
//		//5: By using f5 key
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("sumit6662");
		username.sendKeys(Keys.F5);
//		
//		//6: By using the ASCII value
//		driver.findElement(By.id("email")).sendKeys("\116");
		
		}
	}
