package Pom_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='search-input']")
	private WebElement search ;
	
	@FindBy(xpath="(//span[text()='SBIN'])[1]")
	private WebElement sbi ;
	
	@FindBy(xpath="//button[@data-balloon='Buy']")
	private WebElement buy;
	
	@FindBy(xpath="//label[text()='Longterm ']")
	private WebElement longterm;
	
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void SendDatainSearch(String d) {
		WebDriverWait wait =new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOf(search));
		search.sendKeys(d);
	}
	
	public void MoveToSbi() {
		Actions s=new Actions(driver);
		s.moveToElement(sbi).build().perform();
	}
	
	public void MoveToSbibuy() {
		Actions s=new Actions(driver);
		s.moveToElement(buy).click().build().perform();
	}
	
	public boolean Longtermisdispaly() {
		boolean a=longterm.isDisplayed();
		return a;
	}
	
	
	
	
}
