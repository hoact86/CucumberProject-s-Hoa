package stepdefinitions;

import static org.junit.Assert.assertEquals;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObject.SubcribPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SubcribStepDefiniton {
	
	WebDriver driver=Hook.driver;;
	SubcribPage page;
	
	@Before
	public void StartTest() {
		page=new SubcribPage(driver);
	}
	
	@Given("^I am staying testmaster$")
	public void i_am_staying_testmaster()   {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("http://testmaster.vn/");	    
	}
	
	@When("^I provide invalid value for email$")
	public void i_provide_invalid_value_for_email()   {
	    // Write code here that turns the phrase above into concrete actions

	    page.txtEmail.sendKeys("abc");
	}
	
	@When("^I do submit button Regis$")
	public void i_do_submit_button_Regis()  {
	    // Write code here that turns the phrase above into concrete actions
	    page.btnRegis.click();
	}
	
	@Then("^I should see \"([^\"]*)\"$")
	public void i_should_see(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	   assert(page.errorMessageEmail.getText().equals(arg1));  
	}
	 
	
	@When("^I enter email as \"([^\"]*)\"$")
	public void i_enter_email_as(String arg1)   {
    // Write code here that turns the phrase above into concrete actions
	page.txtEmail.sendKeys(arg1);
	}

	@Then("^I showld see extra information Form$")
	public void i_showld_see_Form_Information()     {
	
		WebDriverWait wait= new WebDriverWait(driver, 2000);
		wait.until(ExpectedConditions.visibilityOf(page.txtName));
		assertEquals(page.txtName.isEnabled(),true);
	     
	    	
	    
	}
	@When("^I provide field name is blank$")
	public void i_provide_field_name_is_blank()     {
	    // Write code here that turns the phrase above into concrete actions
		 
		WebDriverWait wait= new WebDriverWait(driver, 2000);
		wait.until(ExpectedConditions.visibilityOf(page.txtName));
	    page.txtName.clear();
	    page.txtName.sendKeys("");
	}
	
	@When("^I do submit button buttonAllow$")
	public void i_do_submit_button_buttonAllow()   {
	    // Write code here that turns the phrase above into concrete actions
		page.btnAllow.click();
	}


	@Then("^I see \"([^\"]*)\"$")
	public void i_see(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions

		assertEquals(page.errorMessage.getText(),arg1);
	}
	@Then("^I see Gender \"([^\"]*)\"$")
	public void i_see_Gender(String arg1)   {
	    // Write code here that turns the phrase above into concrete actions
		 
		WebDriverWait wait= new WebDriverWait(driver, 2000);
		wait.until(ExpectedConditions.visibilityOf(page.txtName));
		assertEquals(page.cbbGender.getText(),arg1);
	}
	
	@Then("^I see NewsType \"([^\"]*)\"$")
	public void i_see_NewsType(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(page.cbbNewsType.getText(),arg1); 
	}
	

	@When("^I enter Name value$")
	public void i_enter_Name_value()   {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait= new WebDriverWait(driver, 2000);
		wait.until(ExpectedConditions.visibilityOf(page.txtName));
		
	    page.txtName.sendKeys("Chu Thị Hoa");
	}
	
	@When("^I do submit button Allow$")
	public void i_do_submit_button_Allow()  {
	    // Write code here that turns the phrase above into concrete actions
	     page.btnAllow.click();
	}
	
	@Then("^I see popup message \"([^\"]*)\"$")
	public void i_see_popup_message(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
		String str=driver.switchTo().alert().getText();
		System.out.println(str);
		
		assertEquals(str,arg1); 
		
	}


}
