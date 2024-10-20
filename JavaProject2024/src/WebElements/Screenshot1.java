package WebElements;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		Date date =new Date();
		//replacing colons in time with hiphens
		String today = date.toString().replace(":", "-");
		File destiation = new File("./src/screenshots/screenshot"+today+".png");
		TakesScreenshot ts = (TakesScreenshot) driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    org.openqa.selenium.io.FileHandler.copy(source, destiation);
	    driver.quit();
	}
}
