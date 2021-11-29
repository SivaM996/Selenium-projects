package com.driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7_Alertbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();

		WebElement Alert1 = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		Alert1.click();

		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();

		WebElement Alert2 = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		Alert2.click();

		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(3000);
        alert3.dismiss();

        WebElement promptbox = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
        promptbox.click();
        
        Alert promptalert = driver.switchTo().alert();
        promptalert.sendKeys("welcome to the program");
        alert.accept();
	}

}
