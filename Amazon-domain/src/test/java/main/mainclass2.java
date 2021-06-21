package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import homepage.Homepage2;
import homepage.home;

public class mainclass2 {
	WebDriver driver;
	home home;
	Homepage2 Homepage2;
	
	@BeforeTest
	public void before() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVIN BODHARE\\Downloads\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		driver =new ChromeDriver();
	}
	
	@BeforeMethod
	public void beforemethod() throws InterruptedException {
		Thread.sleep(3000);
		
		driver.get("https://www.amazon.in/");
		home=new home(driver);
	 	home.login();
		home.user("9769782406");
		home.click();
		home.password("bodhare@123");	
		home.Signin();
		
	}
	@Test
	public void Homeimprovement() {
		Homepage2=new Homepage2(driver);
		Homepage2.Homeimprovement();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.amazon.in/gp/browse.html?node=3704992031&ref_=nav_cs_hi_b183765d90844c95b998beab0377167a");
	}
	@Test
	public void elctronics() {
		home=new home(driver);
		home.mobile();
		Homepage2=new Homepage2(driver);
		
		Homepage2.redmi();
		
	}
	
		
	 @AfterMethod()
		public void logout() {
		home=new home(driver);
		home.list();
	 }

	

}
