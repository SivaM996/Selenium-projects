package com.dummyProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_tables {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://info.sice.indiana.edu/~hrosenba/Demo/Demo4.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		
//		 List<WebElement> webElements = driver.findElements(By.xpath("//table/tbody/tr/td"));
//	    for(WebElement all : webElements) {
//	    	System.out.println(all.getText());
//	    	
//	    }
	    
	    List<WebElement> table = driver.findElements(By.xpath("//table/tbody/tr"));
	for(WebElement li :table) {
		System.out.println(li.getText());
		
	}
	
	}

}
