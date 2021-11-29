package com.driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7_demoAutomationTesting {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get(
			"http://demo.automationtesting.in/Alerts.html");

	driver.manage().window().maximize();
	
	WebElement Alertwithok = driver.findElement(By.xpath("//a[@href='#OKTab']"));
	Alertwithok.click();
	
	WebElement click = driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]"));
    click.click();
    Thread.sleep(3000);
    
    Alert Alert1 = driver.switchTo().alert();
    Alert1.accept();
    
    WebElement AlertWithOkandCancel = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
    AlertWithOkandCancel.click();
    
    WebElement clickthis = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
    clickthis.click();
    
    Thread.sleep(3000);
    
    Alert alert2 = driver.switchTo().alert();
    alert2.dismiss();
    
    WebElement AlertWithTextbox = driver.findElement(By.xpath("//a[@href='#Textbox']"));
    AlertWithTextbox.click();
    
    WebElement ALertPath = driver.findElement(By.xpath("(//button[contains(text(),'click the button')])[3]"));
    ALertPath.click();
    Alert alert3 = driver.switchTo().alert();
    alert3.sendKeys("Welcome to the selenium program");
    alert3.accept();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}
