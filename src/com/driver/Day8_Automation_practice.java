package com.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Day8_Automation_practice {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		WebElement signIN = driver.findElement(By.xpath("//a[@class='login']"));
		signIN.click();

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("abdf54387cd@gmail.com");

		WebElement passwrd = driver.findElement(By.xpath("//input[@id='passwd']"));
		passwrd.sendKeys("djnsng");

		WebElement signInbutton = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		signInbutton.click();

		WebElement SearchBox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		SearchBox.sendKeys("T shirt");
		// Thread.sleep(4000);
		WebElement Button = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		Button.click();
		// Thread.sleep(3000);
		Thread.sleep(3000);
		WebElement pic = driver.findElement(By.xpath("//img[@width='250']"));

		WebElement more = driver.findElement(By.xpath("//span[contains(text(),'More')]"));
		//more.click();

		Actions action = new Actions(driver);
		action.clickAndHold(pic).build().perform();
		more.click();
		
		WebElement select = driver.findElement(By.xpath("//select[@name='group_1']"));
		Select s = new Select(select);
		s.selectByIndex(2);
		
		WebElement Addtokart = driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]"));
        Addtokart.click();
	

//		Thread.sleep(3000);
//     	driver.switchTo().frame(1);
//    	driver.switchTo().alert().accept();

		WebElement Proceedtocheckout = driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
		Proceedtocheckout.click();

		//Thread.sleep(3000);

		WebElement ProceedToCheckout2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		ProceedToCheckout2.click();

		// Thread.sleep(3000);
//
//		WebElement emailBox = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		emailBox.sendKeys("abdf54387cd@gmail.com");
//
//		WebElement emailClick = driver.findElement(By.xpath("//*[@id=\'SubmitCreate\']/span"));
//		emailClick.click();
//
//		// Thread.sleep(3000);
//
//		WebElement mr = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
//		mr.click();
//
//		WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		name.sendKeys("shiva");
//
//		WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
//		lastname.sendKeys("M");
//
//		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
//		password.sendKeys("djnsng");
//
//		WebElement days = driver.findElement(By.xpath("//select[@id='days']"));
//		Select a = new Select(days);
//		a.selectByIndex(6);
//
//		WebElement months = driver.findElement(By.xpath("//select[@id='months']"));
//		Select m = new Select(months);
//		m.selectByIndex(11);
//
//		WebElement years = driver.findElement(By.xpath("//select[@id='years']"));
//		Select y = new Select(years);
//		y.selectByValue("2011");
//
//		WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
//		checkbox.click();
//
//		WebElement company = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
//		company.sendKeys("systiko");
//
//		WebElement address1 = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
//		address1.sendKeys("66k, aranmanai nagar, pillayar kovil street chennai-600087");
//
//		WebElement address2 = driver.findElement(By.xpath("(//input[@type='text'])[9]"));
//		address2.sendKeys("66k, aranmanai nagar, pillayar kovil street chennai-600087");
//
//		WebElement city = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
//		city.sendKeys("chennai");
//
//		WebElement pin = driver.findElement(By.xpath("//select[@name='id_state']"));
//		Select p = new Select(pin);
//		p.selectByVisibleText("Minnesota");
//
//		WebElement postalcode = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
//		postalcode.sendKeys("60008");
//
//		WebElement text = driver.findElement(By.xpath("//textarea[@class='form-control']"));
//		text.sendKeys("the selenium ");
//
//		WebElement mobile = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
//		mobile.sendKeys("7654567880");
//
//		WebElement mobilephone = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
//		mobilephone.sendKeys("9465765769");
//
//		WebElement add = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
//		add.sendKeys("55n,sastha nagar");
//
//		WebElement register = driver.findElement(By.xpath("//*[@id=\'submitAccount\']/span"));
//		register.click();

		WebElement addComment = driver.findElement(By.xpath("//textarea[@class='form-control']"));
		addComment.sendKeys("this is selenium project");

		WebElement ProceedToCheckout3 = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		ProceedToCheckout3.click();

		WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox1.click();

		WebElement ProceedToCheckout4 = driver.findElement(By.xpath("//*[@id=\'form\']/p/button/span"));
		ProceedToCheckout4.click();

		WebElement pay = driver.findElement(By.xpath("//a[@class='bankwire']"));
		pay.click();

		WebElement confirmOrder = driver.findElement(By.xpath("//*[@id=\'cart_navigation\']/button/span"));
		confirmOrder.click();

	}

}
