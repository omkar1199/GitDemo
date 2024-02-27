package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//@RunWith(Cucumber.class)
public class StepDefination {
	
	 @Given("^User is on Netbanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
		 System.out.println("user is on netbanking page");
	        
	    }

	    @When("^User login into page with username and password$")
	    public void user_login_into_page_with_username_and_password() throws Throwable {
	    	 System.out.println("logged in into page");
	    }

	    @Then("^Homepage is populated$")
	    public void homepage_is_populated() throws Throwable {
	    	 System.out.println("Home page is populated");
	    }

	    @And("^cards are displyed$")
	    public void cards_are_displyed() throws Throwable {
	    	 System.out.println("Cards are displyed");
	    }

}

