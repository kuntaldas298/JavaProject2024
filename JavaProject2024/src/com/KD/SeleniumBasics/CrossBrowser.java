package com.KD.SeleniumBasics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.bidi.module.Input;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser {
	static WebDriver driver;
	static {
		System.out.println("Choose from below option:\n1.Chrome\n2.Edge\n3.Firefox");
		Scanner sc = new Scanner(System.in);
		int input= sc.nextInt();

		if(input==1) 
			driver = new ChromeDriver();		
		else if (input == 2) 
			driver = new EdgeDriver();	
		else if (input == 3)
			driver = new FirefoxDriver();	
		else 
			System.out.println("invalid Input");

	}
	public static void main(String[] args) throws InterruptedException {
		System.out.println("hi");

		String url = "https://www.google.com/";
		String url1 = "https://www.facebook.com/";
		String url2 = "https://www.amazon.com";
		String url4 = "";
		driver.get(url);
		//String title = driver.getTitle();
		//String pgsrcString = driver.getPageSource();
		//driver.get(url1);
		//String title1 = driver.getTitle();

		driver.switchTo().newWindow(WindowType.TAB).get(url1);
		driver.switchTo().newWindow(WindowType.WINDOW).get(url2);
		Thread.sleep(1500);
		//driver.close();
		driver.quit();
		//System.out.println(title);
		//System.out.println(pgsrcString);
		//System.out.println(title1);
		System.out.println("bye");
	}
}