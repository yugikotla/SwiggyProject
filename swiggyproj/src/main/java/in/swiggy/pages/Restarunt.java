package in.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Restarunt {
	private WebDriverWait wait;
	
	
	@FindBy(xpath="(//h2[contains(@class,'_2xYa7')])[1]")
	private WebElement hotel;
	
	
	public Restarunt(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selecthotel() throws InterruptedException  {
		hotel.click();
		Thread.sleep(3000);			
	}
}
