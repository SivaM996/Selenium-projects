package com.driver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_BrowserLaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\New_youtube\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/");

		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println("the title is " + title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("the url is " + currentUrl);
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		Thread.sleep(3000);
		driver.close();
	}

}
