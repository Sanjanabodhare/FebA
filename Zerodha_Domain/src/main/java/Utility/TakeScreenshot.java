package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {

	public static void screenshot(WebDriver driver) throws IOException
	{
		LocalDateTime r=java.time.LocalDateTime.now();
		//double b=Math.random();
		String date=r.toString().replace(":", ".");
		File a=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest =new File("C:\\Users\\PRAVIN BODHARE\\Desktop\\Xpath\\"+"sanjana"+date+".jpg");
		
		FileHandler.copy(a, dest);
	}
}
