package I_Frame_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_iFrame {
	
	public static void main(String[] args) {
		
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
		iframe.click();
		
		// Switching to the parent iFrame by using the WebElement method
		WebElement ParentiFrame = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(ParentiFrame);
		
		// Get Text method and printing value
		WebElement text = driver.findElement(By.xpath("/html/body/section/div/div/h5"));
		String value = text.getText();
		System.out.println(value);
		
		// Switch to child iFrame to perform the operation
		driver.switchTo().frame(0);
		WebElement childiFrame = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		childiFrame.sendKeys("Sumit");
	
		
		
		
		
}
}
