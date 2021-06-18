package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import BrowserSetUp.Pojo;
import Pom_class.Loginpage;

public class test extends Pojo{
	WebDriver driver;
	Loginpage Login;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	@BeforeTest
	@Parameters("browser")
	public void browserlaunch(String browser)throws Exception {
		reporter =new  ExtentHtmlReporter("test-output//ExtendReport//Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=OpenChromeBrowser();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver=OpenFireFoxBrowser();
		}
		driver.manage().window().maximize();
	}
	@Test
	public void VerifyLogin() throws InterruptedException {
		driver.navigate().to("https://kite.zerodha.com/");
		Login =new Loginpage(driver);
		Login.SendUserid("JN9191");
		Login.SendPassword("Shubhu@143");
		boolean b=Login.LoginisEnable();
		Assert.assertTrue(b);
		Login.ClickLogin(); 
		String a=Login.LogingTitel();
		Assert.assertEquals(a, "Kite - Zerodha's fast and elegant flagship trading platform");
		Login.EnterPin("898354");
		Login.ClickContinue();
	}
	
	@AfterClass
	public void closebrowser(){
		driver.close();
	}

}
