package com.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day11_DragAndDrop_MoveToElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-1.html");
		driver.manage().window().maximize();    Thread.sleep(3000);

		Actions d = new Actions(driver);

		WebElement drag = driver.findElement(By.xpath("(//div[@class='dragableBox'])[2]"));

		WebElement drop = driver.findElement(By.xpath("//div[@id='dropBox']"));

		//d.dragAndDrop(drag, drop).build().perform();
		d.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
		
		
		
		WebElement drag1 = driver.findElement(By.xpath("(//div[@class='dragableBox'])[4]"));

		WebElement drop1 = driver.findElement(By.xpath("//div[@id='dropBox']"));

		//d.dragAndDrop(drag1, drop1).build().perform();
		d.clickAndHold(drag1).moveToElement(drop1).release(drop1).build().perform();

		
		
		WebElement drag2 = driver.findElement(By.xpath("(//div[@class='dragableBox'])[6]"));

		WebElement drop2 = driver.findElement(By.xpath("//div[@id='dropBox']"));

	//	d.dragAndDrop(drag2, drop2).build().perform();
		d.clickAndHold(drag2).moveToElement(drop2).release(drop2).build().perform();

		
	
		WebElement drag3 = driver.findElement(By.xpath("(//div[@class='dragableBox'])[8]"));

		WebElement drop3 = driver.findElement(By.xpath("//div[@id='dropBox']"));

		//d.dragAndDrop(drag3, drop3).build().perform();
		d.clickAndHold(drag3).moveToElement(drop3).release(drop3).build().perform();

		
	
		WebElement drag5 = driver.findElement(By.xpath("(//div[@class='dragableBox'])[2]"));

		WebElement drop5 = driver.findElement(By.xpath("//div[@id='dropBox2']"));

		//d.dragAndDrop(drag5, drop5).build().perform();
		d.clickAndHold(drag5).moveToElement(drop5).release(drop5).build().perform();

		
	
		WebElement drag6 = driver.findElement(By.xpath("(//div[@class='dragableBox'])[4]"));

		WebElement drop6 = driver.findElement(By.xpath("//div[@id='dropBox2']"));

		//d.dragAndDrop(drag6, drop6).build().perform();
		d.clickAndHold(drag6).moveToElement(drop6).release(drop6).build().perform();

		
		
		WebElement drag7 = driver.findElement(By.xpath("(//div[@class='dragableBox'])[6]"));

		WebElement drop7 = driver.findElement(By.xpath("//div[@id='dropBox2']"));

		//d.dragAndDrop(drag7, drop7).build().perform();
		d.clickAndHold(drag7).moveToElement(drop7).release(drop7).build().perform();

		
		
		
		
		
		
	//	d.clickAndHold(drag).moveToElement(drop).build().perform();

	}
}
