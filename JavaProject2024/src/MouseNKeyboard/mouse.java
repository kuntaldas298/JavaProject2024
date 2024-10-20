package MouseNKeyboard;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse {
	public static void main(String[] args) throws InterruptedException {
		//actions class
		System.out.println("hi");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///home/kuntal/Desktop/htmls/button.html");
		Thread.sleep(1000);
		
		WebElement cancelBtn =  driver.findElement(By.id("cancelButton"));

		Actions actions = new Actions(driver);	
		actions.click(cancelBtn).perform();
		Thread.sleep(1000);
		
		WebElement uname = driver.findElement(By.id("Username"));
		WebElement pwd = driver.findElement(By.id("Password"));
		
		uname.sendKeys("raj");
		actions.sendKeys(pwd, "password").perform();
		Thread.sleep(1000);
		
		
//		actions.contextClick().perform();
//		Thread.sleep(1000);
				
		actions.contextClick(cancelBtn).perform();
		Thread.sleep(1000);

		driver.quit();

		System.out.println("bye");
	}
}
