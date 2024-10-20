package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckWhetherAnElementExists {
//WAp to check whether a give elemnent is present or not
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	Thread.sleep(1000);
	
	try {
		WebElement el = driver.findElement(By.id("unknownElement"));//invalidElement
		//WebElement el = driver.findElement(By.xpath("//label[text()= 'Female']/..//input[@name='sex']"));//validElement
		if (el!=null) 
			System.out.println("element is present");
	}
	catch (Exception e) {
		System.out.println("element is not present");
		// TODO: handle exception
		//e.printStackTrace();
	}
	finally {
		Thread.sleep(2000);
		driver.quit();
	}
}
}
