package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup1 {
	public static void main(String[] args) throws InterruptedException {
		//Alert - click on ok, click on cancel, sendkeys and get text
		System.out.println("hi");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(1000);

		WebElement jsaleartbtn =  driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		
		jsaleartbtn.click();
		Thread.sleep(1000);
		//click on cancel
		Alert a = driver.switchTo().alert();
		a.dismiss();

		jsaleartbtn.click();
		//send data
		
		a.sendKeys("MeaoMeao");
		
		//getting the prompt text
		System.out.println(a.getText());	
		
		//click on ok
		a.accept();

		Thread.sleep(2000);

		driver.quit();

		System.out.println("bye");
	}
}
