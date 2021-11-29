package com.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13_RadioButton {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)	;
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		
		WebElement radio = driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[6]"));
		radio.click();
		
		WebElement yes = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		yes.click();
		boolean selected = yes.isSelected();
			System.out.println("the button is "+ selected);
			
			
			WebElement defaul = driver.findElement(By.xpath("(//input[@type='radio'])[4]"));
			boolean selected2 = defaul.isSelected();
	        System.out.println("the default button is "+ selected2);
	        
	        WebElement age = driver.findElement(By.xpath("(//input[@type='radio'])[5]"));
	        age.click();
	}

}
