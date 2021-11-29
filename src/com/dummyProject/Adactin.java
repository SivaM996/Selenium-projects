package com.dummyProject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("SivaM996");

		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("shivashiva12345");

		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();

		WebElement location = driver.findElement(By.id("location"));
		Select loc = new Select(location);
		loc.selectByValue("New York");

		WebElement hotel = driver.findElement(By.name("hotels"));
		Select h = new Select(hotel);
		h.selectByValue("Hotel Cornice");

		WebElement roomType = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select R = new Select(roomType);
		R.selectByVisibleText("Super Deluxe");

		WebElement noOfRooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select NR = new Select(noOfRooms);
		NR.selectByIndex(2);

		WebElement CheckIn = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		CheckIn.clear();
		CheckIn.sendKeys("30/12/2021");
		

		WebElement Checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		Checkout.clear();
		Checkout.sendKeys("1/1/2022");

		WebElement Adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select A = new Select(Adult);
		A.selectByIndex(2);

		WebElement children = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select c = new Select(children);
		c.selectByIndex(2);

		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();

		WebElement radioButton = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		radioButton.click();

		WebElement Submit2 = driver.findElement(By.xpath("//input[@name='continue']"));
		Submit2.click();

		WebElement Firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		Firstname.sendKeys("siva");

		WebElement LastName = driver.findElement(By.xpath("//input[@name='last_name']"));
		LastName.sendKeys("M");

		WebElement Address = driver.findElement(By.xpath("//textarea[@name='address']"));
		Address.sendKeys("66A,iyappan nagar,velacherry,chennai");

		WebElement card = driver.findElement(By.xpath("//input[@name='cc_num']"));
		card.sendKeys("3565688823456789");

		WebElement cardType = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select T = new Select(cardType);
		T.selectByIndex(3);

		WebElement ExpMonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select EM = new Select(ExpMonth);
		EM.selectByIndex(12);

		WebElement ExpYear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select EY = new Select(ExpYear);
		EY.selectByVisibleText("2022");

		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cvv.sendKeys("346");

		WebElement book = driver.findElement(By.xpath("//input[@name='book_now']"));
		book.click();

		Thread.sleep(8000);
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\AdactinHotelss.png");
		FileUtils.copyFile(source, destination);
		

		WebElement myItinerary = driver.findElement(By.xpath("//input[@name='my_itinerary']"));
		myItinerary.click();

		WebElement orderid = driver.findElement(By.xpath("(//input[@name='check_all'])"));
		orderid.click();

	   WebElement cancel = driver.findElement(By.xpath("//input[@name='cancelall']"));
		cancel.click();
		
		

		driver.switchTo().alert().accept();
		

//		WebElement logout = driver.findElement(By.xpath("//input[@id='logout']"));
//		logout.click();
		
		driver.navigate().back();Thread.sleep(2000);
		driver.navigate().refresh();Thread.sleep(2000);
		driver.navigate().forward();Thread.sleep(2000);
		driver.navigate().refresh();
		
		//driver.close();

	}

}
