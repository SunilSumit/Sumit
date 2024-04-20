package Mouse_Event;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {
	
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME");
		WebDriver driver = new ChromeDriver();
		driver.get("  https://only-testing-blog.blogspot.com/  ");
		driver.manage().window().maximize();
		
		//1: Double Click 
		Actions action = new Actions(driver);
		
//		WebElement doubleclick = driver.findElement(By.xpath("//*[@id=\"post-body-7297556448793668582\"]/div[1]/button"));
//		action.doubleClick(doubleclick).perform();
		
		//5: Drag and drop
		WebElement draganddrop = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/div[6]/div/div/div/h3/a"));
		draganddrop.click();
		
		WebElement drag = driver.findElement(By.id("dragdiv"));
		WebElement drop = driver.findElement(By.id("dropdiv"));
		
		//action.dragAndDrop(drag, drop).perform();
		action.dragAndDropBy(drag, 480, -580).perform();
		
		
		
		
	}

}
