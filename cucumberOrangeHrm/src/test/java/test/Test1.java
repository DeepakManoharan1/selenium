package test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\Feature\\test.feature"},dryRun = true)

public class Test1 extends AbstractTestNGCucumberTests{

}
