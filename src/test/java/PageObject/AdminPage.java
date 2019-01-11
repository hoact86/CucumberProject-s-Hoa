package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	
	public WebElement cbbGroup;
	
	public WebElement txtName;
	
	public WebElement txtSubject;
	
	public WebElement txtBody;
	
	public WebElement btnAddFile;
	
	public WebElement btnNext;
	
	
	public AdminPage(WebDriver driver) {
		
		 PageFactory.initElements(driver, this);
	}

}
