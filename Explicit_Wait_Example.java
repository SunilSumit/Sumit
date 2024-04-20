package Explicit_Wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_Example {
	
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/index.php");
		driver.manage().window().maximize();
		
		//1: Firstly we have to create object of WebDriver wait Class
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//2: We will use until method webdriver class to implement the condition of expected class
		WebElement username = driver.findElement(By.id("username"));
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("sumit6662");
		
		WebElement password = driver.findElement(By.id("password"));
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("Aryan@6662");
		
		WebElement login = driver.findElement(By.id("login"));
		wait.until(ExpectedConditions.visibilityOf(login));
		login.click();
	}
}
