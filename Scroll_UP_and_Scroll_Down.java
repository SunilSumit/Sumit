package Java_Script_Executions;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_UP_and_Scroll_Down {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME");
		WebDriver driver = new ChromeDriver();
		driver.get("  https://moneyboats.com/  ");
		driver.manage().window().maximize();
				
//		//1: Firstly we need to create reference variable of javascript executor  interface
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// To scroll down
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,500)");
		
		// To scroll up 
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-500)");
		
		
	}

}
