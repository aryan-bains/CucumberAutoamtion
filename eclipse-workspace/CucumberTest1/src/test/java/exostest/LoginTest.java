package exostest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	
	@When("I enter username as {string}")
	public void i_enter_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("entring username");
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("entring password");
	}

	@Then("Login should fail")
	public void login_should_fail() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("login failed due to wrong username or password");
	}
}
