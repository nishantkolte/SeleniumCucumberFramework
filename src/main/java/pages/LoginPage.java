package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//input[@name='userName']")
	public static WebElement Username;
	
	@FindBy (xpath="//input[@name='password']")
	public static WebElement Password;
	
	@FindBy (xpath="//input[@name='login']")
	public static WebElement LoginButton;
	
	@FindBy (xpath="//font[contains(text(),\"Use our Flight Finder\" )]")
	public static WebElement FlightFinderOverview;

	@FindBy (xpath="//input[@name=\"findFlights\"]")
	public static WebElement ContinueButton;
	
}
