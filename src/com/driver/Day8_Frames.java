package com.driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8_Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/frame.html");

		driver.switchTo().frame(0);
		WebElement Firstframe = driver.findElement(By.xpath("//button[@id='Click']"));
		Firstframe.click();

		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		
 		
		WebElement Frame2 = driver.findElement(By.xpath("//button[@id='Click1']"));
		Frame2.click();
		WebElement text = driver.findElement(By.xpath("//button[@id='Click1']"));
		System.out.println("The text is " + text.getText());

		driver.switchTo().defaultContent();

		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		int size = findElements.size();
		System.out.println(size);
	}

}
