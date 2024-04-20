package Mouse_Event;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Event_Example {
	
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME");
		WebDriver driver = new ChromeDriver();
		driver.get("  https://only-testing-blog.blogspot.com/  ");
		driver.manage().window().maximize();
		
//		WebElement flight = driver.findElement(By.linkText("Flights"));
		Actions action = new Actions(driver);
		
		//1: To perform mouse left click and hold we use ( .clickandHold ) method.
//		action.clickAndHold(flight).perform();
		
		//2: To release the click and hold command we need to use ( .release ) method.
//		action.release().perform();
		
		//3: Contex Click will perform the right click on the mouse.
//		action.contextClick(flight).perform();
		
	
		
		
}
}
