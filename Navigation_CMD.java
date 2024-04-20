package Navigate_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_CMD {

public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME");
	WebDriver driver = new ChromeDriver();
	
	//	1:- To open the URL we can use navigate .to Method
	driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
	
	//2:- to refresh the page
	driver.navigate().refresh();

	//3:- To redirect on one step back
	WebElement flight = driver.findElement(By.linkText("Flights"));
	flight.click();
	Thread.sleep(2000);
	driver.navigate().back();
	
	//4:- One redirect one step forward
	driver.navigate().forward();

}
}
