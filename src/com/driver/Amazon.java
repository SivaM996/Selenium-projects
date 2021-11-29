package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement SearchBox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		SearchBox.sendKeys("mobile");
		WebElement SearchClick = driver.findElement(By.xpath("//input[@type='submit']"));
		SearchClick.click();
		
        WebElement click1 = driver.findElement(By.xpath("//i[@class='a-icon a-icon-checkbox']"));
	    click1.click();
	    
	    WebElement click2 = driver.findElement(By.xpath("//span[contains(text(),'₹10,000 - ₹20,000')]"));
	    click2.click();
	    WebElement redmi = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
	    redmi.click();
	    WebElement addtokart = driver.findElement(By.xpath("//input[@id='buy-now-button']"));
	    addtokart.click();
	    String windowHandle = driver.getWindowHandle();
	    
	}

}
