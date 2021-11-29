package com.dummyProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
	//	driver.switchTo().alert().dismiss();

		WebElement search = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input"));
		search.sendKeys("shirt");
		
		WebElement searchbutton = driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']"));
		searchbutton.click();
		
		Thread.sleep(5000);
		
			//driver.switchTo().alert().dismiss();
	
		
		
//		WebElement men = driver.findElement(By.xpath("//input[@type='radio'][1]"));
//	men.click();
	
	WebElement brand = driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[4]"));
	brand.click();Thread.sleep(3000);
	
	WebElement priceRange = driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[10]"));
	priceRange.click();
	
	WebElement colour = driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[14]"));
	colour.click();
	WebElement discount = driver.findElement(By.xpath("(//label[@class='common-customRadio vertical-filters-label'])[1]"));
	discount.click();
	
	
	
	
	}
}
