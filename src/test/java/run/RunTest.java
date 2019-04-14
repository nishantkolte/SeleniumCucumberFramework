package run;


import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)

@CucumberOptions(
	features="Features",
	glue={"stepdefination"},
	plugin = { "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:Reports/Extent-Reports/report.html"},
	format = {"pretty","html:Reports/HTML-Reports", "json:Reports/HTML-Reports/defaultreport.json"},
	tags ={"@SmokeFeature"}
)
public class RunTest {
	@BeforeClass
	public static void before(){
		System.out.println("before class executed!!!!");
	}
	   @AfterClass
	    public static void writeExtentReport() {
		   System.out.println("after class executed!!!!");
		   Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+"/Reports/Extent-Reports/config.xml"));
	        
	  
	    }

}
