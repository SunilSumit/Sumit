package Alert_Command;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
//		WebElement button = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
//		button.click();
//		
//		// 1:- To get the text from alert box we will use get-text method
//		
//		String text = driver.switchTo().alert().getText();
//		System.out.println(text);
//
//		// 2:- To accept the alert we can use accept method
//		driver.switchTo().alert().accept();
		
		
//		WebElement button1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
//		WebElement confirm = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
//		button1.click();
//		confirm.click();
//		
//		//3:- To dismiss the alert we can use dismiss method
//		driver.switchTo().alert().dismiss();
		
		WebElement button2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		WebElement confirm2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		button2.click();
		confirm2.click();
		
		
		//4:- To text value in alert we can enter the send key method
		driver.switchTo().alert().sendKeys("Sumit");
		driver.switchTo().alert().accept();
		
		
				
		
	}
}
