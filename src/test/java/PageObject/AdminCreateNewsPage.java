package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminCreateNewsPage {
	
	
	@FindBy(xpath="//input[@type='email']")
	public WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement password;
	
	@FindBy(xpath="//button[@type='button']")
	public WebElement btnLogin;
	
	@FindBy(xpath="//a[@action='/subscription/sendnews']/span")
	public WebElement mnSendNews;
	
	@FindBy(xpath="//button[@id='ddlGroup']")
	public WebElement cbbGroup;
	
	
	@FindBy(xpath="//input[@id='txtName']")
	public WebElement txtName;
	
	public WebElement txtNameError;
	
	@FindBy(xpath="//input[@id='txtSubject']")
	public WebElement txtSubject;
	public WebElement txtSubjectError;
	
	@FindBy(css="div.note-editable")
	public WebElement txtBody;
	@FindBy(css="")
	public WebElement txtBodyError;
	
	@FindBy(xpath="//input[@name='myfile']")
	public WebElement btnAddFile;
	
	@FindBy(css="button.btn-next>span")
	public WebElement btnNext;
	
	
	public AdminCreateNewsPage(WebDriver driver) {
		
		 PageFactory.initElements(driver, this);
	}

}
