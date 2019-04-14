package stepdefination;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import inputdata.Testdata;
import pages.LoginPage;
import utilities.DriverInit;
import utilities.Functions;

public class SmokeTest_step {
	public static WebDriver driver; 
	static int i=1;
	
	@Given("^IBCG2 login page in \"(.*)\" environment is opened in \"(.*)\" web browser$")
	public void ibcg_login_page_is_opened_in_a_web_browser(String env, String browser) throws Throwable {
		try{
			
		initDriver(browser);
	    initTestdata(env);
	    initPages(driver);
	    initFunctions(driver);
	    driver.get(Testdata.url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	   
	   
		
		}
		catch(Exception e){
			e.printStackTrace();
			Functions.takescreenshot("ibcg_login_page_is_opened_in_a_web_browser");
			Reporter.addScreenCaptureFromPath("Screenshots/ibcg_login_page_is_opened_in_a_web_browser.png");
			Assert.fail();
			}
	}

	
	


	@When("^user enters valid username$")
	public void user_enters_valid_username() throws Throwable {
	    
	    try{
	    	Functions.setText(LoginPage.Username, Testdata.username);
	   
		}

		catch(Exception e){
			e.printStackTrace();
			Functions.takescreenshot("user_enters_valid_username");
			Reporter.addScreenCaptureFromPath(System.getProperty("user.dir")+"/Screenshots/user_enters_valid_username.png");
			Assert.fail();
		}
	}

	@And("^user enters valid password$")
	public void user_enters_valid_password() throws Throwable {
		
	    try{
	    	Functions.setText(LoginPage.Password, Testdata.password);
	   
		}

		catch(Exception e){
			e.printStackTrace();
			Functions.takescreenshot("user_enters_valid_password");
			Reporter.addScreenCaptureFromPath(System.getProperty("user.dir")+"/Screenshots/user_enters_valid_password.png");
			Assert.fail();
		}	   
	}

	@And("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	  
	    try{
	    	Functions.click(LoginPage.LoginButton);
	   
		}

		catch(Exception e){
			e.printStackTrace();
			Functions.takescreenshot("user_clicks_on_login_button");
			Reporter.addScreenCaptureFromPath(System.getProperty("user.dir")+"/Screenshots/user_clicks_on_login_button.png");
			Assert.fail();
		}	   	   
	}

	@Then("^user gets logged in successfully and home page is displayed$")
	public void user_gets_logged_in_successfully_and_home_page_is_displayed() throws Throwable {
		
	  
	    try{
	    	Functions.verifyElementDisplayed(LoginPage.FlightFinderOverview);
	  	  Functions.verifyElementDisplayed(LoginPage.ContinueButton);
	    	
		}

		catch(Exception e){
			e.printStackTrace();
			Functions.takescreenshot("user_gets_logged_in_successfully_and_home_page_is_displayed");
			Reporter.addScreenCaptureFromPath(System.getProperty("user.dir")+"/Screenshots/user_gets_logged_in_successfully_and_home_page_is_displayed.png");
			Assert.fail();
		}	
	}
	
	@Then("^error message is displayed on login page$")
	public void error_displayed() throws Throwable {
		try{
			Assert.fail();
		}
		catch(AssertionError e){
			e.printStackTrace();
			Functions.takescreenshot("error_displayed");		
			Reporter.addScreenCaptureFromPath(System.getProperty("user.dir")+"/Screenshots/error_displayed.png");
			Assert.fail();
			}
		catch(Exception e){
			e.printStackTrace();
			Functions.takescreenshot("error_displayed");
			Reporter.addScreenCaptureFromPath(System.getProperty("user.dir")+"/Screenshots/error_displayed.png");
			Assert.fail();
		}
	}
	
	@Then("^Close browser window$")
	public void Close_browser_window() throws Throwable {
	  driver.close();
	}
	
	
	private void initDriver(String browser) {
		DriverInit obj = new DriverInit(browser);
		driver = DriverInit.driver;
		}
	private void initTestdata(String env) {
		Testdata data = new Testdata(env);
		
	}
	private void initPages(WebDriver driver) {
		LoginPage obj3 = new LoginPage(driver);
		
	}
	private void initFunctions(WebDriver driver) {
		Functions obj3 = new Functions(driver);
		
	}

}
