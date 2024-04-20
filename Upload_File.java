package Upload_File_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_File {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		
		WebElement upload = driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("C:\\Users\\hp\\Pictures\\Screenshots\\Sumit.png");
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"terms\"]"));
				checkbox.click();
		
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
		
	}
}
