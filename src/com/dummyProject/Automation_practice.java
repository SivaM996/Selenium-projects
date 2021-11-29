package com.dummyProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation_practice {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement img = driver.findElement(By.xpath("//img[@width='250']"));
		
		WebElement Add_to_kart = driver.findElement(By.xpath("(//span[contains(text(),'Add to cart')])[1]"));
		//Add_to_kart.click();
		Actions act = new  Actions(driver);
		act.clickAndHold(img).build().perform();
		
		Add_to_kart.click(); 
	}

}
