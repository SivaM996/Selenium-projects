package com.driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");
//
//		WebElement Ram = driver.findElement(By.xpath("//div[contains(text(),'RAM')]"));
//		Select ramm = new Select(Ram);
//		List<WebElement> options = ramm.getOptions();
//		for(WebElement list:options) {
//			System.out.println("the list of options are "+ list.getText());
//		}
		
		
		 WebElement st = driver.findElement(By.xpath("//p[contains(text(),'Get the app')]"));
	     System.out.println(st);
	}

}
