package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements2 {
	public static void main(String[] args) throws InterruptedException {
		//isEnabled,isDisplayed
		System.out.println("hi");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.name("username"));
		Boolean checkEnabledUsername = username.isEnabled();
		Boolean checkDisplayedUsername = username.isDisplayed();
		System.out.println("Is username displayed: "+checkEnabledUsername);
		System.out.println("Is username enabled: "+checkDisplayedUsername);
		
		WebElement password = driver.findElement(By.name("password"));
		Boolean checkEnabledPassword = password.isEnabled();
		Boolean checkDisplayedPassword = password.isDisplayed();
		System.out.println("Is password displayed: "+checkEnabledPassword);
		System.out.println("Is password enabled: "+checkDisplayedPassword);
		
		WebElement loginBtn = driver.findElement(By.xpath("//button[@type = 'submit']"));
		Boolean checkEnabledLoginBtn = loginBtn.isEnabled();
		Boolean checkDisplayedLoginBtn = loginBtn.isDisplayed();
		System.out.println("Is loginBtn displayed: "+checkEnabledLoginBtn);
		System.out.println("Is loginBtn enabled: "+checkDisplayedLoginBtn);
				
		Thread.sleep(3000);
		driver.quit();
		
		System.out.println("bye");
	}
}
