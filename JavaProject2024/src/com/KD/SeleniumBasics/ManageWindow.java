package com.KD.SeleniumBasics;



import java.net.MalformedURLException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWindow {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.out.println("hi");

		WebDriver driver = new ChromeDriver();

	//	String allUrl[] = {"https://www.google.com/","https://www.facebook.com/",
	//	"https://www.amazon.com/","https://www.flipkart.com/","https://www.myntra.com/"};
		
//		//getposition
//		Object position = driver.manage().window().getPosition();
//		System.out.println(position);
//		Thread.sleep(1500);
//		
//		//getsize
//		Object initialSize = driver.manage().window().getSize();
//		System.out.println(initialSize);
//		Thread.sleep(1500);
//		
//		//minimize
//		driver.manage().window().minimize();
//		Thread.sleep(1500);
//		
//		//maximize
//		driver.manage().window().maximize();
//		Thread.sleep(1500);
//		
//		//getsize
//		Object maxSize = driver.manage().window().getSize();
//		System.out.println(maxSize);
//		Thread.sleep(1500);
		
//		//setPosition
//		Point pt = new Point(10000,10000);
//		driver.manage().window().setPosition(pt);
//		Thread.sleep(1500);
//		Object position1 = driver.manage().window().getPosition();
//		System.out.println(position1);
		
		//setPosition
		Dimension d = new Dimension(532,480);
		driver.manage().window().setSize(d);
		Thread.sleep(1500);
		Object size1 = driver.manage().window().getSize();
		System.out.println(size1);
		
		
//		driver.get(allUrl[0]);
//		Thread.sleep(1500);
//
//		//fullscreen
//		driver.manage().window().fullscreen();
//		Thread.sleep(1500);
//		
//		Thread.sleep(1500);
		driver.quit();
//
		System.out.println("bye");
	}
}
