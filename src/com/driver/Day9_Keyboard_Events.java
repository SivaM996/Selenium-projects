package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day9_Keyboard_Events {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement gender = driver.findElement(By.xpath("//input[@id='gender-female']"));
	action.click(gender).build().perform();
	Thread.sleep(3000);										
	 																	
	action.sendKeys(Keys.TAB);
	action.sendKeys("shiva");
	action.sendKeys(Keys.TAB);
	action.sendKeys("elsa");
	action.sendKeys(Keys.TAB);
	action.sendKeys("sivaq323@gmail.com");
	//action.sendKeys(Keys.ENTER);
	}

}
