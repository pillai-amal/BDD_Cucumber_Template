package Bindings;

import io.cucumber.java.en.Given; 
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestFile {
	@Given("I opened the url")
	public void i_opened_the_url() {
	    System.out.println("URL got opened");
	}

	@When("I entered the username")
	public void i_entered_the_username() {
		System.out.println("Username has been entered");
	}

	@When("I entered the password")
	public void i_entered_the_password() {
		System.out.println("Password has been entered");
	}

	@When("I clicked log in button")
	public void i_clicked_log_in_button() {
		System.out.println("Clicked log in button");
	}

	@Then("I log in")
	public void i_log_in() {
		System.out.println("Logged in successfully");
	}
}
