package in.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkout {
	Actions actions;
	WebDriverWait wait;
	
	@FindBy(xpath ="(//div[contains(@class,'_3Y9ZP')])")
	private WebElement msg;
	
	@FindBy(xpath ="(//div[contains(@class,'_2CgXb')])[2]")
	private WebElement help;
	
	
	public Checkout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver,20);
	}
	public String checkcart() {
		String text = msg.getText();
		return text;
	}
    public void clickhelp()  {
    	help.click();
    }
}
