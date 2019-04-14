package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverInit {
public static WebDriver driver;

	public DriverInit(String browser) {
		
		if (browser.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "Drivers/IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			
		}
		else if (browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
			driver= new ChromeDriver();
			
		}
		else if (browser.equalsIgnoreCase("firefox")){
			//System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
			 driver= new FirefoxDriver();
			
		}
		else{
			System.out.println("invalid browser selected");
				
		}

	}

}
