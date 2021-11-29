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
import org.openqa.selenium.support.ui.Select;

public class Day5_DropdownBox {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("abcd@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("dalsio33");

		WebElement loginButton = driver.findElement(By.xpath("//button[@value='1']"));
		loginButton.click();
		Thread.sleep(3000);

		driver.navigate().back();

		WebElement createaccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createaccount.click();

		Thread.sleep(3000);

		WebElement FirstName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		FirstName.sendKeys("John");

		WebElement Surname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		Surname.sendKeys("Wick");

		WebElement mobile = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		mobile.sendKeys("9595843794");

		WebElement newpassword = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		newpassword.sendKeys("Avis2342qq");

		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		Select d = new Select(date);
		d.selectByIndex(11);

		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select m = new Select(month);
		m.selectByValue("6");

		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select y = new Select(year);
		y.selectByVisibleText("2012");

		WebElement gender = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
		gender.click();

		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\ScreenShot//ScreenShot2.png");
		FileUtils.copyFile(source, destination);

	}

}
