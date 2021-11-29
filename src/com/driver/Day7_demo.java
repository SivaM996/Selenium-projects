package com.driver;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day7_demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");

		driver.manage().window().maximize();
		
		WebElement list = driver.findElement(By.xpath("(//select)[6]"));
	    Select li=new Select(list);
	    List<WebElement> list1 = li.getOptions();
	    for (WebElement list2:list1) {
	    	System.out.println(list2.getText());
	    	
	    }
        int size = list1.size();
        System.out.println(size);
        for (int i = 0; i < size; i++) {
        	if (i==2|i==3|i==4|i==5) 
        		li.selectByIndex(i);
				
			}
        	List<WebElement> allSelectedOptions = li.getAllSelectedOptions();
        	for (WebElement multi : allSelectedOptions) {
    			System.out.println(multi.getText());
			}
	        WebElement selectedOption = li.getFirstSelectedOption();
	        	System.out.println(selectedOption.getText());
				
			}
	
	}


