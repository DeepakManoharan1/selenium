package extentreport_demo;
import org.junit.runner.RunWith;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
@CucumberOptions(tags ="",features = "src\\test\\resources\\Feature\\hrm.feature",glue ="extentreport_demo",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},monochrome = true)
public class runnertestng extends AbstractTestNGCucumberTests {
 
}

