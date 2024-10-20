package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {
	public static void main(String[] args) throws InterruptedException {
		//getAllSelectedOptions,getOptions,getWrappedElement
		System.out.println("hi");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///home/kuntal/Desktop/htmls/dropdowns.html");
		Thread.sleep(1000);
		
		WebElement city = driver.findElement(By.id("city"));
			Select select = new Select(city);
			
			select.selectByIndex(3);
			select.selectByValue("2");
			select.selectByVisibleText("Kolkata");
			//getting all the selected options
			List<WebElement> allCityOptions = select.getAllSelectedOptions();
			for(WebElement city1:allCityOptions) {
				System.out.println(city1.getText());
			}
			System.out.println("-------------------------");
			//getting all the available options
			List<WebElement> allOptions = select.getOptions();
			for(WebElement options:allOptions) {
				System.out.println(options.getText());
			}
			System.out.println("-------------------------");
			//fetches & iterates through all the available options
			System.out.println(select.getWrappedElement().getText());
		
		Thread.sleep(3000);
		driver.quit();
		
		System.out.println("bye");
	}
}
