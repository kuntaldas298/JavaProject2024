package WebElements;

import org.bouncycastle.i18n.LocaleString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement4 {
	public static void main(String[] args) throws InterruptedException {
		//Alignment verification
		System.out.println("hi");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		Thread.sleep(5000);
		
		WebElement email = driver.findElement(By.name("emailOrPhone"));
		int emailX= email.getRect().getX();
	
		WebElement fullname = driver.findElement(By.name("fullName"));
		int fullnameX= fullname.getRect().getX();
		
		if (emailX==fullnameX)
			System.out.println("Left alligned");
		else
			System.out.println("Not Left alligned");
		
		
		Thread.sleep(3000);
		driver.quit();
		
		System.out.println("bye");
	}
}
