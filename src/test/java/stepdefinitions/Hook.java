package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	public static WebDriver driver;
	
	@Before
	public void StartTest() {
		 driver=new ChromeDriver();
		 
		//driver=new FirefoxDriver();
	}

	@After
	public void EndTest() {
	  driver.close();
	}
}
