package in.swiggy.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CartIcon {
	WebDriverWait wait;
	WebDriver driver;
	Actions actions;
	@FindBy(xpath ="(//div[contains(@class,'_2CgXb')])[1]")
	private WebElement cart;
	public CartIcon(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver,20);
}
	public void clickadd() throws InterruptedException {
		cart.click();
		Thread.sleep(3000);
		
	}
}