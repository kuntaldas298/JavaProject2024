package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChildWindow {
	public static void main(String[] args) throws InterruptedException, AWTException {
		//handle multiple tab/window - getwindowhandles()
		System.out.println("hi");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("disable-notifications");
		Robot robot = new Robot();

		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		//System.out.println(driver.getWindowHandle());

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 15 (128 GB) - Black')]")).click();
		//driver.getWindowHandle();
		//printing window ids
		System.out.println(driver.getWindowHandles());
		//storing ids
		Set<String> allWindows = driver.getWindowHandles();
		//switching windows
		for(String window:allWindows) {
			driver.switchTo().window(window);
		}


		Thread.sleep(2000);
		driver.close();
		//driver.quit();

		System.out.println("bye");
	}
}
