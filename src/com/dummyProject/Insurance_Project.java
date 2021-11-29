package com.dummyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Insurance_Project {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://links.giveawayoftheday.com/demo.guru99.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement Insurance = driver.findElement(By.xpath("//a[text()='Insurance Project']"));
        Insurance.click();
        
		WebElement register = driver.findElement(By.xpath("//a[@class='btn btn-default']"));
		register.click();

		WebElement password = driver.findElement(By.xpath("//input[@autofocus='autofocus']"));
		Select f = new Select(password);
		f.selectByIndex(3);

		WebElement FirstName = driver.findElement(By.xpath("//input[@autofocus='autofocus']"));
		FirstName.sendKeys("gopi");

		WebElement surname = driver.findElement(By.xpath("//input[@id='user_surname']"));
		surname.sendKeys("sudhakar");

		WebElement phone = driver.findElement(By.xpath("//input[@id='user_phone']"));
		phone.sendKeys("8557473872");

	}

}
