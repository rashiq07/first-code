package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		WebElement email = driver.findElement(By.name("email"));
		
		email.sendKeys("Rashiq Rashiq");
		
		WebElement password = driver.findElement(By.name("pass"));
		
		password.sendKeys("1233334");
		
		WebElement login = driver.findElement(By.name("login"));
		
		login.click();
		
		
		driver.navigate().to("https://www.amazon.in/");
		
		
		WebElement id = driver.findElement(By.id("twotabsearchtextbox"));
		
		id.sendKeys("i phone");
		
		WebElement search = driver.findElement(By.id("nav-search-submit-button"));
		
		search.click();
		
		
		driver.navigate().to("https://demoqa.com/text-box");
		 
		
		WebElement fullName = driver.findElement(By.id("userName"));
		
		fullName.sendKeys("Mohammed Rashiq NS");
		
		WebElement useremail = driver.findElement(By.id("userEmail"));
		
		useremail.sendKeys("rashiqmohammed6@gmail.com");
		
		WebElement currentaddress = driver.findElement(By.id("currentAddress"));
		
		currentaddress.sendKeys("2/4 sarrayakkar street ambur"); 
		
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		
		permanentAddress.sendKeys("2/4 sarrayakkar street ambur");
		
		WebElement submit = driver.findElement(By.id("submit")); 
		
		submit.click();
		
		
		driver.navigate().to("https://www.instagram.com/");
		
		
		WebElement name = driver.findElement(By.name("username"));
		
		name.sendKeys("rash_2011");
		
		WebElement instapassword = driver.findElement(By.name("password"));
		
		instapassword.sendKeys("I-DONT-KNOW");
		
		
	}
	
	
}
