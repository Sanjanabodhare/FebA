package homepage;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage2 {

	WebDriver driver;
	@FindBy(xpath="//a[text()='Home Improvement']")
	private WebElement Homeimprovement;
	
	@FindBy(xpath="//span[text()='Redmi']")
	private WebElement brand;
	
	@FindBy(xpath="//span[text()='Samsung']")
	private WebElement Samsung;
	
	@FindBy(xpath="//input[@id='low-price']")
	private WebElement minPrice;
	
	@FindBy(xpath="//input[@id='high-price']")
	private WebElement maxPrice;
	
	
	public Homepage2(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	


	public void Homeimprovement() {
		Homeimprovement.click();
		
		
		
	}
	public void redmi() {
		brand.click();
	}
	
	public boolean Smsung() {
		Samsung.click();
		boolean a=Samsung.isSelected();
		return a;
	}
	
	public void min() {
		minPrice.sendKeys("10000");;
	}
	
	public void max() {
		maxPrice.sendKeys("20000");
	}
	
	
}
