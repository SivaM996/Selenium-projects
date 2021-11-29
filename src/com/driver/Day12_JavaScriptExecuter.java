package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12_JavaScriptExecuter {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scroll(0,3000)", "driver");
		
		Thread.sleep(2000);
		
		js.executeScript("window.scroll(0,-3000)", "");
		
		WebElement flipkart = driver.findElement(By.xpath("//a[text()='iPhone 13 Mini']"));
		//JavascriptExecutor s = (JavascriptExecutor) driver;

		Thread.sleep(3000);
		
		js.executeScript("arguments[0].scrollIntoView(true);", flipkart);
		js.executeScript("arguments[0].click();", flipkart);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
