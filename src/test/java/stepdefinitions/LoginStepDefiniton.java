package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefiniton {

	WebDriver driver=Hook.driver;
	

@Given("^I am staying login page$")
public void i_am_staying_login_page() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I enter username invalid or password invalid$")
public void i_enter_username_invalid_or_password_invalid() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I see the error tooltip \"([^\"]*)\"$")
public void i_see_the_error_tooltip(String arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I give username and password valid$")
public void i_give_username_and_password_valid() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I click button Login$")
public void i_click_button_Login() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I see  admin page with logo \"([^\"]*)\"$")
public void i_see_admin_page_with_logo(String arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

}
