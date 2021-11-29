package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8_demoAutomation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(3000);

		WebElement iframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		iframe.click();
		Thread.sleep(3000);

		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		
		WebElement EnterText = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		EnterText.sendKeys("jkdbak");		
																										
	}	
}
			