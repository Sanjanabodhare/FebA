package Pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buypopup {

	WebDriver driver;
	@FindBy(xpath="//input[@label='Qty.']")
	private WebElement quntity;

	@FindBy(xpath="//label[text()='Market']")
	private WebElement maretorder;
	
	@FindBy(xpath="//label[text()='SL-M']")
	private WebElement MarketStopLoss;
	
	
	public Buypopup(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void AddQuantity(int a)
	{
		quntity.sendKeys("150");
	}
	
	public void ClickMarketorder()
	{
		maretorder.click();
	}
	
	public void MarketStoploss()
	{
		MarketStopLoss.click();
	}
	
	
}
