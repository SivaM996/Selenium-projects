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

public class New_selenium2 {


	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91733\\Desktop\\eclipse-workspace\\New_youtube\\Driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
//		WebElement getposition = driver.findElement(By.id("position"));
//		Point xypoint =getposition.getLocation();
//		
//		int xvalue= xypoint.getX();
//		int Yvalue= xypoint.getY();
//		 
//		System.out.println(xvalue+" "+Yvalue);
//
//		WebElement colorbutton = driver.findElement(By.id("color"));
//		String color =colorbutton.getCssValue("background-color");
//		System.out.println("button colur is"+color);
//		
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\ScreenShot//ScreenShot2.png");
		FileUtils.copyFile(source, destination);
	}

}





