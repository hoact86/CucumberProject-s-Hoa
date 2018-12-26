package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SubcribPage {
	
	 @FindBy(css="div.mod-input input")
	 public WebElement txtEmail;
	
	 @FindBy(css="div.error span")
	 public WebElement errorMessageEmail;
	 
	 @FindBy(css="button.next-btn-primary")
	 public WebElement btnRegis;
	 
	 @FindBy(css="div#popover input")
	 public WebElement txtName;
	 
	 @FindBy(css="div#popover div.error")
	 public WebElement errorMessage;
	 
	 @FindBy(css="button#allow-button")
	 public WebElement buttonAllow;
	 
	 @FindBy(css="button#ddlGender>span.content-display")
	 public WebElement cbbGender;
	 
	 @FindBy(css="button#ddlNewsType>span.content-display")
	 public WebElement cbbNewsType;
	 
	 @FindBy (css="button#allow-button")
	 public WebElement btnAllow;
	 
	 
	 public SubcribPage (WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	
}
