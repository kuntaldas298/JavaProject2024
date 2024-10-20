package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement5 {
	public static void main(String[] args) throws InterruptedException {
		//submit
		System.out.println("hi");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		
		loginBtn.submit();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		loginBtn.click();
		
		Thread.sleep(3000);
		driver.quit();
		
		System.out.println("bye");
	}
}
