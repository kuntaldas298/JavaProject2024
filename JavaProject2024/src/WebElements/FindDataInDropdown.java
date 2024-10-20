package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FindDataInDropdown {
	public static void main(String[] args) throws InterruptedException {
		//check whether ireland plays
		System.out.println("hi");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///home/kuntal/Desktop/htmls/dropdowns.html");
		Thread.sleep(1000);

		WebElement cup = driver.findElement(By.id("wc2025"));
		Select select = new Select(cup);
		int flag = 0;

		//getting all the available options
		List<WebElement> allOptions = select.getOptions();
		for(WebElement options:allOptions) {
			if(options.getText().equalsIgnoreCase("Ireland")) {
				flag=0;
				System.out.println("Playing");
				break;
			}
			else
				flag = 1;
		}
		if(flag==1)
			System.out.println("Not playing");	

		driver.quit();

		System.out.println("bye");
	}
}
