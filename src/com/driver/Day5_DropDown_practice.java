package com.driver;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day5_DropDown_practice {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select k = new Select(dropdown);
		k.selectByIndex(1);

		WebElement text = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select t = new Select(text);
		t.selectByVisibleText("Appium");

		WebElement value = driver.findElement(By.xpath("//select[@id='dropdown3']"));
		Select v = new Select(value);
		v.selectByValue("2");

		WebElement box4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select b = new Select(box4);

		List<WebElement> listofoptions = b.getOptions();
		int size = listofoptions.size();
		System.out.println("Number of elements " + size);

		WebElement sndkeys = driver.findElement(By.xpath("(//select)[5]"));
		sndkeys.sendKeys("appium");

		WebElement multiselectbox = driver.findElement(By.xpath("(//select)[6]"));

		Select multi = new Select(multiselectbox);

		multi.selectByIndex(1);
		multi.selectByIndex(2);
		multi.selectByIndex(3);
		multi.selectByIndex(4);

		TakesScreenshot screensht = (TakesScreenshot) driver;
		File source = screensht.getScreenshotAs(OutputType.FILE);
		File Destination = new File(
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\ScreenShot\\DropDown.png");
		FileUtils.copyFile(source, Destination);

	}

}
