package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup2 {
	public static void main(String[] args) throws InterruptedException {
		//Alert - click on ok, click on cancel, sendkeys and get text
		System.out.println("hi");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://flipkart.com");
		Thread.sleep(1000);



		Thread.sleep(2000);

		//driver.quit();

		System.out.println("bye");
}
}
