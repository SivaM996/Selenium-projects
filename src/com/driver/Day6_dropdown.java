package com.driver;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day6_dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();

		WebElement dropdown1 = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select drop1 = new Select(dropdown1);
		List<WebElement> list1 = drop1.getOptions();
		for (WebElement li1 : list1) {
			System.out.println(li1.getText());
		}

		System.out.println("------------------");

		WebElement dropdown2 = driver.findElement(By.xpath("//select[@size='10']"));
		Select drop2 = new Select(dropdown2);
		List<WebElement> list2 = drop2.getOptions();
		for (WebElement li2 : list2) {
			System.out.println(li2.getText());

		}
		System.out.println("----------------");
		int size = list2.size();
		System.out.println("list size is " + size);
		for (int i = 0; i < size; i++) {
			if (i == 2 | i == 3 | i == 4) {
				drop2.selectByIndex(i);
			}
		}
		System.out.println("--------------");
		List<WebElement> allSelectedOptions = drop2.getAllSelectedOptions();
		for (WebElement multiselect : allSelectedOptions) {
			System.out.println(multiselect.getText());
		}
		System.out.println("-----------------");
		WebElement firstoption = drop2.getFirstSelectedOption();
		System.out.println(firstoption.getText());
		
		//drop2.deselectAll();

		System.out.println("-------------------");
		boolean multiple = drop1.isMultiple();
		System.out.println("multidropdown is " + multiple);

		System.out.println("-------------------");
		boolean multiple2 = drop2.isMultiple();
		System.out.println("multiple drop down is " + multiple2);

	}

}