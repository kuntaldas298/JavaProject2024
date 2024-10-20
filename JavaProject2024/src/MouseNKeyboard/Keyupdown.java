package MouseNKeyboard;

import java.time.Duration;

import org.bouncycastle.jce.spec.ECKeySpec;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyupdown {
	public static void main(String[] args) throws InterruptedException {
		//keyboard
		System.out.println("hi");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://text-compare.com");
		//driver.get("file:///home/kuntal/Desktop/htmls/button.html");
		
		Thread.sleep(1000);
		WebElement txt1 = driver.findElement(By.id("inputText1"));
		//WebElement uname = driver.findElement(By.id("Username"));
		
		Actions actions = new Actions(driver);
		actions.keyDown(txt1, "H").keyUp(txt1, "H").perform();
		actions.keyDown(txt1, "i").keyUp(txt1, "i").perform();
		
		actions.keyDown(Keys.CONTROL).keyDown("a").keyUp("a").keyUp(Keys.CONTROL).perform();
		actions.keyDown(Keys.CONTROL).keyDown("c").keyUp("c").keyUp(Keys.CONTROL).perform();
		actions.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		actions.keyDown(Keys.CONTROL).keyDown("v").keyUp("v").keyUp(Keys.CONTROL).perform();

		driver.quit();

		System.out.println("bye");
	}
}
