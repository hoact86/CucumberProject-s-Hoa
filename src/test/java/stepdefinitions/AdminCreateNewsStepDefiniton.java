package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObject.AdminCreateNewsPage;
import PageObject.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminCreateNewsStepDefiniton {
	

	WebDriver driver=Hook.driver;
	 
	AdminCreateNewsPage adminPage;
	
	@Before
	public void StartTest() {
		adminPage=new AdminCreateNewsPage(driver);
		adminPage.username.sendKeys("khanh.tx@live.com");
		adminPage.password.sendKeys("abc123");
		adminPage.btnLogin.click();
	}
	
	@Given("^I am staying CreateNews Page$")
	public void i_am_staying_CreateNews_Page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click menu Send News$")
	public void i_click_menu_Send_News() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   adminPage.mnSendNews.click();
	}

	@When("^I give Group, Name, Subject and Body are blank$")
	public void i_give_Group_Name_Subject_and_Body_are_blank() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I do submit button Next$")
	public void i_do_submit_button_Next() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    adminPage.btnNext.click();
	}

	@Then("^I see message error \"([^\"]*)\"$")
	public void i_see_message_error(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		 
		
	}



}
