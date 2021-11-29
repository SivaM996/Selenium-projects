package com.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_text {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
//		 WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
//        searchBox.sendKeys("mobile phone");
		
	WebElement DontChange = driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]"));
DontChange.click();

WebElement mensClothing = driver.findElement(By.xpath("(//input[@type='checkbox'])[34]"));
mensClothing.click();

	}

}
