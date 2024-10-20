package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SlelectDropdowns {
	public static void main(String[] args) throws InterruptedException {
		//find all links in a webpage
		System.out.println("hi");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///home/kuntal/Desktop/htmls/dropdowns.html");
		Thread.sleep(1000);
		
		WebElement city = driver.findElement(By.id("city"));
			Select select = new Select(city);
			
			select.selectByIndex(3);
			select.selectByValue("2");
			select.selectByVisibleText("Kolkata");
			Thread.sleep(2000);
			
			select.deselectByIndex(3);
			Thread.sleep(1000);
		    select.deselectAll();
		    
		    WebElement accessories = driver.findElement(By.id("accessories"));
			Select select1 = new Select(accessories);
		
		Thread.sleep(3000);
		driver.quit();
		
		System.out.println("bye");
	}
}
