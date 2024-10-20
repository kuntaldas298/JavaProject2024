package MouseNKeyboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {
	public static void main(String[] args) throws InterruptedException {
		//drag and drop with elements & with coordinates & dragNdrop using mouse
		System.out.println("hi");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(1000);
		
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement draggablElement = driver. findElement(By.id("draggable"));
		WebElement droppableElement = driver. findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		//dragNdrop using both WE
		//actions.dragAndDrop(draggablElement, droppableElement).perform();
		//dragNdrop using drop coordinates
		//actions.dragAndDropBy(droppableElement, 365, 65).perform();
		//dragNdrop using mouse
		actions.clickAndHold(draggablElement).perform();
		actions.moveToElement(droppableElement).perform();
		actions.release().perform();	
		Thread.sleep(2000);

		driver.quit();

		System.out.println("bye");
	}
}
