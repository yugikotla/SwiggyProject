package in.swiggy.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pizza {
	WebDriverWait wait;
	WebDriver driver;
	Actions actions;

	
	
	@FindBy(xpath ="(//div[contains(@class,'_2CgXb')])[5]")
	private WebElement search;
	
	@FindBy(xpath="//input[contains(@class,'_2BJMh')]")
	private WebElement searchbox;
	
	@FindBy(xpath = "(//div[contains(@class,'_2CgXb')])[1]")
	private WebElement cart;

	public Pizza(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver,20);
	}
	public void clicksearchbtn()  {
		actions.moveToElement(search).build().perform();
		wait.until(ExpectedConditions.visibilityOf(search))	;
		search.click();
		wait.until(ExpectedConditions.visibilityOf(searchbox))	;
		
	}
	public void searchlist( )  {
		actions.moveToElement(searchbox).build().perform();
		searchbox.click();
	}
	
	public void entpizza(String food) throws InterruptedException
	{
	wait.until(ExpectedConditions.visibilityOf(searchbox));
	searchbox.sendKeys(food);
	Thread.sleep(2000);
	actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(4000);
	}
	public void checkouticon() 
	{
	cart.click();	
	}
		
		
	}
