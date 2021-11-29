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

public class Day10_WindowHandling {
	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();


		Actions a = new Actions(driver);
		WebElement Todaydeal = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
		a.contextClick(Todaydeal).build().perform();

		Thread.sleep(3000);

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		WebElement Customerservice = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		a.contextClick(Customerservice).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement Registry = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
		a.contextClick(Registry).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		int size = driver.getWindowHandles().size();
		System.out.println(size);

		String windowHandle = driver.getWindowHandle();
		System.out.println("parentid "+windowHandle);
		System.out.println("--------");

		Set<String> windowHandles = driver.getWindowHandles();
		for (String title : windowHandles) {
			String title2 = driver.switchTo().window(title).getTitle();
			System.out.println(title2);
		}

	}

}
