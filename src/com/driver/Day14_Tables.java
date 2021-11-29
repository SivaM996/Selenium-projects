package com.driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day14_Tables {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		// driver.manage().window().maximize();

		System.out.println("--------All data in table-------");

		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));

		for (WebElement data : alldata) {
			System.out.println(data.getText());

		}

		System.out.println("--------header of row --------");

		List<WebElement> header = driver.findElements(By.xpath("//table/tbody/tr/th"));
		for (WebElement head : header) {
			System.out.println(head.getText());
		}
		System.out.println("-------size-----");
		int size = header.size();
		System.out.println(size);

		System.out.println("-------Table column-------");
		List<WebElement> column = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
		for (WebElement col : column) {
			System.out.println(col.getText());
		}
		System.out.println("-------Column size-----");
		int size2 = column.size();
		System.out.println(size2);

		System.out.println("------Table row data-----");
		
		List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr[4]/td"));
		for (WebElement row : rowdata) {
			System.out.println(row.getText());
		}
		System.out.println("-------row size-----");
		int size3 = rowdata.size();
		System.out.println(size3);

		
		System.out.println("------Particular data-------");
		WebElement particular = driver.findElement(By.xpath("//table/tbody/tr[4]/td[3]"));
		System.out.println(particular.getText());

		System.out.println("-------Header size---------");
		List<WebElement> header1 = driver.findElements(By.tagName("th"));
		for (WebElement head : header1) {
			System.out.println(head.getText());
		}

		System.out.println("-----header size----------");
		int size4 = header1.size();
		System.out.println(size4);
		System.out.println("--------following---------");

		WebElement following = driver.findElement(By.xpath("//td[normalize-space()='China']//following::td[2]"));
		System.out.println(following.getText());

	}

}
