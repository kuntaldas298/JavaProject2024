package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement1 {
	public static void main(String[] args) throws InterruptedException {
		//activeElement,clear,sendkeys,click,gettagname,getattribute,getText
		System.out.println("hi");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.switchTo().activeElement().sendKeys("email@mail.com");
		WebElement idTxtBox = driver.findElement(By.id("email"));
		//idTxtBox.sendKeys("email@mail.com");
		Thread.sleep(1500);
		idTxtBox.clear();
		Thread.sleep(1500);
		idTxtBox.sendKeys("correctemail@mail.com");
		String idTxtBoxTag =idTxtBox.getTagName();
		String idTxtBoxAtrib=idTxtBox.getAttribute("blablabla");
		System.out.println("ID text box tag : "+idTxtBoxTag);
		System.out.println("Id txtbox attribute : "+idTxtBoxAtrib);
		
		WebElement pswdTxtBox = driver.findElement(By.id("pass"));
		pswdTxtBox.sendKeys("passw0rd");
		String pswdTxtBoxAtrib=pswdTxtBox.getAttribute("data-testid");
		String pswdTxtBoxText = pswdTxtBox.getText();
		System.out.println("Pswd txtbox attribute : "+pswdTxtBoxAtrib);
		System.out.println("Pswd txtbox Text : "+pswdTxtBoxText);
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		String loginBtnTctValue =loginBtn.getText();
		System.out.println("Login btn txt : "+loginBtnTctValue);
		loginBtn.click();
				
		Thread.sleep(4000);
		driver.quit();
		
		System.out.println("bye");
	}
}
