package com.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_BrowserNavigate {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.google.com/search?q=flipkart&rlz=1C1ONGR_enIN927IN927&oq=flip&aqs=chrome.0.0i131i433i512j69i57j0i131i433i512l2j0i433i512j0i131i433i512j0i433i457i512j0i402j0i433i512j0i131i433i512.24930j0j9&sourceid=chrome&ie=UTF-8");

		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println("the title is " + title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("the url is " + currentUrl);

		Thread.sleep(3000);

		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

		driver.navigate().to(
				"https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=CjwKCAjw49qKBhAoEiwAHQVToz_SiyUZyjZm5zgJqh0fB3iDO13-b7gmwmAO5qYvVhF2258axOhY6hoCldAQAvD_BwE");

		driver.navigate().refresh();

		driver.navigate().back();

		driver.navigate().forward();

		driver.close();

	}

}
