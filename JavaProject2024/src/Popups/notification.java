package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notification {
	public static void main(String[] args) throws InterruptedException, AWTException {
		//handle notification popup & robot class
		System.out.println("hi");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("disable-notifications");
		Robot robot = new Robot();

		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();

		driver.get("https://irctc.co.in");
		Thread.sleep(1000);
		//driver.findElement(By))
		
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_TAB);

		
		Thread.sleep(2000);

		driver.quit();

		System.out.println("bye");
	}
}
