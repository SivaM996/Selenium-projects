package com.driver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day10_FlipkartHandlingWindows {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		Actions a = new Actions(driver);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.manage().window().maximize();

		WebElement TopOffers = driver.findElement(By.xpath("(//div[@class='xtXmba'])[1]"));
		a.contextClick(TopOffers).build().perform();

		Robot b = new Robot();
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);

		b.keyPress(KeyEvent.VK_ENTER);
		b.keyRelease(KeyEvent.VK_ENTER);

		WebElement Grocery = driver.findElement(By.xpath("(//div[@class='xtXmba'])[2]"));
		a.contextClick(Grocery).build().perform();

		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);

		b.keyPress(KeyEvent.VK_ENTER);
		b.keyRelease(KeyEvent.VK_ENTER);

		WebElement Mobiles = driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
		a.contextClick(Mobiles).build().perform();

		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);

		b.keyPress(KeyEvent.VK_ENTER);
		b.keyRelease(KeyEvent.VK_ENTER);

		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		System.out.println("---------------------------------");
		
		int size = driver.getWindowHandles().size();
		System.out.println(size);
		System.out.println();

		Set<String> windowHandles = driver.getWindowHandles();
		for (String window : windowHandles) {
            String title = driver.switchTo().window(window).getTitle();
            System.out.println(title);
		}
		String child = "Flipkart Offers & Deals of the Day - Get Best Discounts on Mobiles, Electronics, Fashion & Home etc.";
		for (String eachItem : windowHandles) {
		if (driver.switchTo().window(eachItem).getTitle().equalsIgnoreCase(child))
			break;

	}
	
//
//    for(String f: windowHandles )  {
//    	if(!f.equals(windowHandle)) {
//    		driver.switchTo().window(f);
//    		driver.close();
//    	}
//    }
	}}
	
	
	
	

