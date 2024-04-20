package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A0_Launch_URL {
	
public static void main(String[] args) {
		
		System.setProperty("Driver.chrome.driver", "C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		// 1: .get()- this method will help you to open any URL
		driver.get("https://www.amazon.in/");
		
		// 2: .close()- This method is used to close the opened URL
		driver.close();
		
		//3: .getTitle()- This is use to get title of the website
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//4: .getCurrentURL():- To get the current opened URL details
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//5:- .getPageSource to get the source code
		
		String source = driver.getPageSource();
		System.out.println(source);
		//6:- driver.quit:- To close all the opened window 
		driver.close();
		
		
	}

}
