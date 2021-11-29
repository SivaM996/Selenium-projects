package com.driver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_Xpath {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\webdrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		WebElement mail = driver.findElement(By.xpath("//input[@type='text']"));
		mail.sendKeys("123444@gmail.com");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
		password.sendKeys("djkvkjdbv");
		

		WebElement screenText = driver.findElement(
				By.xpath("//h2[text()= 'Facebook helps you connect and share with the people in your life.']"));
		System.out.println(screenText);
		Thread.sleep(2000);

		// containstext
		WebElement text = driver.findElement(By.xpath("//a[contains(text(),'Forgotten password')]"));
		text.click();
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);

		// contains attribute name and attribute value
		WebElement createAPage = driver.findElement(By.xpath("//a[contains(@class,'_8esh')]"));
		createAPage.click();
		Thread.sleep(2000);

		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\ScreenShot//ScreenShot.png");
		FileUtils.copyFile(source, destination);

	}
}