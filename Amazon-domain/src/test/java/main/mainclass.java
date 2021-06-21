package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import homepage.Homepage2;
import homepage.home;

public class mainclass {
	WebDriver driver;
	home x;
	SoftAssert Soft=new SoftAssert();	;
	
	@BeforeTest
	public void before() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVIN BODHARE\\Downloads\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		driver =new ChromeDriver();
	}
	
	@BeforeMethod
	public void beforemethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.get("https://www.amazon.in/");
		x=new home(driver);
	 	x.login();
		x.user("9769782406");
		x.click();
		x.password("bodhare@123");	
		x.Signin();
		
	}
	@Test
	public void bestseller() {
	 x=new home(driver);
	 x.bestseller();
	 String url=driver.getCurrentUrl();
		System.out.println(url);
		Soft.assertNotEquals(url, "scsfdfdvzd");
			
	}
	
	@Test
	public void samsung() throws InterruptedException {
		Thread.sleep(3000);
		x=new home(driver);
		x.mobile();
		Homepage2 home2=new Homepage2(driver);
		boolean a=home2.Smsung();
		Assert.assertFalse(a);
		home2.min();
		home2.max();
		
	}
	
	 
	 @AfterMethod()
		public void logout() {
		  x=new home(driver);
		x.list();
	 }
	/*@AfterClass
	public void finish() {
		driver.close();		
	}*/ 
	
	
}
