package in.swiggy.tests;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PizzaSelect extends Driver {
	@Given("a user is on the home page of the swiggy")
	public void a_user_is_on_the_home_page_of_the_swiggy() {
		Assert.assertTrue(driver.getTitle().equals("Order food online from India's best food delivery service. Order from restaurants near you"));
	}
	    

	@When("he cliicks on the search button")
	public void he_cliicks_on_the_search_button1() {
		swiggypage.clicklocation();
	   
	}

	@When("he enters a name as {string}")
	public void he_enters_a_name_as(String string) {
	   swiggypage.entchennai(string);
	}

	@When("he clicks on the search button")
	public void he_clicks_on_the_search_button() {
	    pizza.clicksearchbtn();
	}

	@When("he finds the search box")
	public void he_finds_the_search_box()  {
	   pizza.searchlist();
	}


	@When("he enters enters the name as {string}")
	public void he_enters_enters_the_name_as(String string) throws InterruptedException {
		pizza.entpizza(string);
	}

	@When("he selects the restarunt")
	public void he_selects_the_restarunt() throws InterruptedException {
		restarunt.selecthotel();
	}

	@When("he clicks on the cart icon")
	public void he_clicks_on_the_cart_icon() throws InterruptedException {
		carticon.clickadd();
	}



	@When("he compares the checkout page {string}")
	public void he_compares_the_checkout_page(String string) {
		String expectedmsg = string;
		String actualmsg = checkout.checkcart();
		Assert.assertEquals(expectedmsg, actualmsg);
	}
	@Then("he clicks on the help button")
	public void he_clicks_on_the_help_button()  {
		checkout.clickhelp();
	}


	
}
