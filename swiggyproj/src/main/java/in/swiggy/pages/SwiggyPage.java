package in.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class SwiggyPage {
	
	WebDriverWait wait;
	WebDriver driver;
	Actions actions;
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(xpath="//div[contains(@class,'_1oLDb')])")
	private WebElement list;
	
	@FindBy(xpath ="//div[contains(@class,'_3lmRa')][1]")
	private WebElement place;
	
	@FindBy(xpath ="(//div[contains(@class,'_2CgXb')])[5]")
	private WebElement search;
	
	
	public SwiggyPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver,10);
	}
	public void clicklocation( )   {
		location.click();
		
		}
		
	public void entchennai( String  loction)  {
		location.sendKeys(loction);
		wait.until(ExpectedConditions.visibilityOf(place));
		actions.moveToElement(place).build().perform();
		place.click();
		wait.until(ExpectedConditions.visibilityOf(search));		
	}		
}
