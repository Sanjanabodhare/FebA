package BrowserSetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pojo {


	WebDriver driver;
	
	public static WebDriver OpenChromeBrowser()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		return driver;
	}
	public static WebDriver OpenFireFoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\browser\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		return driver;
	}
}
