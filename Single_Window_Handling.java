package Window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single_Window_Handling {
	
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\hp\\Desktop\\SEED Files\\Automation-Testing\\Softwares\\CROME");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		String parentID = driver.getWindowHandle();
		System.out.println("ParentID:- "+ parentID);
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
		button.click();
		
		// This method is used to store all the opened window after clicking on button
		Set<String> childwindow = driver.getWindowHandles();
		
		// Iterator stores all the values in (i) and iterate all the values
		Iterator<String> i = childwindow.iterator();
		while(i.hasNext())
		{
			String childwindow1 = i.next();
			System.out.println("ChildID:-"+childwindow1);
			
			if(!parentID.equalsIgnoreCase(childwindow1))
			{
				driver.switchTo().window(childwindow1);
				WebElement download = driver.findElement(By.linkText("Downloads"));
				download.click();
				driver.close();			
			}
		}
		driver.switchTo().window(parentID);
	}

}
