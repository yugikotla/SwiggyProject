package in.swiggy.tests;

import org.openqa.selenium.chrome.ChromeDriver;

import in.swiggy.pages.Checkout;
import in.swiggy.pages.Pizza;
import in.swiggy.pages.Restarunt;
import in.swiggy.pages.SwiggyPage;
import in.swiggy.pages.CartIcon;


public class Driver extends Tools {

	protected static Restarunt restarunt;
	protected static SwiggyPage swiggypage;
	protected static Pizza pizza;
	protected static Checkout checkout;
	protected static CartIcon carticon;
	
	public static  void init( ) {
		System.setProperty("webdriver.chrome.driver","resources//chromedriver.exe");
		driver = new ChromeDriver();
		restarunt = new Restarunt(driver);
		swiggypage = new SwiggyPage(driver);
		pizza = new Pizza(driver);
		checkout = new Checkout(driver);
		carticon = new CartIcon(driver);	

	}
}


