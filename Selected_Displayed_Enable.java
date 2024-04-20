package IS_Selected_Display_Enable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selected_Displayed_Enable {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		
		boolean resultu = username.isDisplayed();
		boolean resultu1 = username.isEnabled();
		System.out.println(resultu);
		System.out.println(resultu1);
		
		boolean resultp = password.isDisplayed();
		boolean resultp1 = password.isEnabled();
		System.out.println(resultp);
		System.out.println(resultp1);
		
// Is.Displayed method is used to check it element is present or not
// Is.Enable    method is used to check element is enabled or disabled	
		
		if(username.isDisplayed() && username.isEnabled() )
		{
			username.sendKeys("Sumitpal66@ymail.com");
		}
		else
		{
			System.out.println("User name is not displayed");
		}
		if(password.isDisplayed() && password.isEnabled())
		{
			password.sendKeys("Aryan@6662");
		}
		else
		{
			System.out.println("Password is not displayed");
		}
// Is.Selected method is used to validate checkbox or radio button is already selected or not
		
		WebElement checkbox = driver.findElement(By.id("persist_box"));
		boolean result = checkbox.isSelected();
		System.out.println(result);
	}

}
