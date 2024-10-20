package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckIfClickable {
	public static void main(String[] args) throws InterruptedException {
		//how to iterate using for loop
		System.out.println("hi");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		List<WebElement> radiobtn = driver.findElements(By.name("pollanswers-1"));
		
//		for(int i =0; i<radiobtn.size(); i++) {
//			radiobtn.get(i).click();
//		}
		for(WebElement r:radiobtn) {
			r.click();
		}
		
		Thread.sleep(3000);
		driver.quit();
		
		System.out.println("bye");
	}
}
