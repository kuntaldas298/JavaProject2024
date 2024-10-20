import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FiinLinks {
	public static void main(String[] args) throws InterruptedException {
		//find all links in a webpage
		System.out.println("hi");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		//List<WebElement> allLinks = driver.findElements(By.tagName("link"));
		List<WebElement> allLinks1 = driver.findElements(By.tagName("a"));
		
		//System.out.println(allLinks.size());
		System.out.println("This page has "+allLinks1.size()+" links.");
		System.out.println("Values are");
//		for(int i=0;i< allLinks1.size();i++) {
//			System.out.println(allLinks1.get(i).getText());
//		}
		for(WebElement link:allLinks1) {
			System.out.println(link.getText());
		}
			
		
		Thread.sleep(3000);
		driver.quit();
		
		System.out.println("bye");
	}
}
