package com.dummyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SauceDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
	WebElement usernname = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]"));
	usernname.sendKeys("standard_user");
	
	WebElement password = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
	password.sendKeys("secret_sauce");
	
	WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
	login.click();
	
	Thread.sleep(4000);
	
	WebElement AtoZ = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
	Select a = new Select(AtoZ);
	a.selectByIndex(2);
	
	WebElement addtokart = driver.findElement(By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory'])[2]"));
	addtokart.click();
	
	WebElement addtokart2 = driver.findElement(By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory'])[1]"));
	addtokart2.click();
	
	WebElement kart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	kart.click();
	
	Thread.sleep(3000);
	WebElement checkout = driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button']"));
	checkout.click();
	
	WebElement firstName = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]"));
	firstName.sendKeys("shiva");
	
	
	WebElement lastName = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
	lastName.sendKeys("M");
	
	WebElement zip = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[3]"));
	zip.sendKeys("600087");
	
	
	WebElement continue1 = driver.findElement(By.xpath("//input[@type='submit']"));
continue1.click();
	
	
	
	
	
	}

}
