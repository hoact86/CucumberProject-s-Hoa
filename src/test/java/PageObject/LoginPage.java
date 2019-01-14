package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//input[@type='email']")
	public WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement password;
	
	@FindBy(xpath="//button[@type='button']")
	public WebElement btnLogin;
	
	public LoginPage(WebDriver driver) {
		
		 PageFactory.initElements(driver, this);
	}

}
