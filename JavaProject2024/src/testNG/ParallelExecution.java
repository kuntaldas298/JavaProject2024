package testNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {
	static WebDriver driver;
	@Parameters ({"LauchBrowser"})
	@Test
	public void browser(String input) {
		if(input.equalsIgnoreCase("chrome") ) 
			driver = new ChromeDriver();		
		else if (input.equalsIgnoreCase("edge")) 
			driver = new EdgeDriver();	
		else if (input.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();	
		else 
			System.out.println("invalid Input");
		
		driver.get("https://www.google.com");
	}
}
