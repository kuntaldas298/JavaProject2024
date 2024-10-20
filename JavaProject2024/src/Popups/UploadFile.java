package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
	public static void main(String[] args) throws InterruptedException {
		//upload file
		System.out.println("hi");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='upfile']")).sendKeys("/home/kuntal/Downloads/note.txt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Press']")).click();
		Thread.sleep(2000);

		driver.quit();

		System.out.println("bye");
	}
}
