package Drop_Down_Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

public static void main(String[] args) {
	System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	
	WebElement country = driver.findElement(By.name("country"));
	Select select = new Select(country);
	
	//1:- Select by visible text
	//select.selectByVisibleText("CHINA");
	
	//2:- Select by value
	//select.selectByValue("ALGERIA");
	
	//3:- Select by Index
	//select.selectByIndex(23);
	
	
	
}
}
