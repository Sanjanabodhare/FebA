package BrowserSetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pojo {


	WebDriver driver;
	
	public static WebDriver OpenChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVIN BODHARE\\Downloads\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		return driver;
	}
	public static WebDriver OpenFireFoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PRAVIN BODHARE\\Downloads\\Automation\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		return driver;
	}
}
