package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMExecution {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		POMLocators pom = new POMLocators(driver);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		pom.getEamil().sendKeys("testemail@email.com");
		driver.navigate().refresh();	
		pom.getEamil().sendKeys("diferent value");
	}
	
}

