package homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {
	WebDriver driver;
	@FindBy(xpath="//span[text()='Account & Lists']")
	private WebElement login;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement user;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement Continue;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement Password;
	
	@FindBy(xpath=("//input[@id='signInSubmit']"))
	private WebElement Singin;
	
	@FindBy(xpath="//a[text()='Best Sellers'][1]")
	private WebElement bestseller;
	
	@FindBy(xpath="//a[text()='Mobiles']")
	private WebElement mob;
	
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	private WebElement account;
	
	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement logout;
	
	public home( WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void login()
	{
		login.click();
	}
	
	public void user(String b) {
		user.sendKeys(b);
	}
	
	public void click() {
		Continue.click();
	}
	
	public void password(String c) {
		Password.sendKeys(c);
	}
	public void Signin() {
		Singin.click();
	}
	public void mobile() {
		mob.click();
	}
	public void bestseller() {
		bestseller.click();
		
	}
		public void list() {
		Actions v=new Actions(driver);
		v.moveToElement(account).moveToElement(logout).click().build().perform();
		
	}
	
}
