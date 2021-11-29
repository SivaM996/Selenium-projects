package com.driver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_Xpath2 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.myntra.com/login/password");
        
        driver.manage().window().maximize();
        
        WebElement email = driver.findElement(By.xpath("//input[contains(@id,'mobileNumberPass')]"));
        email.sendKeys("124@gmsil.com");
        
        WebElement password = driver.findElement(By.xpath("//input[contains(@class,'form-control has-feedback')]"));
        password.sendKeys("pass@khhhd34");
        
        WebElement loginbutton = driver.findElement(By.xpath("//button[contains(@class,'btn primary')]"));
        loginbutton.click();
        
        WebElement ScreenText = driver.findElement(By.xpath("//div[text() ='Login to your account']"));
        System.out.println(ScreenText);
        
        WebElement findElement = driver.findElement(By.xpath("//div[contains(@class,'desktop-logo myntraweb')]"));
        findElement.click();
        
        TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\ScreenShot//ScreenShot1.png");
		FileUtils.copyFile(source, destination);
		
		driver.navigate().back();
        
	}

}
