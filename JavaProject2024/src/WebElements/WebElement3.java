package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement3 {
	public static void main(String[] args) throws InterruptedException {
		//isSelected - radiobtns & checkboxes, getLocation, getsize, getRect
		System.out.println("hi");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		Thread.sleep(1000);
		
		WebElement femalElement = driver.findElement(By.xpath("//label[text()= 'Female']/..//input[@name='sex']"));
		Boolean isElemntSelected1= femalElement.isSelected();
		femalElement.click();
		Boolean isElemntSelected2= femalElement.isSelected();
		
		System.out.println("Is element Seleted : "+isElemntSelected1);
		System.out.println("Is element Seleted : "+isElemntSelected2);
		
		WebElement signupbtn = driver.findElement(By.xpath("//Button[text()= 'Sign Up']"));
		System.out.println("Position of SignUp Button : "+signupbtn.getSize());
		System.out.println("Size of SignUp Button : "+signupbtn.getLocation());
				
		//getRect is combination of getLocation & getSize ad returns Rectanle type of object
		System.out.println("Position of SignUp Button : "+signupbtn.getRect().getPoint());
		System.out.println("Dimension of SignUp Button : "+signupbtn.getRect().getDimension());
		System.out.println("Height of SignUp Button : "+signupbtn.getRect().getHeight());
		System.out.println("Width of SignUp Button : "+signupbtn.getRect().getWidth());
		System.out.println("X coordinate of SignUp Button : "+signupbtn.getRect().getX());
		System.out.println("Y coordinate of SignUp Button : "+signupbtn.getRect().getY());
		
		
		Thread.sleep(3000);
		driver.quit();
		
		System.out.println("bye");
	}
}
