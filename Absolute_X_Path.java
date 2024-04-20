package X_Path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Absolute_X_Path {
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement username = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[1]/div/div/form/table/tbody/tr[2]/td[1]/input"));
		username.sendKeys("Sumitpal66@ymail.com");
		
		WebElement password = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[1]/div/div/form/table/tbody/tr[2]/td[2]/input"));
		password.sendKeys("Aryan@6662");
		
		WebElement login = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[1]/div/div/form/table/tbody/tr[2]/td[3]/label/input"));
		login.click();
	
		//  xpath Creation :- Click on Xpath Extension :- Username :- //input[@id='email']
		//  xpath Creation :- Click on Xpath Extension :- Username :- //input[@id='pass']
		//  xpath Creation :- Click on Xpath Extension :- Username :- //input[@id='u_0_b']
	}

}
