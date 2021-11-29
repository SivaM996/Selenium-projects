package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		search.click();

		WebElement addtokart = driver.findElement(By.xpath("(//span[contains(text(),'Add to cart')])[2]"));
		addtokart.click();

	}

}
