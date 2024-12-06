package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {
 
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://aniwatchtv.to/home");
		Thread.sleep(2000);
		
	   String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		System.out.println("---------------------------------");
		
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(2000);
		
		String yttitle = driver.getTitle();
		System.out.println(yttitle);
		
		String yturl = driver.getCurrentUrl();
		System.out.println(yturl);
		
		System.out.println("----------------------------------");
		
		driver.navigate().to("https://www.shopsy.in/");
		Thread.sleep(2000);
		
		String stitle = driver.getTitle();
		System.out.println(stitle);
		
		String surl = driver.getCurrentUrl();
		System.out.println(surl);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	
		driver.quit();
		
	}
}
