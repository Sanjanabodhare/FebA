package Pom_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {

	WebDriver driver;

	@FindBy(xpath="//input[@label='User ID']")
	private WebElement userid ;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement Password ;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Logingbutton;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pin;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement continuee;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String LogingTitel() {
		String titel=driver.getTitle();
		return titel;
	}
	
	public void SendUserid(String d) {
		userid.sendKeys(d);
	}
	
	public void SendPassword(String d) {
		Password.sendKeys(d);
	}
	
	public boolean LoginisEnable() {
		boolean a=Logingbutton.isEnabled();
		return a;
	}
	
	public void ClickLogin() {
		Logingbutton.click();
	}
	
	public void EnterPin(String d) {
		WebDriverWait wait =new WebDriverWait(driver,15);
		WebElement pin=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		pin.sendKeys(d);
	}
	
	public void ClickContinue() {
		continuee.click();
	}
}
